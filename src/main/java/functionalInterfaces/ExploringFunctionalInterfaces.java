package functionalInterfaces;

import java.util.function.Consumer;

public class ExploringFunctionalInterfaces {

    public static void main(String[] args) {

        Consumer<Integer> printSquare = (Integer x) -> System.out.println("Square: " + (x * x));
        printSquare.accept(5);
    }
}
