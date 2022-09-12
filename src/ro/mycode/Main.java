package ro.mycode;

import ro.mycode.Model.ex1.Avion;
import ro.mycode.Model.ex1.Barca;
import ro.mycode.Model.ex1.Masina;
import ro.mycode.Model.ex2.Dulap;
import ro.mycode.Model.ex2.Masa;
import ro.mycode.Model.ex2.Scaun;

public class Main {

    public static void main(String[] args) {

//        Vehicul vehicul= new Vehicul();
//        vehicul.
        Avion avion = new Avion();
        avion.setAltitudine(8000);
        avion.setNumarIndiviziEchipaj(7);
        avion.setCompanie("Tarom");
        avion.setAeroport("Otopeni");
        avion.setVitezaMaxima(321);

        Barca barca = new Barca();
        barca.setCapacitate(20);
        barca.setLungime(14);
        barca.setNumarMotoare(2);
        barca.setNume("Perla");
        barca.setCombustibil("benzina");

        Masina masina = new Masina();
        masina.setCuloareMasina("albastra");
        masina.setFirmaMasina("Volvo");
        masina.setFirmaCurier("FanCourier");
        masina.setNumarUsi(4);


        Dulap dulap = new Dulap();
        dulap.setNumarUsi(2);
        dulap.setNumarCompartimente(12);
        dulap.setTipUsi("Glisante");

        Scaun scaun = new Scaun();
        scaun.setNumarPicioare(4);
        scaun.setMaterialPicioare("Metal");
        scaun.setReglabil("Da");
        scaun.setManere("Nu");

        Masa masa = new Masa();
        masa.setForma("Dreptunghiulara");
        masa.setModel("Natural");
        masa.setNumarPersoane(6);
        masa.setTip("Fixa");


        System.out.println(masa.descriere());


    }
}
