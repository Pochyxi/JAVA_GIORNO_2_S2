package it.adiener.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main( String[] args ) {

        HashMap<String, String> m1 = new HashMap<>();
        m1.put( "name", "Luigi" );
        m1.put( "lastname", "Verdi" );
        m1.put( "role", "Developer" );

        for( Map.Entry set : m1.entrySet() ) {
            System.out.println( set.getKey() + " -> " + set.getValue() );
        }

        System.out.println( m1.values() );

        System.out.println( m1.get( "name" ) + " " + m1.get( "lastname" ) );

        HashMap<String, ArrayList<Integer>> student1 = new HashMap<>();

        student1.put( "java", new ArrayList<>( Arrays.asList( 8, 9, 10 ) ) );
        student1.put( "php", new ArrayList<>( Arrays.asList( 5, 6, 4 ) ) );
        student1.put( "html", new ArrayList<>( Arrays.asList( 8, 2, 6 ) ) );

        for( Map.Entry set : student1.entrySet() ) {
            System.out.println( set.getKey() + " -> " + set.getValue() );
        }

        EpicodeStudent s1 = new EpicodeStudent( "peach", student1 );
        System.out.println( "la media di java è: " + s1.media( "php" ) );
        System.out.println( "la media di java è: " + s1.media( "java" ) );
    }
}

class EpicodeStudent {
    String name;
    HashMap<String, ArrayList<Integer>> ratings = new HashMap<>();

    EpicodeStudent( String name, HashMap<String, ArrayList<Integer>> ratings ) {
        this.name = name;
        this.ratings = ratings;
    }

    double media( String topic ) {
        double sum = 0;
        double l = 0;

        for( Map.Entry set : this.ratings.entrySet() ) {
            ArrayList<Integer> r = ( ArrayList<Integer> ) set.getValue();
            if( topic.equals( set.getKey() ) ) {
                l = r.size();
                for( Integer rate : r ) {
                    sum += l;
                }
            }
        }

        return sum;
    }
}