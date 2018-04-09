/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author Kasia
 */
public class Number {

    public int number;
    //Scanner input = new Scanner(System.in);

    public Number(int number) {
        this.number = number;
    }

    public int silnia(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * silnia(n - 1);
        }
    }

    public int multipling(int number) {
        this.number = number * this.number;
        return this.number;
    }

    public void display() {
        System.out.println("Podana liczba: " + this.number);
    }
}
