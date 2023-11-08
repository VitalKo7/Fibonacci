package fibonacci.model;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int quantity;
    private int prev;
    private int prePrev;
    private int counter;

    // сколько всего чисел - надо знать
    public FibonacciIterator(int quantity) {
        this.quantity = quantity;
        prev = 1;
        prePrev = 1;
        counter = 1;
    }

    @Override
    public boolean hasNext() {
        return counter <= quantity;
    }

    // надо знать только 2 предыдущие числа
    // вычислил следующее число, перезаписал ряд
    @Override
    public Integer next() {
        if (counter++ <= 2) {
            return 1;
        }
        int curr = prePrev + prev;
        prePrev = prev;
        prev = curr;
        return curr;
    }
}


