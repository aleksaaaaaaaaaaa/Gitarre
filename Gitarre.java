public class Gitarre {
    // Attribute
    private String marke = "UNKN";
    private boolean akustisch = true;
    private boolean konzert = false;
    private int saiten = 6;
    private int preis = 150;

    // Konstruktoren
    public Gitarre(String neuMarke, boolean neuAkustisch, boolean neuKonzert, int neuSaiten, int neuPreis) {
        this.marke = neuMarke;
        this.akustisch = neuAkustisch;
        this.konzert = neuKonzert;
        this.saiten = neuSaiten;
        this.preis = neuPreis;
    }

    public Gitarre(String neuMarke, boolean neuAkustisch, int neuSaiten) {
        this.marke = neuMarke;
        this.akustisch = neuAkustisch;
        this.saiten = neuSaiten;
    }

    public Gitarre(String neuMarke, boolean neuAkustisch) {
        this.marke = neuMarke;
        this.akustisch = neuAkustisch;
    }

    public Gitarre(String neuMarke, boolean neuKonzert, boolean neuAkustisch) {
        this.marke = neuMarke;
        this.konzert = neuKonzert;
        this.akustisch = neuAkustisch;
    }

    // Hier wurde die Reihenfolge auf (String, int, boolean) geändert, um Konflikte zu vermeiden
    public Gitarre(String neuMarke, int neuSaiten, boolean neuKonzert) {
        this.marke = neuMarke;
        this.saiten = neuSaiten;
        this.konzert = neuKonzert;
    }

    public Gitarre(String neuMarke) {
        this.marke = neuMarke;
    }

    public Gitarre() {
        // Standardwerte werden verwendet
    }

    // Get- und Set-Methoden
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public boolean isAkustisch() {
        return akustisch;
    }

    public void setAkustisch(boolean akustisch) {
        this.akustisch = akustisch;
    }

    public boolean isKonzert() {
        return konzert;
    }

    public void setKonzert(boolean konzert) {
        this.konzert = konzert;
    }

    public int getSaiten() {
        return saiten;
    }

    public void setSaiten(int saiten) {
        this.saiten = saiten;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    // printGitarre Methode
    public void printGitarre() {
        System.out.println("Gitarre [Marke: " + marke + 
                           ", Akustisch: " + akustisch + 
                           ", Konzert: " + konzert + 
                           ", Saiten: " + saiten + 
                           ", Preis: " + preis + " EUR]");
    }
}