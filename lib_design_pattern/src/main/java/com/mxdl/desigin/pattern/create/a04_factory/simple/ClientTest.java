package com.mxdl.desigin.pattern.create.a04_factory.simple;

import java.util.Scanner;

/**
 * Description: <ClientTest><br>
 * Author:      mxdl<br>
 * Date:        2019/12/18<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class ClientTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入参数a:");
        int a = scanner.nextInt();
        System.out.println("请输入操作类型如：+，-，*，/");
        String operate = scanner.next();
        System.out.println("请输入参数b:");
        int b = scanner.nextInt();

        Operation operation = SimpleFactory.createOperation(operate);
        if(operation != null){
            int calculate = operation.calculate(a, b);
            System.out.println("计算结果："+calculate);
        }else{
            System.out.println("操作符输入非法");
        }
    }
}
