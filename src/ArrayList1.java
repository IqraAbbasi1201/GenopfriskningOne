import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {


    /*Exercise:
    Write a method named doesArraylistContainingString,
    it takes 2 parameter: an arrayliste and a String.
    the methods returns a boolean

    if the String does not exist in the arraylist, input the string in the list and the method
    returns false, if the String exist in the arraylist the methods return true and prints "The string has been found"*/

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList();
        Scanner user = new Scanner(System.in);

        //prompt
        System.out.println("Write a word");

        String word = user.nextLine();




        list.add("Every");
        list.add("monkey");

        list.add("I");
        list.add("know");
        list.add("loves");
        list.add("to");
        list.add("eat");
        list.add("banana");

        doesArraylistContainingString(list,word);
        System.out.println(list);


    }


    public static boolean doesArraylistContainingString(ArrayList list, String word1 ){

        for(int i=0; i <list.size(); i++){

            if(word1.equals(list.get(i))) {
                System.out.println("The String has been found");
                return true;
            }
        }
        list.add(word1);
        System.out.println("Word wasn't in the array but now it is added");
        return false;
    }
}
