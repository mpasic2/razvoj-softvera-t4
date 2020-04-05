package ba.unsa.etf.rs.tut4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacunTest {

    @Test
    void test1() {
        Racun r = new Racun();
        r.dodajStavku(new Artikal("HLB", "Hljeb", 1.1), 2);
        r.dodajStavku(new Artikal("JAJ", "Jaje", 0.25), 5);
        assertEquals(3.45, r.ukupanIznos());
    }

    @Test
    void testPrazno() {
        Racun r = new Racun();
        assertEquals(0, r.ukupanIznos());
    }

    //nisam znao nastimati da testovi pokrivaju 100% ali sam dodao 2 nova testa
    /*
    @Test
    void testDodaj() {
        Racun.stavkaRacuna r = new Racun();
        ((Racun) r).dodajStavku (new Artikal("OLV","OLOVKA",1),2);
        r.setArtikl(new Artikal("OLV","OLOVKA",1));
        assertEquals("OLV","OLOVKA",1,r.getArtikl());
    }*/

    @Test
    void testSumirano() {
        Racun r = new Racun();
        r.dodajStavku(new Artikal("STL","STO",150),1);
        r.dodajStavku(new Artikal("STLC","STOLICA",100),2);
        assertEquals(r.ukupanIznos(),350);
    }

}