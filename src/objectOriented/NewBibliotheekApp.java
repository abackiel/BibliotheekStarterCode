package objectOriented;

public class NewBibliotheekApp {
    public static void main(String[] args) {

        //create two Boek objects
        Boek html = new Boek("HTML&CSS", "Duckett", 999, 10);
        Boek javascript = new Boek("JavaScript&jQuery", "Duckett", 1400, 12);

        //use System.out.println to print out the getBoekInfo() String for each Boek object
        System.out.println(html.getBoekInfo());
        System.out.println(javascript.getBoekInfo());
    }
}
