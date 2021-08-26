

public class App {
    
    public static void main(String[] args) {
    
        var sparkasse = new Bank();

        var konto1 = sparkasse.erstelleKonto("Maurice König");
        var konto2 = sparkasse.erstelleKonto("Alonzo der Coole"); 
        var konto3 = sparkasse.erstelleKonto("Peter Lustig");

        ausgabe("");
        ausgabe("Tag 1:");
        konto1.printKontoDetails();
        konto2.printKontoDetails();
        konto3.printKontoDetails();

        konto1.setKontostand(konto1.getKontostand() * 2);
        konto2.setKontostand(konto2.getKontostand() * 3);
        konto3.setKontostand(konto3.getKontostand() * 10);

        ausgabe("");
        ausgabe("Tag 2: ");
        konto1.printKontoDetails();
        konto2.printKontoDetails();
        konto3.printKontoDetails();

        konto2.überweiseAn(konto1, konto2.getKontostand());
        konto3.überweiseAn(konto1, konto3.getKontostand());

        ausgabe("");
        ausgabe("Tag 3:");
        konto1.printKontoDetails();
        konto2.printKontoDetails();
        konto3.printKontoDetails();

    }

    public static void ausgabe (String text)
    {
        System.out.println(text);
    }
}
