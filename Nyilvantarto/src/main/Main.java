package main;

import classes.Folyoirat;
import classes.Konyv;
import managers.Konzol;
import managers.Nyilvantarto;

import java.util.Scanner;

public class Main {

    private static Nyilvantarto ny;
    private static Konzol k;

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        ny = new Nyilvantarto();
        k = new Konzol(ny);

        //Könyv és folyóirat feltöltése
        //Könyvek
        ny.addIrat(new Konyv("Teszt-Könyv-cim1", "Teszt-kiadó1", "Teszt-szerző1", 50));
        ny.addIrat(new Konyv("Teszt-Könyv-cim2", "Teszt-kiadó2", "Teszt-szerző2", 70));
        ny.addIrat(new Konyv("Teszt-Könyv-cim3", "Teszt-kiadó3", "Teszt-szerző3", 120));
        //folyóirat
        ny.addIrat(new Folyoirat("Teszt-Folyoirat-cim1", "Teszt-kiadó4", 2018,  10));
        ny.addIrat(new Folyoirat("Teszt-Folyoirat-cim2", "Teszt-kiadó5", 2019,  3));
        ny.addIrat(new Folyoirat("Teszt-Folyoirat-cim3", "Teszt-kiadó6", 2020,  7));

        try {
            k.start();
        } catch (Exception e) {
            System.out.printf("Hibát észlelt a program futás közben ezért leállt!\nA hibakód:\n%s\n\n ", e.getMessage());
        }finally {
          //Program vége
            System.out.printf("A kilépéshez nyomja meg az ENTER gombot!\n");
            sc.nextLine();
            sc.close();
        }
    }

    public static Scanner getScanner() {
        return sc;
    }
}
