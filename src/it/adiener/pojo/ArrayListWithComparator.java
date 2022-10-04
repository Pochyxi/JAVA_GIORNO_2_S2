package it.adiener.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListWithComparator {
    public static void main( String[] args ) {

        ArrayList<String> words = new ArrayList<>( Arrays.asList( "albero", "mela", "epicode", "java" ) );

        Collections.sort( words, new StringLengthComparator() );
        System.out.println(words);

        ArrayList <Person> people = new ArrayList<>(
                Arrays.asList(
                        new Person( "Albert Einstein", 150 ),
                        new Person( "Nicola Tesla", 124 ),
                        new Person( "Enzo Ferrari", 110 )
                )
        );

        System.out.println("pre ordinamento: " + people);
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare( String o1, String o2 ) {
        int o1L = o1.length();
        int o2L = o2.length();

        if ( o1L > o2L ) {
            return 1;
        } else if ( o1L < o2L ) {
            return -1;
        }

        char o1C = o1.charAt(0);
        char o2C = o2.charAt(0);

        if( o1C < o2C ) {
            return  1;
        } else if ( o1C > o2C ) {
            return -1;
        }

        return 0;
    }
}

