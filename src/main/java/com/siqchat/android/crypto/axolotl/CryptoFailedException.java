package com.siqchat.android.crypto.axolotl;

public class CryptoFailedException extends Exception {
	public CryptoFailedException(Exception e){
		super(e);
	}
}
