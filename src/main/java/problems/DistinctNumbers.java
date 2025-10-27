package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DistinctNumbers {

    public static void main(String[] args) {

        /*
        * Imperative Programming Approach:
        * */
        List<Integer> numbers = Arrays.asList(1,2,2,2, 3, 4,5,6,7,8,9,9,10,10);
        // Write code to find distinct numbers from the list 'numbers' and print them as a List<Integer>

        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer number: numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        System.out.println("uniqueNumbers in imperative approach: " + uniqueNumbers);

        /*
        * Declarative Programming Approach:
        * */
        List<Integer> uniqueNumbers1 = numbers
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("unique Numbers in Declarative approach: " + uniqueNumbers1);
    }
}
