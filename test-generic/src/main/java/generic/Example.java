package generic;

public class Example<T> {
    private String name;

    public Example(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print(T t) {
        System.out.println(t + " Владелец " + this.name);
    }
}
