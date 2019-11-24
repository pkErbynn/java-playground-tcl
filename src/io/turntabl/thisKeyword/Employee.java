package io.turntabl.thisKeyword;

public class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, int salary) {
        this(id, name);
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

}


