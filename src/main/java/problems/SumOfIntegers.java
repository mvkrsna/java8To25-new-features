package problems;

import java.util.stream.IntStream;

public class SumOfIntegers {
    public static void main(String[] args) {

        /*
        * Imperative     Programming Approach:
        * */
        int sum=0;
        for (int i=1;i <= 100; i++) {
            sum = sum+i;
        }
        System.out.println("Sum of first 100 integers is: " + sum);

        /*
        * Declarative Programming Approach:
        * */
        int sum1 = IntStream.range(1, 101).sum();
        int sum2 = IntStream.rangeClosed(1, 100).sum();
        System.out.println("Sum of first 100 integers using declarative approach is: " + sum1);
        System.out.println("Sum of first 100 integers using declarative RangeClosed approach is: " + sum2);
    }
}
