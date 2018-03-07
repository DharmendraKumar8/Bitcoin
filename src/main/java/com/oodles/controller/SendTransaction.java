/*package com.oodles.controller;

import java.io.File;
import java.math.BigInteger;
import java.net.InetAddress;

import org.bitcoinj.core.BlockChain;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.core.Peer;
import org.bitcoinj.core.PeerAddress;
import org.bitcoinj.store.BlockStore;
import org.bitcoinj.store.MemoryBlockStore;
import org.bitcoinj.wallet.Wallet;

public class SendTransaction {
	public static void main(String[] args) {
	
	       String network          = "test";
	        String walletFileName   = "test.wallet";
	        String amountToSend     = "2000000";
	        String recipient        = "13RwREqwoNhVkcbpKSUMg9Ea6JnNuy85Qz";
	
	       	        final NetworkParameters netParams=NetworkParameters.testNet();
	        
	     
	        
	        BlockStore blockStore = new MemoryBlockStore(netParams);
	
	       
	        BlockChain chain;
	        
	        
	        Wallet wallet;
	        
	        try {
	            
	           
	            final File walletFile = new File("test.wallet");
	
	          
	            wallet = Wallet.loadFromFile(walletFile);
	            
	            
	            BigInteger btcToSend = new BigInteger(amountToSend);
	                    
	            
	            chain = new BlockChain(netParams, wallet, blockStore);
	
	          
	          
	            final Peer peer = new Peer( new PeerAddress(InetAddress.getLocalHost());
	
	            
	            peer.connect();
	           
	            // recipient address provided by official Bitcoin client
	
	                       Address recipientAddress = new Address(netParams, recipient);
	
	            // tell peer to send amountToSend to recipientAddress
            Transaction sendTxn = wallet.sendCoins(peer, recipientAddress, btcToSend);
            
            // null means we didn't have enough Bitcoins in our wallet for the transaction
            if (sendTxn == null) {
                System.out.println("Cannot send requested amount of " + Utils.bitcoinValueToFriendlyString(btcToSend)
                                + " BTC; wallet only contains " + Utils.bitcoinValueToFriendlyString(wallet.getBalance()) + " BTC.");
            } else {
                           // once communicated to the network (via our local peer),
                // the transaction will appear on Bitcoin explorer sooner or later
	                System.out.println(Utils.bitcoinValueToFriendlyString(btcToSend) + " BTC sent. You can monitor the transaction here:\n"
	                                + "http://blockexplorer.com/tx/" + sendTxn.getHashAsString());
	            }
	
	           // save wallet with new transaction(s)
	            wallet.saveToFile(walletFile);
	
	        // handle the various exceptions; this needs more work
	        } catch (BlockStoreException e) {
	            e.printStackTrace();
	        } catch (UnknownHostException e) {
	            e.printStackTrace();
	        } catch (PeerException e) {
	            e.printStackTrace();
	        } catch (AddressFormatException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
*/