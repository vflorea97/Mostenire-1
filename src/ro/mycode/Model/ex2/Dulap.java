package ro.mycode.Model.ex2;

public class Dulap extends Mobilier{

    private int numarUsi;
    private int numarCompartimente;
    private String tipUsi;

    public Dulap(){
        super("pal","dormitor",100,"maro",2000);
        this.numarUsi = 0;
        this.numarCompartimente = 0;
        this.tipUsi = "";
    }

    public Dulap(String material, String pozitionare, int greutate, String culoare, int pret, int numarUsi, int numarCompartimente, String tipUsi) {
        super(material, pozitionare, greutate, culoare, pret);
        this.numarUsi = numarUsi;
        this.numarCompartimente = numarCompartimente;
        this.tipUsi = tipUsi;
    }

    public String descriere (){
        String text = "";
        text += super.descriere();
        text += "Numar usi: " + this.numarUsi + "\n";
        text += "Numar compartimente:" + this.numarCompartimente + "\n";
        text += "Tip usi: " + this.tipUsi + "\n";
        return text;
    }

    public String toSave (){
        return super.toSave()+","+this.numarUsi+","+this.numarCompartimente+","+this.tipUsi;
    }

    public int getNumarUsi() {
        return numarUsi;
    }

    public void setNumarUsi(int numarUsi) {
        this.numarUsi = numarUsi;
    }

    public int getNumarCompartimente() {
        return numarCompartimente;
    }

    public void setNumarCompartimente(int numarCompartimente) {
        this.numarCompartimente = numarCompartimente;
    }

    public String getTipUsi() {
        return tipUsi;
    }

    public void setTipUsi(String tipUsi) {
        this.tipUsi = tipUsi;
    }
}
