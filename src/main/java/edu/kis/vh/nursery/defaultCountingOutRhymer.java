package edu.kis.vh.nursery;

import edu.kis.vh.nursery.listy.IntArrayStack;

public class defaultCountingOutRhymer {
    private IntArrayStack intArrayStack;


    public defaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public static final int INT_TOTAL = -1;
    public static final int ARRAY_SIZE = 12;
    private int[] NUMBERS = new int[ARRAY_SIZE];


    public defaultCountingOutRhymer() {
        intArrayStack=new IntArrayStack();
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean callCheck() {

        return intArrayStack.callCheck();

        return total == INT_TOTAL;

    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int peekaboo() {
        return intArrayStack.peekaboo();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public int[] getNUMBERS() {
        return intArrayStack.getNUMBERS();
    }
}
