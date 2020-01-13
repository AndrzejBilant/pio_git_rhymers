package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.listy.IntArrayStack;
import edu.kis.vh.nursery.listy.IntLinkedList;

public class ListCountingOutRhymer extends defaultCountingOutRhymer {
    private IntLinkedList intLinkedList;

    public ListCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public ListCountingOutRhymer() {
        intLinkedList=new IntLinkedList();
    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
    }

    public int peekaboo() {
        return intLinkedList.top();
    }

    public int countOut() {
        return intLinkedList.pop();
    }
}
