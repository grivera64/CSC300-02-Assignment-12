//package assignment12.operators;

/*
 *
 * Name: ChainedOperators.java
 * Purpose: Tests the use of chaining operations within
 *          a single BinaryOperator lambda expression
 * Author: grivera64
 * Date: 12/6/2021
 *
 */

import java.util.function.IntBinaryOperator;

public class ChainedOperators {

    public static void resultBi(IntBinaryOperator intBinaryOperator, int x, int y) {

        System.out.printf("for the values x = %d and y = %d the result is %d\n",
                x, y, intBinaryOperator.applyAsInt(x, y));

    }

    public static void main(String[] args) {

        IntBinaryOperator intBinaryOperator = (x, y) -> (5 * ((2 * x) + (3 * y))) / 2;

        for (int x = 3; x <= 5; x++) {

            for (int y= 5; y <= 8; y++) {

                ChainedOperators.resultBi(intBinaryOperator, x, y);

            }

        }

    }

}
