package fibonacci;

import fibonacci.model.Fibonacci;

public class FibonacciAppl {
    public static void main(String[] args) {
        // todo: print all numbers (8 items) and calculate the sum;

        int quantity = 1;

        Fibonacci fibonacci = new Fibonacci(quantity);
        int sum = 0;

        for (Integer num : fibonacci) {
            sum += num;
            System.out.println(num);
        }

        System.out.println("Сумма первых " + quantity + " элементов: " + sum);
    }
}

// 1,1,2,3,5,8,13,21
// sum = 54;

// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946,
