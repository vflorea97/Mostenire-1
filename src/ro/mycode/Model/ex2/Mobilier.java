package ro.mycode.Model.ex2;

public class Mobilier {

    private String material;
    private String pozitionare;
    private int greutate;
    private String culoare;
    private int pret;

    public Mobilier(String material, String pozitionare, int greutate, String culoare, int pret) {
        this.material = material;
        this.pozitionare = pozitionare;
        this.greutate = greutate;
        this.culoare = culoare;
        this.pret = pret;
    }

    public String descriere (){
        String text = "";
        text += "Material: " + this.material + "\n";
        text += "Pozitionare: " + this.pozitionare + "\n";
        text += "Greutate: " + this.greutate + "\n";
        text += "Culoare: " + this.culoare + "\n";
        text += "Pret: " + this.pret + "\n";
        return text;
    }

    public String toSave (){
        return this.material+","+this.pozitionare+","+this.greutate+","+this.culoare+","+this.pret;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPozitionare() {
        return pozitionare;
    }

    public void setPozitionare(String pozitionare) {
        this.pozitionare = pozitionare;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
