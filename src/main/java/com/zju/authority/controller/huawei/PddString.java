package com.zju.authority.controller.huawei;

import java.util.BitSet;
import java.util.Scanner;

/**
 * @ClassName: PddString
 * @Description: TODO
 * @Author: wbchen
 * @Date: 2018/10/11 11:38
 * @Version 1.0.0
 **/

/**
 * 拼多多笔试题
 * sample input: 10101111
 * sample output: 5
 * 最大回文串是：10101
 */

public class PddString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();//0-1 sequence
        int len = str.length();

        BitSet set = new BitSet(len);
        BitSet reverseset = new BitSet(len);

        for(int i = 0;i < len;i++){
            if(str.charAt(i) == '1'){
                set.set(i);
                reverseset.set(len - i - 1);
            }
        }

        int left = singleDirection(set, reverseset, len);
        int right = singleDirection(reverseset, set, len);
        System.out.println(left > right ? left : right);
    }
    public static int singleDirection(BitSet set, BitSet reverseset, int len){
        BitSet tmp, tmpre;
        int max = 0;
        int index;
        for(int i = 0;i < len;i++){
            tmp = set.get(0,len - i);
            tmpre = reverseset.get(i,len);
            tmp.xor(tmpre);

            index = tmp.nextSetBit(0);
            if(index == -1){
                if(len - i + 1 > max){
                    max = len - i;
                }
                continue;
            }else{
                if(index > max){
                    max = index;
                }
            }
            lable:
            while (index != -1){
                int tmpIndex = tmp.nextSetBit(index + 1);
                if(tmpIndex == -1){
                    tmpIndex = len - i;
                    if(tmpIndex - index - 1 > max){
                        max = tmpIndex - index - 1;
                    }
                    break lable;
                }else{
                    if(tmpIndex - index - 1> max){
                        max = tmpIndex - index - 1;
                    }
                    index = tmpIndex;
                }
            }
        }

        return max;
    }
}
