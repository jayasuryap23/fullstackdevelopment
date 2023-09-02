package inheritance;

public class TestDog {
    public static void main(String[] args) {
        Animal a =  new Animal(); // animal reference and object
        Animal b =  new Dog(); // animal reference but dog object
        a.move(); // runs the method in animal class
        b.move(); //  runs the method in Dog class
    }
}
