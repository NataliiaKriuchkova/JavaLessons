package com;

public class LearnClass {
    public static void main(String[] args) {
        //datatype name_varaible = value; - for primitive
        int a = 10;

        //datatype(class name) name_varaible = new datatype(class name)(params or absent); - for reference datatype

        Calculator calculator = new Calculator(-210, "John");
        Calculator calculator1 = new Calculator(15, "Jack");
//        calculator1 = new Calculator(17, "Jack");

        calculator1.setAge(17);

//        System.gc();

//       calculator.age = -1210;
        /* calculator.name = "John";

        calculator1.age = 15;
        calculator1.name = "Jack";*/
    }
}

/*
        (by compiler)               (by JVM)
* .java file -> .class file(bytecode) -> command processor on specific machine
* */
