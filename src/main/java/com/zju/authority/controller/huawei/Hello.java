package com.zju.authority.controller.huawei;

import java.util.stream.IntStream;

/**
 * @ClassName: Hello
 * @Description: TODO
 * @Author: wbchen
 * @Date: 2018/10/2 13:29
 * @Version 1.0.0
 **/

class A{

    static{
        System.out.print("1");
    }

    public A(){
        System.out.print("2");
    }
}

class B extends A{

    static{
        System.out.print("a");
    }

    public B(){
        System.out.print("b");
    }
}

public class Hello {

    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
        if(test() == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
        int x = IntStream.range(1, 20).filter(m -> m < 10).sum();

        Thread thread = new Thread();
        thread.start();
        thread.run();

    }



    public static int test() {
        try{
//            int x = 1 / 0;
//            int y = 1;

            return 1;

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
        return 0;
    }

}
