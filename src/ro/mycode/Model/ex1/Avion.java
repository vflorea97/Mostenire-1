package ro.mycode.Model.ex1;

public class Avion extends Vehicul{

    private int altitudine;
    private String companie;
    private int numarIndiviziEchipaj;
    private String aeroport;

    public Avion (){
        super("motor1","electric");
        System.out.println("Eus unt constructorul fara ,parametrii din avion");
        this.altitudine = 0;
        this.companie = "";
        this.numarIndiviziEchipaj = 0;
        this.aeroport = "";
    }

    public Avion(String motor, String combustibil, int altitudine, String companie, int numarIndiviziEchipaj, String aeroport) {
        super(motor, combustibil);
        this.altitudine = altitudine;
        this.companie = companie;
        this.numarIndiviziEchipaj = numarIndiviziEchipaj;
        this.aeroport = aeroport;
    }

    public Avion(String motor, String combustibil, int vitezaMaxima, String materialCaroserie, String functionalitate, int altitudine, String companie, int numarIndiviziEchipaj, String aeroport) {
        super(motor, combustibil, vitezaMaxima, materialCaroserie, functionalitate);
        this.altitudine = altitudine;
        this.companie = companie;
        this.numarIndiviziEchipaj = numarIndiviziEchipaj;
        this.aeroport = aeroport;
    }

    public int getAltitudine() {
        return altitudine;
    }

    public void setAltitudine(int altitudine) {
        this.altitudine = altitudine;
    }

    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public int getNumarIndiviziEchipaj() {
        return numarIndiviziEchipaj;
    }

    public void setNumarIndiviziEchipaj(int numarIndiviziEchipaj) {
        this.numarIndiviziEchipaj = numarIndiviziEchipaj;
    }

    public String getAeroport() {
        return aeroport;
    }

    public void setAeroport(String aeroport) {
        this.aeroport = aeroport;
    }

    public String descriere (){
        String text = "";

        text += super.descriere();
        text += "Altitudine: " + this.altitudine + "\n";
        text += "Companie: " + this.companie + "\n";
        text += "Indivizi bord: " + this.numarIndiviziEchipaj + "\n";
        text += "Aeroport: " + this.aeroport + "\n";
        return text;
    }
    public String toSave (){
        return super.toSave()+","+this.altitudine+","+this.companie+","+this.numarIndiviziEchipaj+","+this.aeroport;
    }


}
