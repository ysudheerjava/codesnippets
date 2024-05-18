package chaining;
class Superclass {
    static void display() {
        System.out.println("Superclass");
    }
}

class Subclass extends Superclass {
    static void display() {
        System.out.println("Subclass");
    }
}
