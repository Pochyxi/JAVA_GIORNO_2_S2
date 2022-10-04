package it.adiener.pojo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main( String[] args ) {

        PriorityQueue<Integer> q1 = new PriorityQueue<>( 10, new Q1Comparator());
        q1.add(10);
        q1.add(29);
        q1.add(48);
        q1.add(71);
        q1.add(36);

        while( q1.size() != 0 ) {
            System.out.println( q1.poll() );
        }
    }
}

class Q1Comparator implements Comparator<Integer> {
    @Override
    public int compare( Integer o1, Integer o2 ) {
        if ( o1 > o2 ) return 1;
        else if ( o1 < o2 ) return -1;
        return 0;
    }
}

