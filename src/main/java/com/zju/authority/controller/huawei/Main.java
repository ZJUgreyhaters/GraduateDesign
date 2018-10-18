package com.zju.authority.controller.huawei;

/**
 * @ClassName: Main
 * @Description: TODO
 * @Author: wbchen
 * @Date: 2018/9/26 19:01
 * @Version 1.0.0
 **/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //input.useDelimiter(" ");
        ArrayList<Integer> output = new ArrayList<>();

        int flag = 0;
        int countSeq = 0;


        while (input.hasNext()){

            String s = input.next();
            if("".equals(s)){
                break;
            }
            int x = Integer.decode(s);

            if(x == 0x00){
                int seq;
                int typeNum;

                if(input.hasNext()){
                    s = input.next();
                    seq = Integer.decode(s);
                    if (flag == 0){
                        flag = 1;
                        countSeq = seq;
                        if(seq > 15 || seq < 1){
                            System.out.println("FALSE");
                            return;
                        }
                    }
                    if (flag == 1 && (seq > 15 || seq < 1) && (seq - 1) % 15 != countSeq){
                        System.out.println("FALSE");
                        return;
                    }
                }else {
                    System.out.println("FALSE");
                    return;
                }

                if(input.hasNext()){
                    s = input.next();
                    typeNum = Integer.decode(s);
                }else {
                    System.out.println("FALSE");
                    return;
                }
                int[] tmp = new int[16];

                int type = (typeNum & 0xF0) / 16;
                int num = (typeNum & 0x0F);
                for(int i = 0;i<num;i++){
                    if (input.hasNext()){
                        s = input.next();
                        tmp[i] = Integer.decode(s);
                    }else{
                        System.out.println("FALSE");
                        return;
                    }
                }
                Arrays.sort(tmp);
                if(type == 2){
                    for (int i=16-num;i<16;i++){
                        output.add(tmp[i]);
                    }
                }else {
                    for (int i = 15;i >= 16-num;i--){
                        output.add(tmp[i]);
                    }
                }
            }
        }

        for (int i = 0;i< output.size();i++){
            System.out.printf("%x",output.get(i));
        }
    }
}
