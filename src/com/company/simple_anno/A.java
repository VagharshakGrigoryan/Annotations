package com.company.simple_anno;

import java.lang.annotation.*;

@MyAnnotation2("World")
@MyAnnotation2("World")
public class A {
    public void print() {
        System.out.println("A");
    }
}

@Deprecated
class B extends A {
    @Deprecated
    private int i;

    @Deprecated
    @Override
    public void print() {
        System.out.println("B");

    }

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }
}

@Documented
@Inherited
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

//    String value();

    MyAnnotation2[] value();

    String str() default "Hello";

    int i() default 10 + 10;

    enum MyEnum {
        BLACK, GREEN, WHITE
    }


}

@Repeatable(MyAnnotation.class)//java 8
@interface MyAnnotation2 {
    String value();
}

//@FunctionalInterface
interface myOwnInterface {
    int i();
}