package com.gaw;

import java.util.ArrayList;
import java.util.List;

/**
 * desc 测试
 *
 * @author gaopo
 * @date 2018/12/29.
 */
public class GSTest {

    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("1");
        sList.add("2");
        sList.add("3");
        sList.add("4");
        sList.add("5");
        sList = sList.subList(0, 3);
        System.out.println(sList.toArray().length);
    }

}
