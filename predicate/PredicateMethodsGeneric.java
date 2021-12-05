//package assignment12.predicate;

/*
 *
 * Name: PredicateMethodsGeneric.java
 * Purpose: Trying predicates using Generics
 * Author: grivera64
 * Date: 12/6/2021
 *
 */

import java.util.function.Predicate;

public class PredicateMethodsGeneric {

    public static <T> void result(Predicate<T> p, T arg) {

        System.out.printf("The Predicate is %b for %s\n", p.test(arg), arg);

    }

    public static void main(String [] args) {

        Predicate<Integer> p1 = (x) -> x == 5;
        for (int x = 4; x < 7; x++) {

            PredicateMethodsGeneric.result(p1, x);
            PredicateMethodsGeneric.result((y) -> y % 2 == 0, x);

        }

        Predicate<String> p3 = (s) -> s.startsWith("H");
        PredicateMethodsGeneric.result(p3, "Hello");
        PredicateMethodsGeneric.result(p3, "Goodbye");

    }

}
