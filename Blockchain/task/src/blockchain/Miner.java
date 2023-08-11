package blockchain;

import java.security.*;
import java.util.ArrayList;
import java.util.Random;

class Miner extends Thread {
    private final Blockchain blockchain;
    private final int minerId;

    public Miner(Blockchain blockchain, int minerId) throws NoSuchAlgorithmException {
        this.blockchain = blockchain;
        this.minerId = minerId;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            String prevHash = blockchain.getLast().getHash();
            Block newBlock = new Block(blockchain, minerId, new ArrayList<>());

            newBlock.addTransaction(new Transaction("System", "miner" + minerId, 100));

            Transaction randomTransaction = generateRandomTransaction();
            if (blockchain.isValidTransaction(randomTransaction)) {
                newBlock.addTransaction(randomTransaction);
            }

            blockchain.addBlock(newBlock);
        }
    }

    private Transaction generateRandomTransaction() {
        String to = "miner" + new Random().nextInt(10);
        int amount = new Random().nextInt(50);

        return new Transaction("miner" + minerId, to, amount);
    }

}



