class SimpleCounter {
    private static final SimpleCounter instance = new SimpleCounter();
    private SimpleCounter() {};
    public static SimpleCounter getInstance() {
        return instance;
    }
    public int counter;
}
