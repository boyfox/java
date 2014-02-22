package com.smsoft.nio.utils;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public class ByteUtil {

	public byte[] intToByteArray(int i) {
		return ByteBuffer.allocate(4).putInt(i).array();
	}
	
	public int byteArrayToInt(byte[] byteArray) throws BufferUnderflowException {
		return ByteBuffer.wrap(byteArray).getInt();
	}
	
	public byte[] longToByteArray(long l) {
		return ByteBuffer.allocate(8).putLong(l).array();
	}
	
	public long byteArrayToLong(byte[] byteArray) throws BufferUnderflowException {
		return ByteBuffer.wrap(byteArray).getLong();
	}
}
