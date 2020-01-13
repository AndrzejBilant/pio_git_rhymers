package edu.kis.vh.nursery;

import edu.kis.vh.nursery.listy.IntArrayStack;

public class defaultCountingOutRhymer {
    private IntArrayStack intArrayStack;

    public defaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public defaultCountingOutRhymer() {
        intArrayStack=new IntArrayStack();
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean callCheck() {
        return intArrayStack.callCheck();
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
