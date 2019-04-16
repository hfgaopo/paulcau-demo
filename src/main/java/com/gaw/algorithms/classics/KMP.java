package com.gaw.algorithms.classics;

/**
 * @author gaopo
 * @date 2019/3/19.
 */
public class KMP {


    public static void execute() {

    }

    public static int[] getNext(String ps) {

        char[] p = ps.toCharArray();

        int[] next = new int[p.length];

        next[0] = -1;

        int j = 0;

        int k = -1;

        while (j < p.length - 1) {

            if (k == -1 || p[j] == p[k]) {

                next[++j] = ++k;

            } else {

                k = next[k];

            }

        }

        return next;

    }


}
