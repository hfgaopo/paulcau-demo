package com.gaw.demo.init;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * desc 初始化配置
 *
 * @author gaopo
 * @date 2018/12/26.
 */
@ConfigurationProperties(prefix = "local.zookeeper")
@Data
@Component
public class ZookeeperProperty {

    private String cluster;
}
