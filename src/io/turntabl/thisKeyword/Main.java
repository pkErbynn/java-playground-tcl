package io.turntabl.thisKeyword;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee emp = new Employee(1, "papa", 3432);
        System.out.print("ID: " + emp.getId());
        System.out.println("\nName: " + emp.getName());

        Employee intern = new Employee(2, "raph");
        System.out.print("ID: " + intern.getId());
        System.out.println("\nName: " + intern.getName());
    }
}
