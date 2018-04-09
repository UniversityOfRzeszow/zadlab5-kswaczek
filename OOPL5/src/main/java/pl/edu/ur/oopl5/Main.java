package pl.edu.ur.oopl5;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6
        
        Scanner z = new Scanner(System.in);
        System.out.println("Wybierz numer zadania: "
                + "\n1.Działanie stosu "
                + "\n2.Firma "
                + "\n3.Liczenie silni");
        int zadanie = z.nextInt();
        switch (zadanie) {
            case 1: {
                System.out.println("Podaj dlugosc stosu: ");
                int dłstosu = z.nextInt();
                Stack stack = new Stack();
                int numer;
                do {
                    System.out.println("1.Dodaj liczbe \n "
                            + "2.Usun liczbe \n "
                            + "3.Koniec programu ");
                    numer = z.nextInt();
                    switch (numer) {
                        case 1:
                            stack.push(dłstosu);
                            break;
                        case 2:
                            stack.pop();
                            break;
                    }
                } while (numer != 3);
                break;
            }
            case 2: {
                Worker worker = new Worker();
                Firma firma = new Firma();
                System.out.println("Podaj ilu pracownikow chcesz dodac:");
                int pracownik = z.nextInt();
                for (int i = 0; i < pracownik; i++) {
                    System.out.println("Pracownik nr: " + (i + 1));
                    firma.aW(worker.cW(), i);
                }
                firma.dW();
                break;
            }
            case 3: {
                System.out.print("Podaj liczbe: ");
                int licz = z.nextInt();
                Number number = new Number(licz);
                System.out.print("Przez jaka liczbe pomonozyc: ");
                int mn = z.nextInt();
                number.multipling(mn);
                System.out.println("Silnia: " + number.silnia(licz));
                number.display();
                break;
            }
            default: {
                System.out.println("BŁĄD");
                break;
            }
        }
    }

}
