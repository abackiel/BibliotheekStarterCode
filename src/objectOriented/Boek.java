package objectOriented;

public class Boek {
    //instance variables
    String titel;
    String auteur;
    int aantalPaginas;
    int aantalHoofdStukken;

    //constructor: create a Boek object with the given parameters
    public Boek(String pTitel, String pAuteur, int paginas, int hoofdstukken){
        titel = pTitel;
        auteur = pAuteur;
        aantalPaginas = paginas;
        aantalHoofdStukken = hoofdstukken;
    }

    //create a method that calculates the average number of pages per chapter
    public int gemiddeldePaginasPerHoofdstuk(){
        return aantalPaginas/aantalHoofdStukken;
    }

    //create a method that creates a String with all the info about each book
    public String getBoekInfo(){
        String boekInfo = "Je bent het boek " + titel +
                " van auteur " + auteur + " aan het lezen,"
                + " dit is een boek van " + aantalHoofdStukken
                + " pagina's dik.\nHet gemiddeld aantal pagina's per hoofdstuk zal zijn: " +
                gemiddeldePaginasPerHoofdstuk();
        return boekInfo;
    }


}
