package com.zju.authority.controller.huawei;

import java.util.Scanner;

/**
 * @ClassName: CountCharNum1
 * @Description: TODO
 * @Author: wbchen
 * @Date: 2018/9/27 10:51
 * @Version 1.0.0
 **/

public class CountCharNum1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //输入输出有问题
        String str = scanner.nextLine();
        String[] strings = str.trim().toLowerCase().split(" ");
        String test = strings[0];
        char target;
        if (strings.length == 1){
            target = ' ';
        }else {
            target = strings[1].charAt(0);
        }

        int count = 0;
        for (int i = 0;i < test.length();i++){
            if (target == test.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
