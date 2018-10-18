package com.zju.authority.controller.mogujie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName: Dic
 * @Description: TODO
 * @Author: wbchen
 * @Date: 2018/9/27 19:40
 * @Version 1.0.0
 **/

public class Dic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] dic = scanner.nextLine().trim().substring(6).split(",");

        for(int i=0;i<dic.length;i++){
            dic[i] = dic[i].substring(1,dic[i].length()-1);
        }

        Map<Integer, List<String>> ans = new HashMap<>();

        while(s.length() > 0){
            for(int i=0;i<dic.length;i++){

            }
        }

        return;
    }
}
