package com.company.simple_anno.handler;

import com.company.simple_anno.annotation.MethAnnotation;

public class MathHandler {
    @MethAnnotation(num1 = 10,num2 = 20)
    public void addTwoNumbers(int num1,int num2){
        System.out.println(num1+num2);
    }
}
