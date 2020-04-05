package ba.unsa.etf.rs.tut4;

import java.util.ArrayList;

public class Artikal {
    private String sifra = "";
    private String naziv = "";
    private double cijena;
    @Override
    public String toString() {
        return sifra + "," + naziv + "," + cijena;
    }

    @Override
    public boolean equals(Object o){
        Artikal artikal=(Artikal) o;
        if(!(o instanceof Artikal))return false;
        if(artikal.sifra.equals(this.sifra) && artikal.naziv.equals(this.naziv) && Double.compare(artikal.getCijena(),this.cijena)==0) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void izbaciDuplikate(ArrayList<Artikal> proizvodi){
        for(int i=0;i<proizvodi.size();i++){
            for(int j=i+1;j<proizvodi.size();j++)
                if(proizvodi.get(i).equals(proizvodi.get(j))){
                    proizvodi.remove(j);
                    j--;
                }
        }
    }
    public Artikal(){
    }
    public Artikal(String sifra, String naziv, double cijena) {
        setSifra(sifra);
        setNaziv(naziv);
        setCijena(cijena);
    }

    public Artikal(String podaci) {
        String [] p = podaci.split(",");
        setSifra(p[0]);
        setNaziv(p[1]);
        setCijena(Double.parseDouble(p[2]));
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
            throw new IllegalArgumentException("Naziv je prazna");
        }
        this.naziv = naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        if(cijena<=0){
            throw new IllegalArgumentException("Cijena je negativna");
        }
        this.cijena = cijena;
    }


}