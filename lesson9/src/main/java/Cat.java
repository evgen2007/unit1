public class Cat {
    public int publicField;
    int defaultField;
    private int privateField;

    public Cat(int publicField, int defaultField, int privateField) {
        this.publicField = publicField;
        this.defaultField = defaultField;
        this.privateField = privateField;
    }

    public Cat() {
    }

    public void publicMethod() {
        System.out.println("public meow");
    }

    private void privateMethod() {
        System.out.println("private meow");
    }
}
