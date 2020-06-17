package day03;

import java.util.Scanner;

/**
 * @Author: Rwenjie
 * @ProjectName: HomeWork
 * @Description:
 * @Date: 2020/6/17   10:47
 **/
public  class HomeWork {

    public static void main(String[] args) {
        //打印99乘法表
        printf1();
        //打印等腰三角形
        printf2();
    }
    private static void printf1() {
        for(int i=1; i<=9; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }

    private static void printf2() {
        int n = 10;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
