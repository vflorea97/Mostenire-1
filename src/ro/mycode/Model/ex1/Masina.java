package ro.mycode.Model.ex1;

public class Masina extends Vehicul{

    private int numarUsi;
    private String firmaMasina;
    private String firmaCurier;
    private String culoareMasina;


    public Masina(){
        super("motor3","motorina",220,"metal","livrari");
        this.numarUsi = 0;
        this.firmaMasina = "";
        this.firmaCurier = "";
        this.culoareMasina = "";
    }

    public Masina(String motor, String combustibil, int numarUsi, String firmaMasina, String firmaCurier, String culoareMasina) {
        super(motor, combustibil);
        this.numarUsi = numarUsi;
        this.firmaMasina = firmaMasina;
        this.firmaCurier = firmaCurier;
        this.culoareMasina = culoareMasina;
    }

    public Masina(String motor, String combustibil, int vitezaMaxima, String materialCaroserie, String functionalitate, int numarUsi, String firmaMasina, String firmaCurier, String culoareMasina) {
        super(motor, combustibil, vitezaMaxima, materialCaroserie, functionalitate);
        this.numarUsi = numarUsi;
        this.firmaMasina = firmaMasina;
        this.firmaCurier = firmaCurier;
        this.culoareMasina = culoareMasina;
    }

    public String descriere (){
        String text = "";
        text += super.descriere();
        text += "Numar usi: " + this.numarUsi + "\n";
        text += "Firma masina: " + this.firmaMasina + "\n";
        text += "Firma curier: " + this.firmaCurier + "\n";
        text += "Culoare: " + this.culoareMasina + "\n";
        return text;
    }

    public String toSave (){
        return super.toSave()+","+this.numarUsi+","+this.firmaMasina+","+this.firmaCurier+","+this.culoareMasina;
    }

    public int getNumarUsi() {
        return numarUsi;
    }

    public void setNumarUsi(int numarUsi) {
        this.numarUsi = numarUsi;
    }

    public String getFirmaMasina() {
        return firmaMasina;
    }

    public void setFirmaMasina(String firmaMasina) {
        this.firmaMasina = firmaMasina;
    }

    public String getFirmaCurier() {
        return firmaCurier;
    }

    public void setFirmaCurier(String firmaCurier) {
        this.firmaCurier = firmaCurier;
    }

    public String getCuloareMasina() {
        return culoareMasina;
    }

    public void setCuloareMasina(String culoareMasina) {
        this.culoareMasina = culoareMasina;
    }
}
