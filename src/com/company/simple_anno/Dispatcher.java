package com.company.simple_anno;

import com.company.simple_anno.annotation.MethAnnotation;
import com.company.simple_anno.handler.MathHandler;

import java.lang.reflect.Method;

public class Dispatcher {
    public static void main(String[] args) {
        MathHandler mathHandler = new MathHandler();
        Class<?> aClass = mathHandler.getClass();
        try {
            Method m = aClass.getDeclaredMethod("addTwoNumbers", int.class, int.class);
            MethAnnotation methAnnotation = m.getAnnotation(MethAnnotation.class);
            mathHandler.addTwoNumbers(methAnnotation.num1(), methAnnotation.num2());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
