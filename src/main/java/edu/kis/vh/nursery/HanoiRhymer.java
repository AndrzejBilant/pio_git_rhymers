package edu.kis.vh.nursery;

import edu.kis.vh.nursery.listy.IntArrayStack;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;

    public HanoiRhymer(IntArrayStack intArrayStack, int totalRejected) {
        super(intArrayStack);
        this.totalRejected = totalRejected;
    }

    public HanoiRhymer(int totalRejected) {
        this.totalRejected = totalRejected;
    }

    public HanoiRhymer() {

    }


    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//błędy w liniach 5,12,14,15
//alt + strzałka przełącza karty z plikami