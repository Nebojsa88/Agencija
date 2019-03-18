package com.aad.agencijazanekretnine.db.model;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = Nekretnina.TABLE_NAME_USERS)
public class Nekretnina {

    public static final String TABLE_NAME_USERS = "nekretnina";
    public static final String FIELD_NAME_ID     = "id";
    public static final String TABLE_NEKRETNINA_NAZIV = "naziv";
    public static final String TABLE_NEKRETNINA_OPIS = "opis";
    public static final String TABLE_NEKRETNINA_ADRESA = "adresa";
    public static final String TABLE_NEKRETNINA_BR_TEL = "broj_tel";
    public static final String TABLE_NEKRETNINA_BR_SOBA = "broj_soba";
    public static final String TABLE_NEKRETNINA_KVADRATURA = "kvadratura";
    public static final String TABLE_NEKRETNINA_CENA = "cena";

    @DatabaseField(columnName = FIELD_NAME_ID, generatedId = true)
    private int id;

    @DatabaseField(columnName = TABLE_NEKRETNINA_NAZIV)
    private String naziv;

    @DatabaseField(columnName = TABLE_NEKRETNINA_OPIS)
    private String opis;

    @DatabaseField(columnName = TABLE_NEKRETNINA_ADRESA)
    private String adresa;

    @DatabaseField(columnName = TABLE_NEKRETNINA_BR_TEL)
    private String btTel;

    @DatabaseField(columnName = TABLE_NEKRETNINA_BR_SOBA)
    private double brSoba;

    @DatabaseField(columnName = TABLE_NEKRETNINA_KVADRATURA)
    private double kvadratura;

    @DatabaseField(columnName = TABLE_NEKRETNINA_CENA)
    private double cena;

    public Nekretnina(){

        
    }

    public Nekretnina(int id, String naziv, String opis, String adresa, String btTel, double brSoba, double kvadratura, double cena) {
        this.id = id;
        this.naziv = naziv;
        this.opis = opis;
        this.adresa = adresa;
        this.btTel = btTel;
        this.brSoba = brSoba;
        this.kvadratura = kvadratura;
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getBtTel() {
        return btTel;
    }

    public void setBtTel(String btTel) {
        this.btTel = btTel;
    }

    public double getBrSoba() {
        return brSoba;
    }

    public void setBrSoba(double brSoba) {
        this.brSoba = brSoba;
    }

    public double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(double kvadratura) {
        this.kvadratura = kvadratura;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return naziv + adresa;
    }
}
