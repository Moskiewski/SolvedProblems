package cat;

public class CatWrapperApp {

    public static void main(String[] args) {
        Cat cat = new Cat("Oscar");
        Cat catWrap = new CatWrapper(cat);
        printName(catWrap);
    }

    private static void printName(Cat named) {
        System.out.println(named.getName());
    }
}
