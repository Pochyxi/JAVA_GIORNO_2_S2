package Esercizio;

import java.util.*;

public class Main {
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> numList = new LinkedList<>();
        System.out.println("Inserisci 4 valori");

        for( int i = 0; i < 4; i++ ) {
            int x;

            try {
                x = Integer.parseInt( scanner.nextLine() );
                numList.add( x );
            } catch( NumberFormatException e ) {
                System.out.println("Non sono accettati valori stringa");
                i--;
            }
        }
        System.out.println(numList);
        Collections.sort(numList, new Min());
        System.out.println(numList);

        while( numList.size() != 0 ) {
            System.out.println( numList.poll() );
        }

        scanner.close();

        System.out.println("-------------EX2-----------------");

        Item item = new Item("MioArray", new ArrayList<Integer>(Arrays.asList(66, 33, 57, 99)));
        Item item2 = new Item("MioArray2", new ArrayList<Integer>(Arrays.asList(66, 356, 573, 9)));
        Item item3 = new Item("MioArray3", new ArrayList<Integer>(Arrays.asList(6, 23, 17, 999)));
        System.out.println(item.getBestValue());

        System.out.println("--------------EX3------------------");

        PriorityQueue<Item> items = new PriorityQueue<>(new ItemComparator());
        items.add(item);
        items.add(item2);
        items.add(item3);

        while( items.size() > 0 ) {
            System.out.println( items.poll() );
            System.out.println(items);
        }


    }
}

class Min implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }


}

class ItemComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getBestValue() - o2.getBestValue();
    }
}

class Item {
    String name;
    ArrayList<Integer> values;

    Item(String name, ArrayList<Integer> value) {
        this.name = name;
        this.values = value;
    }

    @Override
    public String toString() {
        return name + ": " + values;
    }

    public int getBestValue() {
        Collections.sort(values, new Min());
        return values.get(values.size() - 1);
    }
}