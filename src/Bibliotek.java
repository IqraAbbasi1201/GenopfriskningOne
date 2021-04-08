import java.util.ArrayList;
import java.util.Scanner;

//Exercise
//Skriv en klasse kaldet Bibliotek, der indeholder en liste af Bog objekter.

//indsæt tre forskellige bøger i biblioteket

//Skriv en metode i Bibliotek klasse, som tager et Bog objekt som parameter og returner true,
//hvis listen indeholder et Bog objekt med samme ISBN*/
public class Bibliotek {
    ArrayList<Bibliotek> bookList;
    String name;
    String ISBN;


    public static void main(String[] args) {
        Bibliotek books = new Bibliotek();
        books.bookList = new ArrayList<>();

        Bibliotek booksOne = new Bibliotek("Harry Potter","12343557881997");
        books.addToBookList(booksOne);
        Bibliotek booksTwo = new Bibliotek("Lord of the Rings", "987649981989");
        books.addToBookList(booksTwo);
        Bibliotek booksThree = new Bibliotek("H.C Andersen", "928463451789");
        books.addToBookList(booksThree);
        Bibliotek booksFour = new Bibliotek("The Little Mermaid", "12343557888327");
        books.addToBookList(booksFour);

        Scanner pickAISBN = new Scanner(System.in);
        System.out.print("What ISBN are you looking for? ");
        String chosenISBN = pickAISBN.next();

        Bibliotek bookTest = new Bibliotek("", chosenISBN);
        if (books.sameISBN(bookTest)){
            System.out.println(bookTest.ISBN + " exist in the list");
        }
        else {
            System.out.println(bookTest.ISBN + " does not exist in the list");
        }



    }

    public Bibliotek(String name, String ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }

    public Bibliotek(){
    }

    public void addToBookList(Bibliotek book){
        bookList.add(book);
    }

    public boolean sameISBN(Bibliotek book) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).ISBN.equals(book.ISBN)) {
                return true;
            }
        }
        return false;
    }
}
