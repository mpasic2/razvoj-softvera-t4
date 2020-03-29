package ba.unsa.etf.rs.tut4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Artikal {

    private String sifra;
    private String naziv;
    private double cijena;

    public Artikal(String artikli) {
        String[] atributi = artikli.split(",");
        this.sifra =atributi[0];
        this.naziv = atributi[1];
        this.cijena = Double.parseDouble(atributi[2]);
    }
    public static ObservableList<Artikal> izbaciDuplikate(ArrayList<Artikal> artikli) {
        ArrayList<Artikal> pomLista = new ArrayList<Artikal>();
        pomLista.add(artikli.get(0));
        for(int i=1; i<artikli.size(); i++){
            boolean ponavljaSe = false;
            for(int j=0; j<pomLista.size(); j++){
                if(artikli.get(i)==pomLista.get(j))
                    ponavljaSe=true;
            }
            if(!ponavljaSe)
                pomLista.add(artikli.get(i));
        }

        ObservableList<Artikal> rez = FXCollections.observableArrayList();
        rez.addAll(pomLista);
        return rez;
    }


    public Artikal(String sifra, String artikal, double cijena) {

        this.sifra = sifra;
        this.naziv = artikal;
        this.cijena = cijena;
    }


    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        if(sifra.isEmpty()){
            throw new IllegalArgumentException("Šifra je prazna");
        }
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        if(naziv.isEmpty()){
            throw new IllegalArgumentException("Naziv je prazan");
        }
        this.naziv = naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        if (cijena < 0) {
            throw new IllegalArgumentException("Cijena je negativna");
        }
        this.cijena = cijena;
    }
    @Override
    public String toString() {
        return sifra+", "+naziv+", "+cijena;
    }



}
