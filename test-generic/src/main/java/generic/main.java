package generic;

public class main {
    public static void main(String[] args) {
        Example1 example1 = new Example1("toyota", 2023);
        Example1 example2 = new Example1("volvo", 2016);
        Example1 example3 = new Example1("BMW", 2010);

        Example<Example1> example = new Example<>("vasya");
        example.print(example1);
        example.print(example2);

        Example<Example1> example_1 = new Example<>("petya");
        example_1.print(example3);
    }
}
