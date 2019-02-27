package com.gaw.algorithms.sort.compare;

/**
 * @author gaopo
 * @date 2019/2/26.
 */
public class HeapSort {

    /**
     * 堆排序，最大堆：父节点始终大于子节点 左子节点位置=2*父节点位置+1,右子节点位置=2*( 父节点位置+1)
     */
    private static int len;

    public static void execute(int[] source) {
        len = source.length;
        for (int i = 1; i < source.length; i++) {
            heapSort(source);
            len--;
            swap(source, source.length - i, 0);
        }
    }

    public static void heapSort(int[] source) {
        for (int i = len / 2 - 1; i >= 0; i--) {
            heapVerify(source, i);
        }
    }

    private static void heapVerify(int[] source, int current) {
        int left = 2 * current + 1;
        int right = left + 1;
        int lagest = current;
        if (left < len && source[left] > source[lagest]) {
            lagest = left;
        }
        if (right < len && source[right] > source[lagest]) {
            lagest = right;
        }
        if (lagest != current) {
            swap(source, current, lagest);
            heapVerify(source, lagest);
        }
    }

    private static void swap(int[] source, int current, int lagest) {
        int temp = source[current];
        source[current] = source[lagest];
        source[lagest] = temp;
    }


}
