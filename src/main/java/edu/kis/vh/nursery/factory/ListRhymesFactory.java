package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.ListCountingOutRhymer;
import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.listy.IntLinkedList;

public class ListRhymesFactory implements Rhymersfactory {
    @Override
    public defaultCountingOutRhymer GetStandardRhymer() {
        return new ListCountingOutRhymer();
    }

    @Override
    public defaultCountingOutRhymer GetFalseRhymer() {
        return new defaultCountingOutRhymer();
    }

    @Override
    public defaultCountingOutRhymer GetFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public defaultCountingOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer(0);
    }
}
