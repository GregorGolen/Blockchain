package blockchain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Blockchain {

    private final LinkedList<Block> blocks = new LinkedList<>();
    private int difficulty = 0;
    private final List<Transaction> transactions = new ArrayList<>();

    public Blockchain() {
        Block genesisBlock = new Block(this, 0, new ArrayList<Transaction>());
        genesisBlock.setId(1);
        genesisBlock.setPrevHash("0");
        Transaction minerReward = new Transaction("system", "miner0", 100);
        genesisBlock.addTransaction(minerReward);
        addBlock(genesisBlock);
    }

    public synchronized Block addBlock(Block block) {
        if (blocks.size() < 15) {
            int idAdding = blocks.size() > 0 ? blocks.getLast().getId() + 1 : 1;
            String prevHash = blocks.size() > 0 ? blocks.getLast().getHash() : "0";
            block.setId(idAdding);
            block.setPrevHash(prevHash);
            block.updateTimestamp();
            blocks.add(block);
            return block;
        } else {
            return null;
        }
    }

    public Block getLast() {
        return blocks.getLast();
    }

    public int getDifficulty() {
        return difficulty;
    }

    public boolean isEmpty() {
        return blocks.isEmpty();
    }

    public synchronized String updateDifficulty(long genTime) {
        if (genTime < 15) {
            difficulty++;
            return "N was increased to " + difficulty;
        } else if (genTime > 60) {
            if (difficulty > 0) difficulty--;
            return "N was decreased to " + difficulty;
        } else {
            return "N stays the same";
        }
    }

    public synchronized void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public synchronized List<Transaction> getAndClearTransactions() {
        List<Transaction> currentTransactions = new ArrayList<>(transactions);
        transactions.clear();
        return currentTransactions;
    }

    public boolean validateTransactions(Block block) {
        for (Transaction transaction : block.getTransactions()) {
            String sender = transaction.getFrom();
            if (getBalance(sender) < transaction.getAmount()) {
                return false;
            }
        }
        return true;
    }

    public synchronized int getBalance(String person) {
        int balance = 100;
        for (Block block : blocks) {
            for (Transaction transaction : block.getTransactions()) {
                if (transaction.getFrom().equals(person)) {
                    balance -= transaction.getAmount();
                } else if (transaction.getTo().equals(person)) {
                    balance += transaction.getAmount();
                }
            }
        }
        return balance;
    }

    public boolean isValidTransaction(Transaction transaction) {
        int balance = getBalance(transaction.getFrom());
        return balance >= transaction.getAmount();
    }

    int count = 0;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        blocks.forEach(b -> sb.append(b.toString()).append("\n"));
        count++;
        return sb.toString();
    }


}
