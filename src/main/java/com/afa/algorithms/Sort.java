package com.afa.algorithms;

import java.util.Arrays;

/**
 * Created by zhou on 2018-04-04.
 */
public class Sort {
    public static void quickSort(int[] arr, int low, int high) {
        if (arr.length <= 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int left = low;
        int right = high;
        //挖坑1：保存基准的值
        int temp = arr[left];
        while (left < right) {
            //坑2：从后向前找到比基准小的元素，插入到基准位置坑1中
            while (left < right && arr[right] >= temp) {
                right--;
            }
            arr[left] = arr[right];
            //坑3：从前往后找到比基准大的元素，放到刚才挖的坑2中
            while (left < right && arr[left] <= temp) {
                left++;
            }
            arr[right] = arr[left];
        }
        //基准值填补到坑3中，准备分治递归快排
        arr[left] = temp;
        System.out.println("Sorting: " + Arrays.toString(arr));
        quickSort(arr, low, left - 1);
        quickSort(arr, left + 1, high);
    }
    /**
     * 选择排序
     *
     * 1. 从待排序序列中，找到关键字最小的元素；
     * 2. 如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换；
     * 3. 从余下的 N - 1 个元素中，找出关键字最小的元素，重复①、②步，直到排序结束。
     *    仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
     * @param arr  待排序数组
     */
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            //选出之后待排序中值最小的位置
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                //交换操作
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
                System.out.println("Sorting:  " + Arrays.toString(arr));
            }
        }
    }
}

