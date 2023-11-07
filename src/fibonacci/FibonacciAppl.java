package fibonacci;

import java.util.Arrays;

public class FibonacciAppl {
    public static void main(String[] args) {
        // todo: print all numbers (8 items) and calculate the sum;
        int[] fibonacci = new int[8];
        int count = 0;
        fibonacci[count] = 1; // count = 0
        fibonacci[count + 1] = 1; // count = 1

        int sum = 0;
        sum = fibonacci[count] + fibonacci[count + 1];

        for (count = 2; count < fibonacci.length; count++) {
            fibonacci[count] = fibonacci[count - 2] + fibonacci[count - 1];
            sum += fibonacci[count];
        }

        System.out.println(Arrays.toString(fibonacci));
        System.out.println(fibonacci.length);
        System.out.println(sum);
    }
}

// 1,1,2,3,5,8,13,21
// sum = 54;

// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946,
