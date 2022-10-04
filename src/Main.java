public class Main {
    public static void main( String[] args ) {

        Animal obj1 = new Dog();
        ((Dog)obj1).corri();

        int x = 10;

    }


}

class Animal {

    @Deprecated
    public void verso() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {

    public void corri() {
        System.out.println( "dog corri" );
    }


    public void m1() {
        System.out.println( "dog m1" );
    }
}
