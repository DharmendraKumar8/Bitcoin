package com.oodles.controller;

import org.bitcoinj.core.Address;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.store.BlockStoreException;

public class KeyGeneration {
	public static void main(String[] args) throws BlockStoreException {
		ECKey key = new ECKey();
		System.out.println("We created key:\n" + key);

		//@SuppressWarnings("deprecation")
		final NetworkParameters netParams = NetworkParameters.testNet();
		//Address addressFromKey = key.toAddress(netParams);
		System.out.println("Public address: " + key.toAddress(netParams).toString());
		System.out.println("Private key: " + key.getPrivateKeyEncoded(netParams).toString());
		//System.out.println("Address on testnet Network:\n" + addressFromKey);
	}
}