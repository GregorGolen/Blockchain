class MessageNotifier extends Thread {

    String msg;
    int repeats;

    public MessageNotifier(String msg, int repeats) {
        this.msg = msg;
        this.repeats = repeats;
    }

    @Override
    public void run() {
        if(repeats > 0) {
            for(int i = 0; i < repeats; i++) {
                System.out.println(msg);
            }
        }
    }
}