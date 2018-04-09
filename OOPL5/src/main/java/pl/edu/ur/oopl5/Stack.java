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
public class Stack {

    public int stackPointer = 0;
    public int[] stack;
    public int stackLength;
    Scanner w = new Scanner(System.in);

    public Stack(int n) {
        this.stackLength = n;
        this.stack = new int[n];
    }

    public void push() { //dodawanie el do stosu
        if (stackPointer < stackLength) {
            System.out.print("Podaj liczbe, ktora chcesz dodac na stos: ");
            stackPointer++;
            stack[stackPointer] = w.nextInt();
        } else {
            System.out.println("Stos pelny");
        }
    }

    public void pop() {//usuwanie elementu ze stosu
        if (stackPointer >= 1) {
            stack[stackPointer] = 0;
            stackPointer--;
        } else {
            System.out.println("Stos jest pusty");
        }
    }

}
