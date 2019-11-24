package io.turntabl.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentOptional {


    public static void main(String[] args) {
//        Student student1 = new Student("john", "erbynn", "ERBYNN@gmail.com");
        Student student1 = new Student("john", "erbynn", null);


//        ...imperative...bit smelly
//        if (student1.getEmail().isPresent()) {
//            String s_email = student1.getEmail().get().toLowerCase();
//            System.out.println(s_email);
//        } else {
//            String f = student1.firstName;
//            System.out.println("email of " + f + " N/A");
//        }

        // better
//        String email = student1
//                .getEmail()
//                .map(e -> e.toLowerCase())
//                .orElse("Email N/A");     // used when to print sth else

//        String email = student1
//                .getEmail()
//                .map(e -> e.toLowerCase())
//                .orElseGet(() -> {      // used to return sth;
//                    String fn = student1.firstName;
//                    return "email N/A for " + fn ;
//                });

//        or
//        String stu_email = student1.getEmail().orElse("Email: N/A");

//        String stu_email = student1.getEmail().orElseGet(() -> {        // orElseGet()...to return a value...**starred**
//            String firstName = student1.getFirstName().toLowerCase();
//            String s = "Email: N/A for " + firstName;
//            return s;
//        });
//
//        System.out.println(stu_email);


        // for null object
        Student s_student = null;
        Optional<Student> studentOptional = Optional.ofNullable(s_student);
        if (studentOptional.isEmpty()) {
            System.out.println("Invalid student");
        } else {
            System.out.println(studentOptional.get());
        }


        //////////// with List //////////////

        List<Student> students = Arrays.asList(
                new Student("john", "erbynn", "me@gmail.com"),
                new Student("osran", "amanfo", null),
                new Student("duodo", "nobbies", "duosu@gmail.com"),
                new Student("faheem", "kassim", null)
        );

//        List<String> emails = students.stream()
//                .map(e -> e.getEmail().orElse("no mail")).collect(Collectors.toList());
//        System.out.println(emails);

        // custom-made....**starred**
        List<String> emails = students.stream()
                .map(e -> e.getEmail().orElseGet(() -> {
                    String invalid = "Email: N/A for " + e.getFirstName();
                    return invalid;
                })).collect(Collectors.toList());
        System.out.println(emails);

    }


}




// NB:
// null is a value that is not actually a value
// null is a known to be "a million dollar mistake"
//`optional` is a java.lang.NullPointerException killer
// .get() ... gets the value