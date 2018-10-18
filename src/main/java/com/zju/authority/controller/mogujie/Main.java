package com.zju.authority.controller.mogujie;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @ClassName: Main
 * @Description: TODO
 * @Author: wbchen
 * @Date: 2018/9/27 18:50
 * @Version 1.0.0
 **/

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        BigDecimal b1 = new BigDecimal(Double.toString(2.00));
        BigDecimal b2 = new BigDecimal(Double.toString(1.10));
        double re = b1.subtract(b2).doubleValue();
        BigDecimal b3 = new BigDecimal(2.00);
        BigDecimal b4 = new BigDecimal(1.10);
        double re2 = b3.subtract(b4).doubleValue();

        int x = scanner.nextInt()+1;
        int y = scanner.nextInt()+1;

        int[][] map = new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                map[i][j] = 0;
            }
        }
        for(int i=0;i<y;i++){
            map[0][i] = 1;
        }
        for(int i=0;i<x;i++){
            map[i][0] = 1;
        }
        for(int i=1;i<x;i++){
            for(int j=1;j<y;j++){
                map[i][j] = map[i-1][j] + map[i][j-1];
            }
        }
        System.out.println(map[x-1][y-1]);
    }
}
