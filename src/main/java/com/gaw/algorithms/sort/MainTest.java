package com.gaw.algorithms.sort;

import com.gaw.algorithms.sort.compare.HeapSort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author gaopo
 * @date 2019/2/22.
 */
public class MainTest {

    public static void main(String[] args) {
        //int[] source = genRandom(200000, 100000);
        int[] source = {24874, 41480, 39473, 26397, 38238, 24874, 141271, 192078, 138592, 45646, 54185, 199564, 89108, 29772, 4221, 126120, 24157, 18883, 145053, 152794, 13744, 126096};
        long time = System.currentTimeMillis();
        System.out.println(Arrays.toString(source));
        //QuickSort.quickSort(source.length - 1, 0, source);
        //MergeSort.mergeSort(source);
        //InsertSort.insertSort(source);
        HeapSort.execute(source);
        System.out.println("耗时：" + (System.currentTimeMillis() - time) + ":" + Arrays.toString(source));
    }

    private static int[] genRandom(int maxNum, int length) {
        Random random = new Random();
        /*HashSet<Integer> resultSet = new HashSet<>();
        while (resultSet.size() < length) {
            resultSet.add(random.nextInt(maxNum));
        }
        int[] result = new int[length];
        Iterator iterator = resultSet.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            result[i] = (int) iterator.next();
            i++;
        }*/
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = random.nextInt(maxNum);
        }
        return result;
    }
}
