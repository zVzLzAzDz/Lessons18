package by.itstep.vlad.model.logic;

public class Calculator {
    public static int sum(int a, int b) {
        return a + b;

    }

    public static int sub(int a, int b) {
        return a - b;

    }

    public static int mul(int a, int b) {
        for (long i = 0;  i < 10_000_000_000L ; i++);

        return a * b;

    }

    public static int div(int a, int b) {
        return a / b;

    }
}
