package com.company;

import java.util.Scanner;

class Videogames {
    private String title;
    private double price;
    private double metascore;

    Videogames(String title) {
        this.price = (Math.round(Math.random() * 50) + 1);
        this.metascore = Math.round(Math.random() * 10);
    }

    public double getPrice() {
        return this.price;
    }

    public double getMetascore() {
        return this.metascore;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter name of videogame: \n");
            String name;
            try {
                name = input.next();
            } catch (Exception ex) {
                System.out.println(ex);
                name = null;

            }
            Videogames x = new Videogames(name);
            System.out.println(name + " has " + x.getMetascore() + " points on MetaCritic.com and costs " + x.getPrice() + "$");

        }
    }
}