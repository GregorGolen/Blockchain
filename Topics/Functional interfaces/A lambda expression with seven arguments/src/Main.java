
class Seven {
    public static SeptenaryStringFunction fun = (v1, v2, v3, v4, v5, v6, v7) ->
            v1.concat(v2)
            .concat(v3)
            .concat(v4)
            .concat(v5)
            .concat(v6)
            .concat(v7)
            .toUpperCase();
}

@FunctionalInterface
interface SeptenaryStringFunction {
    String apply(String s1, String s2, String s3, String s4, String s5, String s6, String s7);
}
