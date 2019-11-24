package io.turntabl.optional;

import java.util.List;
import java.util.Optional;

public class Student {
    String firstName;
    String lastName;
    String email;

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + firstName +
                ", name='" + lastName + '\'' +
                '}';
    }
}
