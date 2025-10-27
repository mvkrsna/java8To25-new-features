package LambdaConcepts;

import java.util.Comparator;

public class ComparatorUsingLambda {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Comparison using Anonymous Class: " + comparator.compare(15, 10));


        // Using Lambda Expression
        Comparator<Integer> lambdaComparator = (Integer o1, Integer o2) -> o1.compareTo(o2);
        System.out.println("Comparison using Lambda Expression: " + lambdaComparator.compare(15, 10) );

        // Using Lambda Expression
        Comparator<Integer> lambdaComparator1 = (o1, o2) -> o1.compareTo(o2);
        System.out.println("Comparison using Lambda Expression: " + lambdaComparator1.compare(5, 10) );

        // Even more concise
        Comparator<Integer> conciseComparator = Integer::compareTo;
        System.out.println("Comparison using Method Reference: " + conciseComparator.compare(5, 5) );
    }
}
