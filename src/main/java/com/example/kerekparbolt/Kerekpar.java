package com.example.kerekparbolt;

import java.time.LocalDate;

public class Kerekpar {
    private int cikkSzam;
    private String nev;
    private String tipus;
    private int ar;
    private int hasznalt;
    private int kategoriaId;
    private LocalDate rogzitesDatuma;

    public Kerekpar(String sor) {
        String[] sorSplit = sor.split(";");
        this.cikkSzam = Integer.parseInt(sorSplit[0]);
        this.nev = sorSplit[1];
        this.tipus = sorSplit[2];
        this.ar = Integer.parseInt(sorSplit[3]);
        this.hasznalt = Integer.parseInt(sorSplit[4]);
        this.kategoriaId = Integer.parseInt(sorSplit[5]);
        String datumReplace = sorSplit[6].replace('.', '-');
        this.rogzitesDatuma = LocalDate.parse(datumReplace);
    }

    public int getCikkSzam() {
        return cikkSzam;
    }

    public String getNev() {
        return nev;
    }

    public String getTipus() {
        return tipus;
    }

    public int getAr() {
        return ar;
    }

    public String getHasznalt() {
        switch (this.hasznalt){
            case 1:
                return "Használt";
            case 0:
                return "Új";
            default:
                return "Hibás adat";
        }
    }

    public int getKategoriaId() {
        return kategoriaId;
    }

    public LocalDate getRogzitesDatuma() {
        return rogzitesDatuma;
    }

    public String getKategoriaSzoveg(){
        switch (this.kategoriaId){
            case 1:
                return "férfi";
            case 2:
                return "női";
            case 3:
                return "gyermek";
            default:
                return "Hibás adat";
        }
    }
}
