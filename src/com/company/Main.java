package com.company;

public class Main {

    public static void main(String[] args) {

        Siti siti = new Siti("Oш", 10000, 20000);
        siti.raspechatka();

        Home home = new Home("toktogula 174", 6, 30,
                "leninscii raion", new Prizident("putin"));
        home.raspechatka();

        Home home2 = new Home("belinscii 36", 4, 25,
                "manasa 67", new Prizident("akaev"));

        home2.raspechatka();



    }
}
