package designPattern.Adapter;

import static java.util.Arrays.sort;

/**
 * Created by cctv on 2016/12/11.
 */
public class QuickSort {
    public int[] quickSort(int array[]) {
        sort(array,0,array.length-1);
        return array;
    }
}
