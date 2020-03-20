package managers;

import classes.Irat;
import enums.Dijak;
import enums.Tipusok;
import main.Main;

import java.util.List;

public class Konzol {

    private Nyilvantarto ny;

    public Konzol(Nyilvantarto ny) {
        this.ny = ny;
    }

    public void start() throws Exception {
        FoKepernyo();
    }

    private void FoKepernyo() throws  Exception{
        do {
            Torles();
            System.out.printf("==========[Nyilvántartó Rendszer]==========\n");
            System.out.printf("1) Keresés\n");
            System.out.printf("2) Kilépés\n");
            System.out.printf("Választás: ");
            String line = Main.getScanner().nextLine();
            switch (line.trim().toLowerCase()) {
                case "1": {
                    Kereses();
                    break;
                }
                case "2": {
                    return;
                }
                default: {break;}
            }
        }while(true);
    }

    private void Kereses() throws Exception{
        do {
            Torles();
            System.out.printf("==========[Keresés]==========\n");
            System.out.printf("1) Típus szerint\n");
            System.out.printf("2) Összes listázása\n");
            System.out.printf("3) Vissza a főmenübe\n");
            System.out.printf("Választás: ");
            String line = Main.getScanner().nextLine();
            switch (line.trim().toLowerCase()) {
                case "1": {
                    KeresTipus();
                    return;
                }
                case "2": {
                    Torles();
                    int kido = 1;
                    System.out.printf("Kérem adja meg a tervezett kölcsönzési időt (nap): ");
                    try{
                        kido = Integer.parseInt(Main.getScanner().nextLine());
                    }catch (NumberFormatException ex){

                    }

                    Torles();
                    int meret = ny.getIratok().size();
                    for(int i = 0; i < meret; i++){
                        System.out.printf("%d. Irat: %s\n", (i+1), ny.getIratok().get(i).toString());
                        System.out.printf("\tVárható kölcsönzési díj: %d Ft\n", ((Dijak.ALAPDIJ.getValue() + (ny.getIratok().get(i).getTipus() == Tipusok.KONYV ? Dijak.KIEGESZITO_KONYV.getValue() : Dijak.KIEGESZITO_FOLYOIRAT.getValue()))*kido));
                    }
                    System.out.printf("A folytatáshoz nyomja meg az ENTER gombot!");
                    Main.getScanner().nextLine();
                    return;
                }
                case "3": {
                    return;
                }
                default: {break;}
            }
        }while(true);
    }

    private void KeresTipus() throws Exception{
        do {
            Torles();
            System.out.printf("==========[Típus]==========\n");
            System.out.printf("1) Könyv\n");
            System.out.printf("2) Folyóirat\n");
            System.out.printf("3) Visszalépés\n");
            System.out.printf("Választás: ");
            String line = Main.getScanner().nextLine();
            switch (line.trim().toLowerCase()) {
                case "1": {
                    KeresCim(Tipusok.KONYV);
                    return;
                }
                case "2": {
                    KeresCim(Tipusok.FOLYOIRAT);
                    return;
                }
                case "3": {
                    return;
                }
                default: {break;}
            }
        }while(true);
    }

    private void KeresCim(Tipusok tipus) throws  Exception{
        Torles();
        System.out.printf("Adjon meg egy cím részletet: ");
        List<Irat> iratok = ny.keresCim(Main.getScanner().nextLine());
        Torles();
        if(iratok.size() == 0){
            System.out.printf("Nem található ilyen könyv!\n");
            return;
        }

        System.out.printf("Kérem adja meg a tervezett kölcsönzési időt (nap): ");
        int kido = 1;
        try {
            kido = Integer.parseInt(Main.getScanner().nextLine());
        }catch(NumberFormatException ex){
            System.out.printf("A megadott számérték nem megfelelő!\nNyomja meg az ENTER gombot a visszatéréshez");
            return;
        }

        for(int i = 0; i < iratok.size(); i++){
            if(iratok.get(i).getTipus().equals(tipus)) {
                System.out.printf("%d. Irat: %s\n", (i + 1), iratok.get(i).toString());
                System.out.printf("\tVárható kölcsönzési díj: %d Ft\n", ((Dijak.ALAPDIJ.getValue() + (tipus == Tipusok.KONYV ? Dijak.KIEGESZITO_KONYV.getValue() : Dijak.KIEGESZITO_FOLYOIRAT.getValue()))*kido));
            }
        }
        System.out.printf("A folytatáshoz nyomja meg az ENTER gombot!");
        Main.getScanner().nextLine();
    }

    private void Torles() throws Exception{
        if(System.getProperty("os.name").toLowerCase().contains("windows")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }else{
            Runtime.getRuntime().exec("clear");
        }
    }
}
