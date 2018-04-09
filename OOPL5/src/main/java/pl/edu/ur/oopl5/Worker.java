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
public class Worker {

    public String imie = "";
    public String nazwisko = "";
    public int wiek = 0;
    public int zarobki = 0;
    Scanner wor = new Scanner(System.in);

    public Worker(String imie, String nazwisko, int wiek, int zarobki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.zarobki = zarobki;
    }

    public Worker() {
    }

    public Worker cW() {
        System.out.println("Podaj imie pracownika");
        this.imie = wor.nextLine();
        System.out.println("Podaj nazwisko pracownika");
        this.nazwisko = wor.nextLine();
        System.out.println("Podaj wiek pracownika");
        this.wiek = wor.nextInt();
        System.out.println("Ustal zarobki pracownika");
        this.zarobki = wor.nextInt();
        return this;
    }

    public void dData() {
        System.out.println("Imie pracownika: " + imie);
        System.out.println("Nazwisko pracownika: " + nazwisko);
        System.out.println("Wiek pracownika: " + wiek);
        System.out.println("Zarobki pracownika: " + zarobki);
    }

}
