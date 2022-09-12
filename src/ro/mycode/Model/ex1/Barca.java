package ro.mycode.Model.ex1;

public class Barca extends Vehicul {

    private int lungime;
    private String nume;
    private int numarMotoare;
    private int capacitate;

    public Barca (){
        super("motor2","benzina");
        this.lungime = 0;
        this.nume = "";
        this.numarMotoare = 0;
        this.capacitate = 0;
    }

    public Barca(String motor, String combustibil, int lungime, String nume, int numarMotoare,int capacitate) {
        super(motor, combustibil);
        this.lungime = lungime;
        this.nume = nume;
        this.numarMotoare = numarMotoare;
        this.capacitate = capacitate;
    }

    public Barca(String motor, String combustibil, int vitezaMaxima, String materialCaroserie, String functionalitate, int lungime, String nume, int numarMotoare,int capacitate) {
        super(motor, combustibil, vitezaMaxima, materialCaroserie, functionalitate);
        this.lungime = lungime;
        this.nume = nume;
        this.numarMotoare = numarMotoare;
        this.capacitate = capacitate;
    }

    public String descriere (){

        String text = "";
        text += super.descriere();
        text += "Lungime: " + this.lungime + "\n";
        text += "Nume: " + this.nume + "\n";
        text += "Numar motoare: " + this.numarMotoare + "\n";
        text += "Capacitate: " + this.capacitate + "\n";
        return text;
    }
    public String toSave (){
        return super.toSave()+","+this.lungime+","+this.nume+","+this.numarMotoare+","+this.capacitate;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarMotoare() {
        return numarMotoare;
    }

    public void setNumarMotoare(int numarMotoare) {
        this.numarMotoare = numarMotoare;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }
}
