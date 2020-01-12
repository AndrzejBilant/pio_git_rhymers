package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            getNUMBERS()[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return getNUMBERS()[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return getNUMBERS()[total--];
    }

    public int getTotal() {
        return total;
    }

    public int[] getNUMBERS() {
        return NUMBERS;
    }
}
