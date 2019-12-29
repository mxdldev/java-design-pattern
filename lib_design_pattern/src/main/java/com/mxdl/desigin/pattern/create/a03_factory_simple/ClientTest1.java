package com.mxdl.desigin.pattern.create.a03_factory_simple;

import java.util.Scanner;

/**
 * Description: <实现一个计算器程序><br>
 * Author:      mxdl<br>
 * Date:        2019/12/18<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 * <ul>
 *     该程序存在的问题：
 *     <li>1.不易维护</li>
 *     <li>2.不易扩展</li>
 *     <li>3.不易复用</li>
 *     <li>4.灵活性差</li>
 * </ul>
 */
public class ClientTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入参数a:");
        int a = scanner.nextInt();
        System.out.println("请输入操作类型如：+，-，*，/");
        String action = scanner.next();
        System.out.println("请输入参数b:");
        int b = scanner.nextInt();
        int c = 0;
        switch (action){
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;
        }
        System.out.println("计算结果：c = "+ c);
    }
}
