package com.zju.authority.controller.huawei;

import java.util.Scanner;

/**
 * @ClassName: test
 * @Description: TODO
 * @Author: wbchen
 * @Date: 2018/9/26 19:40
 * @Version 1.0.0
 **/

public class test {

}

class Main1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String eng = input.nextLine().toUpperCase();

        int[] count = new int[26];

        for(int i=0;i<eng.length();i++){
            if(eng.charAt(i) >= 'A' && eng.charAt(i) <= 'Z'){
                count[(int)(eng.charAt(i) - 'A')]++;
            }
        }
        int max = -1;
        int index = -1;
        for(int i=0;i<26;i++){
            if(count[i] > max){
                index = i;
                max = count[i];
            }else if(count[i] == max){
                index = eng.indexOf(i+'A') < eng.indexOf(index+'A') ? i : index;
            }
        }

        System.out.println((char)(index + 'A') + "" + max);
    }
}