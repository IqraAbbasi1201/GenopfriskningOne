import java.util.ArrayList;

public class Bibliotek {
    /*Exercise
    Skriv en klasse kaldet Bibliotek, der indeholder en liste af Bog objekter.

    indsæt tre forskellige bøger i biblioteket

    Skriv en metode i Bibliotek klasse, som tager et Bog objekt som parameter og returnere true,
    hvis listen indeholder et Bog objekt med samme ISBN*/

    public static void main(String[] args) {

        ArrayList <Bog> bogliste = new ArrayList<>();


        Bog b1 = new Bog("Harry", 1234355788, 1997);
        Bog b2 = new Bog("lords of the Ring", 98764998,1989);
        Bog b3 = new Bog("Tolken", 92846345, 1789);
        Bog b4 = new Bog("Mermaid", 1234355788, 8327);

        bogliste.add(b1);
        bogliste.add(b2);
        bogliste.add(b3);

        System.out.println(bogliste);


        /*Bog b2 = new Bog();
        b2.titel = "Lord of the Rings";*/

    }

    public static boolean bMethod (Bog currentBook, ArrayList bogliste) {

    return true; //Kompileringsfejl grundet manglede return statement
    }
}
