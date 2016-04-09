package com.nurkiewicz.java8.interfaces;

import java.util.function.Function;

public class ReverseEncrypter implements Encrypter {

	@Override
	public byte[] encode(byte[] bytes) {
		final byte[] result = new byte[bytes.length];
		for (int i = 0; i < bytes.length; ++i) {
			result[i] = (byte) (0xFF - bytes[i]);
		}
		return result;
	}

}
