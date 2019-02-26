package com.gaw.lock.zookeeper;

import com.gaw.init.ZookeeperProperty;
import com.gaw.lock.IBaseTask;
import lombok.extern.slf4j.Slf4j;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * desc 工具类锁
 *
 * @author gaopo
 * @date 2018/12/26.
 */
@Component
@Slf4j
public class LockUtil {

    private final int maxWait = 3000;

    @Resource
    private ZookeeperProperty zookeeperProperty;

    private CuratorFramework client;

    private String lockPath = "/ppdai/tars/gaopo/demo";

    @PostConstruct
    private void init() {
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        CuratorFramework client = CuratorFrameworkFactory.newClient(zookeeperProperty.getCluster(), retryPolicy);
        client.start();
    }

    public void doLockBusiness(IBaseTask baseTask) {
        InterProcessMutex lock = new InterProcessMutex(client, lockPath);
        try {
            if (lock.acquire(maxWait, TimeUnit.MILLISECONDS)) {
                if (baseTask.switchOn()) {
                    baseTask.doBusiness();
                }
            }
        } catch (Exception e) {
            log.error("获取锁失败：{}", e);
        } finally {
            try {
                lock.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
