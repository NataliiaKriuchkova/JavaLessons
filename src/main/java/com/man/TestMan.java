package com.man;

import org.w3c.dom.ls.LSOutput;

public class TestMan {
    public static void main(String[] args) {
        Man man1 = new Man("Ivanov","Ivan", "Ivanovich",
                26, "junior");
        man1.showFirstNameSecondName();
        man1.showLastNameFirstNameSecondName();
        man1.howLastNameFirstNameSecondNameAge();
        man1.howLastNameFirstNameSecondNamePosition();
    }
}
