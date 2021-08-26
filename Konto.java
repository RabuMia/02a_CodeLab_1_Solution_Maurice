
public class Konto {
    
    private String besitzer;
    private int kontostand;

    public Konto (String besitzer){

        kontostand = 1000;
        this.besitzer = besitzer;
    }

    public int getKontostand (){

        return kontostand;
    }

    public void setKontostand (int neuerKontostand){

        kontostand = neuerKontostand;
    }

    public void printKontoDetails (){

        System.out.println("=> " + besitzer + ": " + kontostand + "€");
    }

    public void überweiseAn (Konto konto, int summe)
    {
        if (summe > this.kontostand) return;
        this.kontostand -= summe;
        konto.setKontostand(konto.getKontostand() + summe);
    }
}
