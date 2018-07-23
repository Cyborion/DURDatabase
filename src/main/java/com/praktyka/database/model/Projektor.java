package com.praktyka.database.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "projektor")
public class Projektor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projektor_id;

    @NotNull
    private String model;
    @NotNull
    private String numer_seryjny;
    private String adres_ip;
    private String adres_mac;
    private String wersja_oprogr;
    private String opis;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    @JoinColumn(name = "sala_id")
    private Sala sala;

    @OneToMany(mappedBy = "projektor",
            fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    private List<Lampa> lampaList;

    // dodatkowa funkcja

    public void addLampa(Lampa lampa) {
        if (lampaList == null) {
            lampaList = new ArrayList<>();
        }
        lampaList.add(lampa);
        lampa.setProjektor(this);
    }

    // konstruktory

    public Projektor() {
    }

    public Projektor(String model, String numer_seryjny, String adres_ip, String adres_mac, String wersja_oprogr, String opis) {
        this.model = model;
        this.numer_seryjny = numer_seryjny;
        this.adres_ip = adres_ip;
        this.adres_mac = adres_mac;
        this.wersja_oprogr = wersja_oprogr;
        this.opis = opis;
    }

    // getter & setter

    public int getProjektor_id() {
        return projektor_id;
    }

    public void setProjektor_id(int projektor_id) {
        this.projektor_id = projektor_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumer_seryjny() {
        return numer_seryjny;
    }

    public void setNumer_seryjny(String numer_seryjny) {
        this.numer_seryjny = numer_seryjny;
    }

    public String getAdres_ip() {
        return adres_ip;
    }

    public void setAdres_ip(String adres_ip) {
        this.adres_ip = adres_ip;
    }

    public String getAdres_mac() {
        return adres_mac;
    }

    public void setAdres_mac(String adres_mac) {
        this.adres_mac = adres_mac;
    }

    public String getWersja_oprogr() {
        return wersja_oprogr;
    }

    public void setWersja_oprogr(String wersja_oprogr) {
        this.wersja_oprogr = wersja_oprogr;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public List<Lampa> getLampaList() {
        return lampaList;
    }

    public void setLampaList(List<Lampa> lampaList) {
        this.lampaList = lampaList;
    }

    @Override
    public String toString() {
        return "Projektor{" +
                "projektor_id=" + projektor_id +
                ", model='" + model + '\'' +
                ", numer_seryjny='" + numer_seryjny + '\'' +
                ", adres_ip='" + adres_ip + '\'' +
                ", adres_mac='" + adres_mac + '\'' +
                ", wersja_oprogr='" + wersja_oprogr + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
