package io.turntabl.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserMapSample {
    private String name;
    private int age = 20;

    public UserMapSample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void stringNamesToUserObject() {
        List<String> names = Arrays.asList("john", "kwesi", "erbynn");
//        names.stream()
//                .filter(name -> !name.equals("john"))
//                .map(name -> {
//                    User user = new User(name);
//                    return user;
//                })
//                .forEach(name -> System.out.println(name));   // foreach() terminal operation output result by default...

        // map & collect
        List<UserMapSample> users = names.stream()
                .filter(name -> !name.equals("john"))
                .map(name -> {
                    UserMapSample user = new UserMapSample(name);
                    return user;
                })
                .collect(Collectors.toList());  // another terminal operation
        System.out.println(users);

        // mapToInt & sum()
        int ageSum = users.stream()
                .mapToInt(e -> e.getAge())
                .sum();
        System.out.println("Age total: " + ageSum);
    }

    public static void main(String[] args) {
        UserMapSample.stringNamesToUserObject();
    }
}
