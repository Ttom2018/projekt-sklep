package model;

import java.math.BigDecimal;

public class Dron extends Produkt{
    public Dron(){}
    protected double zasieg;
    protected   boolean czyMaKamere;
    private static long generatorId = 0L;


    public Dron(String nazwa, BigDecimal cena, double zasieg, boolean czyMaKamere) {
        super(nazwa, cena);
        this.zasieg = zasieg;
        this.czyMaKamere = czyMaKamere;
        generatorId++;
        this.id = generatorId + 1;
    }
    public double getZasieg() {

        return zasieg;
    }

    public boolean CzyMaKamere() {

        return czyMaKamere;
    }

    @Override
    public String toString() {
        return "Dron{" +
                "zasieg=" + zasieg +
                ", czyMaKamere=" + czyMaKamere +
                ", id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
