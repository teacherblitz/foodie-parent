package com.teacherblitz;

import java.util.Arrays;

/**
 * @author: teacherblitz
 * @since: 2020/5/19
 */
public class FunctionTest extends Object{

    public static int fun(Integer a1, Integer a2 , Integer a3, Bi<Integer,Integer,Integer> b){
        return b.apply(a1,a2,a3);
    }

    public static void main(String[] args) {
//        Bi<Integer,Integer,Integer> b1 = (a,b,c) -> a +b +c;
//        System.out.println(fun(1,2,3,b1));

    }

    @FunctionalInterface
    interface Bi<R1,R2,R3>{
        int apply(R2 a,R1 a1 ,R3 a2);
    }
}
