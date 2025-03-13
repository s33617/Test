import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cenastartowa = 40;
        int znizka = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wiek:");
        int wiek = sc.nextInt();
        System.out.println("Podaj miejsce zamieszkania");
        String miejsce = sc.next();
        System.out.println("Podaj na kiedy kupujesz bilet");
        String dzien = sc.next();

        if (dzien.equalsIgnoreCase("Czwartek")) {
            znizka = 100;
        }
        if (miejsce.equalsIgnoreCase("Warszawa")) {
            znizka = znizka + 10;
        }
        if (wiek < 10){
            znizka = znizka + 100;
        }
        if (wiek >= 10 && wiek <18){
            znizka = znizka + 50;
        }
        if (znizka >= 100) {
            System.out.println("Dane: " + miejsce + ", " + wiek + "lat, dzień tygodnia: " + dzien + ", Cena biletu: bezpłatny, Rabat: 100%");
        } else {
            double nowacena = cenastartowa* (100.00 - znizka) /100.00;
            System.out.println("Dane: " + miejsce + ", " + wiek + "lat, dzień tygodnia: " + dzien + ", Cena biletu: " + nowacena + " PLN, Rabat: " + znizka + "%");
        }

    }
}