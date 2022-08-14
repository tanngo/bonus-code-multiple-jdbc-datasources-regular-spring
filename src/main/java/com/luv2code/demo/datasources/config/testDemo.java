package com.luv2code.demo.datasources.config;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnnotation {
    int value() default 0;
}

@MyAnnotation(value = 10)
public class testDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        printAll(list);
    }


    public static void printAll(List<?> list)  {
        for (Object o : list) {
            System.out.println(String.format(o.toString(), " "));
        }
    }
}
