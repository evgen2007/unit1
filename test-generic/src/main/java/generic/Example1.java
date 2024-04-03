package generic;

public class Example1 {
    private String model;
    private int year;

    public Example1(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
