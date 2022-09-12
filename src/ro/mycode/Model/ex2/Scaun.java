package ro.mycode.Model.ex2;

public class Scaun extends Mobilier{

    private int numarPicioare;
    private String materialPicioare;
    private String reglabil;
    private String manere;

    public Scaun (){
        super("textil","living",7,"verde",400);
        this.numarPicioare = 0;
        this.materialPicioare = "";
        this.reglabil = "";
        this.manere = "";
    }

    public Scaun(String material, String pozitionare, int greutate, String culoare, int pret, int numarPicioare, String materialPicioare, String reglabil, String manere) {
        super(material, pozitionare, greutate, culoare, pret);
        this.numarPicioare = numarPicioare;
        this.materialPicioare = materialPicioare;
        this.reglabil = reglabil;
        this.manere = manere;
    }

    public String descriere (){
        String text = "";
        text += super.descriere();
        text += "Numar picioare: " + this.numarPicioare + "\n";
        text += "Material picioare: " + this.materialPicioare + "\n";
        text += "Reglabil: " + this.reglabil + "\n";
        text += "Manere: " + this.manere + "\n";
        return text;
    }

    public String toSave(){
        return super.toSave()+","+this.numarPicioare+","+this.materialPicioare+","+this.reglabil+","+this.manere;
    }

    public int getNumarPicioare() {
        return numarPicioare;
    }

    public void setNumarPicioare(int numarPicioare) {
        this.numarPicioare = numarPicioare;
    }

    public String getMaterialPicioare() {
        return materialPicioare;
    }

    public void setMaterialPicioare(String materialPicioare) {
        this.materialPicioare = materialPicioare;
    }

    public String getReglabil() {
        return reglabil;
    }

    public void setReglabil(String reglabil) {
        this.reglabil = reglabil;
    }

    public String getManere() {
        return manere;
    }

    public void setManere(String manere) {
        this.manere = manere;
    }
}
