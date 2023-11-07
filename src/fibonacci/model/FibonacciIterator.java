package fibonacci.model;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciIterator implements Iterator<Integer> {
    private int[] fibonacci;
    private int counter;
    private int sum;

    // сколько всего чисел - надо знать

    public FibonacciIterator(int capacity) {
        fibonacci = new int[capacity];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        counter = 0;
        sum = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < fibonacci.length;
    }

    // надо знать только 2 предыдущие числа
    // вычислил следующее число, перезаписал ряд
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        sum += fibonacci[counter++];
        return fibonacci[counter - 1];
    }

    public int getSum() {
        return sum;
    }
}


