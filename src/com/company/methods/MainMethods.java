package com.company.methods;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MainMethods {
    public static void main(String[] args) {
        try {
            AnotherDog dog = new AnotherDog();
            Class<?> cl = dog.getClass();
            Annotation[] classAnnotation = cl.getAnnotations();

            System.out.println(dog.getClass().getName() + "\nAnnotation");
            for (Annotation annotation : classAnnotation) {
                System.out.println("\t" + annotation);

                Method[] classMethods = cl.getMethods();
                System.out.println("Method annotation: ");
                for (Method method : classMethods) {
                    Annotation[] methodAnnotations = method.getAnnotations();
                    if (methodAnnotations.length > 0) {
                        System.out.println("\t" + method.getName() + "():");
                    }
                    for (Annotation annotations : methodAnnotations) {
                        System.out.println("\t" + annotations);

                    }
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
