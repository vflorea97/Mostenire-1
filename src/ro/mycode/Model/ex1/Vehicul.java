package ro.mycode.Model.ex1;

public class Vehicul {

    private String motor;
    private String combustibil;
    private int vitezaMaxima;
    private String materialCaroserie;
    private String functionalitate;


//    public Vehicul (){
//        this.motor = "";
//        this.combustibil = "";
//        this.vitezaMaxima = 0;
//        this.materialCaroserie = "";
//        this.functionalitate = "";
//        System.out.println("eu sunt constructorul fara parametrii din vehicul");
//    }


    public Vehicul(String motor, String combustibil) {
        this.motor = motor;
        this.combustibil = combustibil;
        System.out.println("Constructorul cu 2 parametrii din vehicul");
    }

    public Vehicul (String motor, String combustibil, int vitezaMaxima, String materialCaroserie, String functionalitate){
        this.motor = motor;
        this.combustibil = combustibil;
        this.vitezaMaxima = vitezaMaxima;
        this.materialCaroserie = materialCaroserie;
        this.functionalitate = functionalitate;
        System.out.println("Constructorul cu toti parametrii din vehicul");
    }

    public String toSave() {
        return this.motor+","+this.combustibil+","+this.vitezaMaxima+","+this.materialCaroserie+","+this.functionalitate;
    }
    public String descriere(){
        String text = "";
        text += "Motor: " + this.motor + "\n";
        text += "Combustibil: " + this.combustibil + "\n";
        text += "Viteza maxima: " + this.vitezaMaxima + "\n";
        text += "Material caroserie: " + this.materialCaroserie + "\n";
        text += "Functionalitate: " + this.functionalitate + "\n";
        return text;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public String getMaterialCaroserie() {
        return materialCaroserie;
    }

    public void setMaterialCaroserie(String materialCaroserie) {
        this.materialCaroserie = materialCaroserie;
    }

    public String getFunctionalitate() {
        return functionalitate;
    }

    public void setFunctionalitate(String functionalitate) {
        this.functionalitate = functionalitate;
    }
}
