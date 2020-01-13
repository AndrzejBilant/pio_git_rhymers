package edu.kis.vh.nursery;

import edu.kis.vh.nursery.listy.IntArrayStack;

/**
 *
 */
public class FIFORhymer extends defaultCountingOutRhymer {

    public IntArrayStack temp = new IntArrayStack();

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
//na szczycie hierarchi jest IntArrayStack, więc dlatego ta klasa dla atrybutu temp