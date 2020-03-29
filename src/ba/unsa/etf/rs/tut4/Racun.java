package ba.unsa.etf.rs.tut4;

import java.util.ArrayList;

public class Racun {
    static class stavkaRacuna{
        private Artikal artikl;
        private Integer kolicina;

        public stavkaRacuna(Artikal artikl, Integer kolicina) {
            this.artikl = artikl;
            this.kolicina = kolicina;
        }

        public Artikal getArtikl() {
            return artikl;
        }

        public void setArtikl(Artikal artikl) {
            this.artikl = artikl;
        }

        public Integer getKolicina() {
            return kolicina;
        }

        public void setKolicina(Integer kolicina) {
            this.kolicina = kolicina;
        }
    }
    private ArrayList<stavkaRacuna> stavkaRacuna;

    public Racun() {
        stavkaRacuna = new ArrayList<>();
    }

    public void dodajStavku(Artikal artikal, int kolicina ){
        stavkaRacuna.add(new stavkaRacuna(artikal,kolicina));

    }
    public double ukupanIznos(){
        double suma=0;
        for(int i=0; i<stavkaRacuna.size(); i++){
            suma+=stavkaRacuna.get(i).getKolicina()*stavkaRacuna.get(i).artikl.getCijena();

        }
        return suma;
    }
}
