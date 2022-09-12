package ro.mycode.Model.ex2;

public class Masa extends Mobilier{

    private String forma;
    private String model;
    private int numarPersoane;
    private String tip;

    public Masa (){
        super("lemn","bucatarie",50,"maro natur",1500);
        this.forma = "";
        this.model = "";
        this.numarPersoane = 0;
        this.tip = "";
    }

    public Masa(String material, String pozitionare, int greutate, String culoare, int pret, String forma, String model, int numarPersoane, String tip) {
        super(material, pozitionare, greutate, culoare, pret);
        this.forma = forma;
        this.model = model;
        this.numarPersoane = numarPersoane;
        this.tip = tip;
    }

    public String descriere (){
        String text = "";
        text += super.descriere();
        text += "Forma: " + this.forma + "\n";
        text += "Model: " + this.model + "\n";
        text += "Numar persoane: " + this.numarPersoane + "\n";
        text += "Tip: " + this.tip + "\n";
        return text;
    }

    public String toSave (){
        return super.toSave()+","+this.forma+","+this.model+","+this.numarPersoane+","+this.tip;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public void setNumarPersoane(int numarPersoane) {
        this.numarPersoane = numarPersoane;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
