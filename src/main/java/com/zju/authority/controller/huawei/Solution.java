package com.zju.authority.controller.huawei;

import java.util.Scanner;

/**
 * @ClassName: Solution
 * @Description: TODO
 * @Author: wbchen
 * @Date: 2018/9/26 15:48
 * @Version 1.0.0
 **/

public class Solution {
    /**
     * 交换数组里n和0的位置
     *
     * @param array
     *            数组
     * @param len
     *            数组长度
     * @param n
     *            和0交换的数
     */
    // 不要修改以下函数内容
    public void swapWithZero(int[] array, int len, int n) {
        //Main.SwapWithZero(array, len, n);
    }
    // 不要修改以上函数内容


    /**
     * 通过调用swapWithZero方法来排
     *
     * @param array
     *            存储有[0,n)的数组
     * @param len
     *            数组长度
     */
    public void sort(int[] array, int len) {
        // 完成这个函数
        for (int i=0;i < len;i++){
            swapWithZero(array,len-i,array[len-i-1]);
            int tmp = 0;
            for (int j=0;j<len-i-1;j++) {
                if(array[j] > tmp) {
                    tmp = array[j];
                }
            }
            swapWithZero(array,len-i,tmp);
        }
    }
}
