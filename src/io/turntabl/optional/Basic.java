package io.turntabl.optional;

import java.util.Optional;

public class Basic {

    public static void main(String[] args) {
        Optional<Object> Impty = Optional.empty();
        System.out.println(Impty.isPresent());
        System.out.println(Impty.isEmpty());

        // code smell
        String name = null;
        if (name != null) {
            name.toLowerCase();
        } else {
            System.out.println("Invalid name");
        }

//        Optional<String> name = Optional.ofNullable("John Erbynn");
        Optional<String> nameOptional = Optional.ofNullable(null);

        String n = nameOptional.orElse("Invalid name");
        System.out.println(n);

        String n2 = nameOptional.map(e -> e.toLowerCase())
                .orElse("pkay");
        System.out.println(n2);

        String n3 = nameOptional.orElseGet(() -> {
//            ...some extra work
            return "something";
        });
        System.out.println(n3);


    }
}
