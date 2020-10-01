package originalCode;

public class BibliotheekApp {
        /*
        here we put everything in the main method,
        this makes a single long file with lots of repetitive statements.
        We would like to reorganize the code into logical classes representing objects
         */
        public static void main(String[] args) {

        //Below you find several lines of code that can move to the Boek class

        //convert instance variables for Boek htmlCSS
            String boekHTMLCSSTitel = "HTML&CSS";
            String boekHTMLCSSAuteur = "Duckett";
            int boekHTMLCSSAantalPaginas = 999;
            int boekHTMLCSSAantalHoofdstukken = 10;

            //create a method that creates a String with all the info about each book
            System.out.println("Je bent het boek " + boekHTMLCSSTitel +
                    " van auteur " + boekHTMLCSSAuteur + " aan het lezen,"
                    + " dit is een boek van " + boekHTMLCSSAantalPaginas + " pagina's dik.");

          //create a method that calculates the average number of pages per chapter
            System.out.println("Het gemiddeld aantal pagina's per hoofdstuk zal zijn: " +
                    boekHTMLCSSAantalPaginas/boekHTMLCSSAantalHoofdstukken);

            //another Boek object javascript here:
            String boekJavaScriptTitel = "JavaScript&jQuery";
            String boekJavaScriptAuteur = "Duckett";
            int boekJavaScriptAantalPaginas = 1400;
            int boekJavaScriptAantalHoofdstukken = 12;

            //method that creates a String with all the info about each book
            System.out.println("Je bent het boek " + boekJavaScriptTitel +
                    " van auteur " + boekJavaScriptAuteur + " aan het lezen,"
                    + " dit is een boek van " + boekJavaScriptAantalPaginas + " pagina's dik.");
            //method to calculate the average number of pages per chapter
            System.out.println("Het gemiddeld aantal pagina's per hoofdstuk zal zijn: " +
                    boekJavaScriptAantalPaginas/boekJavaScriptAantalHoofdstukken);
        }

    }

