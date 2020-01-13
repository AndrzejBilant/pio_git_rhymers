package edu.kis.vh.nursery.listy;

import edu.kis.vh.nursery.IntArrayStackInterface;

public class IntArrayStack implements IntArrayStackInterface {
    private int[] NUMBERS = new int[12];

    public int total = -1;

    @Override
    public void countIn(int in) {
        if (!isFull())
            getNUMBERS()[++total] = in;
    }

    @Override
    public boolean callCheck() {
        return total == -1;
    }

    @Override
    public boolean isFull() {
        return total == 11;
    }

    public int peekaboo() {
        if (callCheck())
            return 0;
        return getNUMBERS()[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return 0;
        return getNUMBERS()[total--];
    }

    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public int[] getNUMBERS() {
        return NUMBERS;
    }
}
