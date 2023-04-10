package Stresm流;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class Demo03 {
    public static void main(String[] args) {
        String[] str = {"a", "b", "c"};
        int[] x = {1, 2, 3, 4, 5};
        Arrays.stream(x).forEach(s-> System.out.println(s));
        Arrays.stream(str).forEach(a-> System.out.println(a));
        Stream.of(2,"sd",3).forEach(b -> System.out.println(b));
    }
}
