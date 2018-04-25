package com.afa.algorithms;

/**
 * Created by zhou on 2018-04-09.
 */
public class Permutation {
    int count = 0;


    public void permutation(char[] cs, int index) {

        if (index > cs.length) {
            return;
        }
    // 避免重复打印,也可以放进set中解决
        if (index == cs.length) {
            System.out.println(new String(cs));
            count++;
        }

        for (int i = index; i < cs.length; i++) {
            swap(cs, index, i);
            permutation(cs, index + 1);
            // 再次交换，保持原状
            swap(cs, index, i);
        }
    }

    private void swap(char[] cs, int index, int target) {
        char tmp = cs[index];
        cs[index] = cs[target];
        cs[target] = tmp;
    }

    public static void main(String[] args) {
        char[] cs = new char[]{'a', 'b', 'c'};
        Permutation per = new Permutation();
        per.permutation(cs, 0);
        System.out.println("方法总数：" + per.count);
    }

}
