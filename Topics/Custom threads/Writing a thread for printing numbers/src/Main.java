class NumbersThread extends Thread {

    private int from;
    private int to;

    public NumbersThread(int from, int to) {
       this.from = from;
       this.to = to;
    }

    @Override
    public void run() {
        if(from == to) {
            System.out.println(from);
        } else if (from < to) {
            for (int i = from; i <= to; i++) {
                System.out.println(i);
            }
        }
    }
}
