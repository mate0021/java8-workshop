package com.nurkiewicz.java8.util;

import java.util.function.LongUnaryOperator;
import java.util.stream.LongStream;

public class PrimeUtil {

	/**
	 * TODO: Try to implement this without loops and if's
	 * @see LongStream#iterate(long, LongUnaryOperator)
	 */
	public static long nextPrimeAfter(long x) {
        return LongStream
                .iterate(x + 1, e -> e + 1)
                .filter(e -> isPrime(e))
                .findFirst()
                .getAsLong();
	}

	/**
	 * TODO: Try to implement this without loops and if's
	 * @see LongStream#range(long, long)
	 */
	public static boolean isPrime(long x) {
        return LongStream
                .range(2, x)
                .noneMatch(l -> x % l == 0);
	}

}
