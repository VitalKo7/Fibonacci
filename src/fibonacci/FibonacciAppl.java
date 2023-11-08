package fibonacci;

import fibonacci.model.Fibonacci;
import fibonacci.model.FibonacciIterator;

public class FibonacciAppl {
    public static void main(String[] args) {
        // todo: print all numbers (8 items) and calculate the sum;

        Fibonacci fibonacci = new Fibonacci(2);
//        System.out.println(fibonacci.getQuantity());
        FibonacciIterator iterator = new FibonacciIterator(fibonacci.getQuantity());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Сумма первых " + fibonacci.getQuantity() + " элементов: " + iterator.getSum());
    }
}

// 1,1,2,3,5,8,13,21
// sum = 54;

// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946,
