package io.turntabl.streams;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {

        // double the first even number greater than 3
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = 0;
        for (int num :
                numbers) {
            if ((num > 3) && (num % 2 == 0)) {
                result = num * 2;
                break;
            }
        }
        System.out.println("Non-fxnal: " + result);

        // using fxnal programming
        System.out.println("findFirst: " + numbers.stream()
                .filter(e -> e > 3)
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e * 2)
                .findFirst());


        System.out.println("elementFromMapSum: " + StreamSample.elementFromMapSum());
        StreamSample.printEachElement(List.of("john", "kwesi", "erbynn"));
        StreamSample.printElements();
        StreamSample.printElementsWithEndsWith();
        StreamSample.printElementsWithCount();
        System.out.println("Elements sum: " + StreamSample.sumElementsInList());
        System.out.println("Elements sum with Lambda: " + StreamSample.sumElementsInListWithLambda());
        System.out.println("Sort: ");
        StreamSample.sortElements();
        System.out.println();
        System.out.println("UniqueSort: ");
        StreamSample.sortDistinctElements();

        StreamSample.methodReferenceEg();
    }
}
