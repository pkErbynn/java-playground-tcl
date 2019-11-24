package io.turntabl.This;

public class Main {
    public static void main(String[] args) {
        ThisExample te = new ThisExample();
        te.print();

        ThisExample te2 = new ThisExample(34);
        te2.print();

        ThisExample teg = new ThisExample();
        System.out.println(teg.getThisEg());

    }
}
