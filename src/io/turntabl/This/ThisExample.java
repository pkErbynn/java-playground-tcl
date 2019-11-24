package io.turntabl.This;

public class ThisExample {
    int num;

    public ThisExample() {
        System.out.println("Inside no-arg constructor");
    }

    public ThisExample(int num) {
        this();
        this.num = num;
        System.out.println("Inside parameterized constructor");
    }

    public ThisExample getThisEg() {
        return this;
    }

    public void greet() {
        System.out.println("Gm");
    }

    public void print() {
        int num = 20;
        System.out.println("Local var num is : " + num);
        System.out.println("Instance var is : " + this.num);
        this.greet();
    }
}
