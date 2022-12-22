package cat;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Oscar");
        printName(cat);
    }

    private static void printName(Cat cat) {
        System.out.println(cat.getName());
    }
}
