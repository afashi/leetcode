package com.afa.algorithms;


import org.junit.Test;

/**
 * Created by zhou on 2017-05-12.
 */
public class TwoSumTest {
    @Test
    public void twoSum() throws Exception {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        System.out.println(result[0]+","+result[1]);
    }

}