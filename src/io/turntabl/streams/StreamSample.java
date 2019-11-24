package io.turntabl.streams;

import java.util.List;

public class StreamSample {

    // fxn to lambda conversion
//    doubleNumberfxn = (int a){
//        System.out.println("lambda");
//            return a * 2;
//        }
//     doubleNumberfxn = (int a) -> a * 2;




    public static int elementFromMapSum() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);      // another list declaration
        int result2 = nums.stream()
                .filter(e -> e > 3)
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e * 2)   // can sum() only when map converted to Int
                .sum();
        return result2;
    }

    public static void printEachElement(List<String> names) {
        System.out.print("Names: ");
        names.stream()
                .forEach(e -> System.out.print(e + ", "));
    }

    public static void printElements() {
        List<Integer> someList = List.of(1, 2, 3, 4, 5);      // another list declaration
        System.out.println("For each: ");
        someList.stream().forEach(e -> System.out.println(e));  // forEach() returns void
    }

    public static void printElementsWithEndsWith() {
        List<String> someList = List.of("cat", "ida", "enyo", "linda");      // another list declaration
        System.out.println("For each: ");
        someList
                .stream()
                .filter(e -> e.endsWith("da"))  // intermediate operations...output is passed on to another stream operation
                .forEach(e -> System.out.println("name - " + e));   // terminal operation...out is returned
    }

    public static void printElementsWithCount() {
        List<String> someList = List.of("cat", "ida", "enyo", "inda");      // another list declaration
        System.out.println("count: ");
        someList
                .stream()
                .filter(e -> e.startsWith("i"))  // intermediate operations...output is passed on to another stream operation
                .count()
        ;   // terminal operation...out is returned
    }

    public static int sumElementsInList() {
        List<Integer> someNumbers = List.of(1, 2, 3, 4, 5);
        return someNumbers.stream()
                .reduce(0, (num1, num2) -> num1 + num2);
    }

    public static int sumElementsInListWithLambda() {
        List<Integer> someNumbers = List.of(1, 2, 3, 4, 5);
        return someNumbers.stream()
                .reduce(0, (num1, num2) -> {    // no need for block if code is just one line
                            System.out.println(num1 + " - " + num2);
                            return num1 + num2;
                        }
                );
    }

    public static void sortElements() {
        List<Integer> numbers = List.of(12, 5, 55, 6, 987, 32, 5, 1);
        numbers.stream()
                .sorted()
                .forEach(element -> System.out.print(element + ", "));
    }

    public static void sortDistinctElements() {
        List<Integer> numbers = List.of(12, 5, 55, 6, 987, 32, 5, 1);
        numbers.stream()
                .distinct()
                .sorted()
                .forEach(element -> System.out.print(element + ", "));
    }

    // stream method referencing
    public static int doubleIt(int i) {
        return i * 2;
    }

    public static void methodReferenceEg() {
        System.out.println("meth ref.");
        List<Integer> numbers = List.of(12, 5, 55, 6, 987, 32, 5, 1);
        numbers.stream()
                .forEach(StreamSample::doubleIt);
    }


}
