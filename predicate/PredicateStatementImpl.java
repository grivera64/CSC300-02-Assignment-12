//package assignment12.predicate;

/*
 *
 * Name: PredicateStatementImpl.java
 * Purpose: Trying out primitive Predicate functional
 *          interfaces and dot chaining
 * Author: grivera64
 * Date: 12/6/2021
 *
 */

import java.util.function.IntPredicate;

public class PredicateStatementImpl {

    public static void result(IntPredicate p, int arg) {

        System.out.printf("The Predicate is %b for %s\n", p.test(arg), arg);

    }

    public static void main(String[] args) {

        IntPredicate predicate = (x) -> x < 100;
        IntPredicate ultimatePredicate = predicate.or((x) -> (x & 1) == 1)
                                                  .negate()
                                                  .and((x) -> x > 20);

        for (int testValue = 10; testValue <= 130; testValue += 7) {

            PredicateStatementImpl.result(ultimatePredicate, testValue);

        }

    }

}
