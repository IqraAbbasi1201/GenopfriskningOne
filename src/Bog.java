public class Bog {
    public static void main(String[] args) {
        System.out.println("Hi");
    }

    //attributes
    private String titel;
    private long isbnNumber;
    private int udgivelsesår;

    /*default constructor
    public Bog(){}l*/

    //Constructor
    public Bog(String titel, long isbnNumber, int udgivelsesår){
        this.titel = titel;
        this.isbnNumber= isbnNumber;
        this.udgivelsesår= udgivelsesår;
    }


    //Getters
    public String getTitel(){
        return titel;
    }

    public long getIsbnNumber(){
        return isbnNumber;
    }

    public int getUdgivelsesår(){
        return udgivelsesår;
    }

    //Setters
    public void setTitel(String titel){
        this.titel = titel;
    }

    public void setIsbnNumber(long isbnNumber) {
        this.isbnNumber= isbnNumber;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår= udgivelsesår;
    }

    public String toString(){
        return "titel: " + titel + " iSBN number: " + isbnNumber + " udgivelsesår: " + udgivelsesår;
    }




    /*Excercise

    Skriv en klasse kaldet Bog, der indeholder ISBN-nummer, titel og udgivelsesår.
    skriv flg. metoder
    Constructor
    Getters og Setters
    toString*/
}
