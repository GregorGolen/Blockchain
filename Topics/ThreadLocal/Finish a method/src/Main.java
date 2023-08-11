class UseThreadLocal {
    public static ThreadLocal<Integer> makeThreadLocal(int counter) {
        ThreadLocal<Integer> value = new ThreadLocal<>();
        value.set(counter+1);
        return value;
    }
}
