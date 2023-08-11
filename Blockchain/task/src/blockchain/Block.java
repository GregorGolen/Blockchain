package blockchain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Block {

    private int id;
    private long timestamp;

    private String prevHash;
    private String hash;
    private String magic;
    private final long generationTime;
    private final Blockchain blockchain;
    private final int minerId;
    private final int difficulty;
    private final String adjustmentMessage;

    private List<Transaction> transactions = new ArrayList<>();

    public List<Transaction> getTransactions() {
        return transactions;
    }


    public Block(Blockchain blockchain, int minerId, List<Transaction> transactions) {
        this.blockchain = blockchain;
        this.minerId = minerId;
        this.transactions = transactions;
        String zeros = "0".repeat(blockchain.getDifficulty());
        this.difficulty = blockchain.getDifficulty();
        timestamp = new Date().getTime();
        do {
            magic = Integer.toString((int) (Math.random() * 1_000_000_000));
            hash = StringUtil.applySha256(id + timestamp + prevHash + magic);
        } while (!hash.startsWith(zeros));
        generationTime = (new Date().getTime() - timestamp) / 1000;
        adjustmentMessage = blockchain.updateDifficulty(generationTime);
    }

    public int getId() {
        return id;
    }

    public String getHash() {
        return hash;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrevHash(String prevHash) {
        this.prevHash = prevHash;
    }

    public synchronized void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void updateTimestamp() {
        this.timestamp = new Date().getTime();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Block:%nCreated by: miner%d%nminer%d gets 100 VC%nId: %d%nTimestamp: %d%nMagic number: %s%n" +
                        "Hash of the previous block:%n%s%nHash of the block:%n%s%n",
                minerId, minerId, id, timestamp, magic, prevHash, hash));

        sb.append("Block data:");

        if (transactions.isEmpty()) {
            sb.append(" No transactions\n");
        } else {
            sb.append("\n");
            for (Transaction transaction : transactions) {
                sb.append(transaction.toString()).append("\n");
            }
        }

        sb.append(String.format("Block was generating for %d seconds%n", generationTime));
        sb.append(adjustmentMessage).append("\n");

        return sb.toString();
    }

}


