package com.gaw.function_programming;

import java.text.DecimalFormat;
import java.util.function.Function;

/**
 * @author gaopo
 * @date 2019/2/21.
 */
public class Java8 {

    public static void main(String[] args) {

        Function<Integer, String> moneyFormat = integer -> new DecimalFormat("#,###").format(integer);
        System.out.println(moneyFormat.andThen(s -> "adjgla" + s).apply(99999999));



    }

}
