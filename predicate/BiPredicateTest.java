//package assignment12.predicate;

/*
 *
 * Name: BiPredicateTest.java
 * Purpose: Tests the use of the BiPredicate functional
 *          interface with Generics
 * Author: grivera64
 * Date: 12/6/2021
 *
 */

import java.util.function.BiPredicate;

public class BiPredicateTest {

    public static <T, U> void resultBi(BiPredicate<T, U> biPredicate, T arg1, U arg2) {

        System.out.printf("The BiPredicate is %b for %s and %s\n", biPredicate.test(arg1, arg2), arg1, arg2);

    }

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> biPredicate = (arg1, arg2) -> arg1 <= arg2;

        for (int arg1 = 1; arg1 <= 4; arg1++) {

            for (int arg2 = 1; arg2 <= 4; arg2++) {

                BiPredicateTest.resultBi(biPredicate, arg1, arg2);

            }

        }

    }

}
