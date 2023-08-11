class Predicate {
    public static final TernaryIntPredicate<Integer, Boolean> ALL_DIFFERENT = (a, b, c) -> {
        return a != b && b != c && a != c;
    };

    @FunctionalInterface
    public interface TernaryIntPredicate<T, B> {
        B test(T val1, T val2, T val3);// Write a method here
    }
}
