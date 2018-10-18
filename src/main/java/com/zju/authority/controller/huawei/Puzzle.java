package com.zju.authority.controller.huawei;

import java.util.Scanner;

/**
 * @ClassName: Puzzle
 * @Description: TODO
 * @Author: wbchen
 * @Date: 2018/9/27 14:03
 * @Version 1.0.0
 **/

public class Puzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] map = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map[i][j] = scanner.nextInt();
            }
        }

        int i;




        return;
    }
}
