package com.afa.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * 约瑟夫问题
 *
 *  https://baike.baidu.com/item/%E7%BA%A6%E7%91%9F%E5%A4%AB%E9%97%AE%E9%A2%98/3857719?fr=aladdin
 *
 * @author zhou
 */
public class JosephusProblem {
    public static void main(String[] args) {
        int totalNum = 41;
        int cycleNum = 3;
        yuesefu(totalNum, cycleNum);
    }

    public static void yuesefu(int totalNum, int countNum) {
        // 初始化人数
        List<Integer> start = new ArrayList<Integer>();
        for (int i = 1; i <= totalNum; i++) {
            start.add(i);
        }
        //从第K个开始计数
        int k = 0;
        while (start.size() >0) {
            k = k + countNum;
            //第m人的索引位置
            k = k % (start.size()) - 1;
            // 判断是否到队尾
            if (k < 0) {
                System.out.println(start.get(start.size()-1));
                start.remove(start.size() - 1);
                k = 0;
            } else {
                System.out.println(start.get(k));
                start.remove(k);
            }
        }
    }
}