package com.oodles.controller;

import java.io.File;
import java.io.IOException;

import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.wallet.Wallet;

public class WalletGeneration {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		final NetworkParameters netParams = NetworkParameters.testNet();

		Wallet wallet = null;
		final File walletFile = new File("test.wallet");

		try {
			wallet = new Wallet(netParams);

			for (int i = 0; i < 5; i++) {

				wallet.addKey(new ECKey());
			}

			// save wallet contents to disk
			wallet.saveToFile(walletFile);

		} catch (IOException e) {
			System.out.println("Unable to create wallet file.");
		}

		System.out.println("Complete content of the wallet:\n" + wallet);

	}
}
