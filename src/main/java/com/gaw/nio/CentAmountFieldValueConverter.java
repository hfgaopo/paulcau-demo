package com.gaw.nio;

import java.lang.reflect.Field;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author gaopo
 * @date 2019/3/15.
 */
public class CentAmountFieldValueConverter {

    public void convert(Field field) {


    }

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now().minusMinutes(10);
        Duration duration = Duration.between(localDateTime, LocalDateTime.now());
        System.out.println(duration.toMinutes());
    }
}
