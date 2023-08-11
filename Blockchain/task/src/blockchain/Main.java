package blockchain;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Blockchain blockchain = new Blockchain();
        Miner[] miners = new Miner[15];
        for (int i = 0; i < miners.length; i++) {
            miners[i] = new Miner(blockchain, i + 1);
            miners[i].start();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Miner miner : miners) {
            miner.interrupt();
        }
        System.out.println(blockchain);
    }
}

