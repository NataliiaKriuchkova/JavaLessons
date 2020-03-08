package com.computer;

public class TestComputer {
    public static void main(String[] args) {
//        int[] array = new int[10];//0
        Computer[] computers = new Computer[5];//nulls

        Computer computer1 = new Computer(12354, 255.5F,
                6, 2, "HP");

        Computer computer2 = new Computer(24587, 478.87F,
                8, 4, "Dell");

        Computer computer3 = new Computer(32145, 784.45F,
                4, 2, "Lenovo");

        Computer computer4 = new Computer(65478, 987.24F,
                4, 5, "Acer");

        Computer computer5 = new Computer(85236, 9632.45F,
                2, 6, "Apple");

        computers[0] = computer1;
        computers[1] = computer2;
        computers[2] = computer3;
        computers[3] = computer4;
        computers[4] = computer5;

        for (int i = 0; i < computers.length; i++) {

            if (computers[i] != null) {

                float price = computers[i].getPrice();

                price *= 1.1;

                computers[i].setPrice(price);
                computers[i].view();
            }
        }

    }
}

/*
 * price * 1.1
 * */
