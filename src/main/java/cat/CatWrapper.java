package cat;

public class CatWrapper extends Cat {

    private final Cat original;

    public CatWrapper(Cat cat) {
        super(cat.getName());
        this.original = cat;
    }

    public String getName() {
        return "A cat named " + original.getName();
    }

    public void setOriginal(String name) {
        original.setName(name);
    }
}
