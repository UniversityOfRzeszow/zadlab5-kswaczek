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
public class Firma {

    public Worker workers[];
    Scanner odczyt = new Scanner(System.in);

    public Firma() {
        this.workers = new Worker[100];
    }

    public Worker[] getWorkers() {
        return this.workers;
    }

    public void dW() {
        for (int i = 0; i < this.workers.length; i++) {
            if (this.workers[i] != null) {
                System.out.println(this.workers[i].imie);
                System.out.println(this.workers[i].nazwisko);
                System.out.println(this.workers[i].wiek);
                System.out.println(this.workers[i].zarobki);
            } else {
                break;
            }

        }
    }

    public void aW(Worker worker, int a) {
        this.workers[a] = worker;
    }

    public void Data(int index) {
        System.out.println("Zmien imie pracownika: ");
        this.workers[index].imie = odczyt.nextLine();
        System.out.println("Zmien nazwisko pracownika: ");
        this.workers[index].nazwisko = odczyt.nextLine();
        System.out.println("Zmien wiek pracownika: ");
        this.workers[index].wiek = odczyt.nextInt();
        System.out.println("Zmien zarobki pracownika: ");
        this.workers[index].zarobki = odczyt.nextInt();
    }
}
