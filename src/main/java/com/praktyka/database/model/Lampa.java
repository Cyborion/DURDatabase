package com.praktyka.database.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "lampa")
public class Lampa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lampa_id;

    @NotNull
    private int czas_pracy;
    @NotNull
    private Date data_kontroli;
    @NotNull
    private boolean sprawna;
    private String opis;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    @JoinColumn(name = "projektor_id")
    private Projektor projektor;

    public Lampa() {
    }

    public Lampa(Date data_kontroli, boolean sprawna, String opis) {
        this.data_kontroli = data_kontroli;
        this.sprawna = sprawna;
        this.opis = opis;
    }

    public int getLampa_id() {
        return lampa_id;
    }

    public void setLampa_id(int lampa_id) {
        this.lampa_id = lampa_id;
    }

    public int getCzas_pracy() {
        return czas_pracy;
    }

    public void setCzas_pracy(int czas_pracy) {
        this.czas_pracy = czas_pracy;
    }

    public Date getData_kontroli() {
        return data_kontroli;
    }

    public void setData_kontroli(Date data_kontroli) {
        this.data_kontroli = data_kontroli;
    }

    public boolean isSprawna() {
        return sprawna;
    }

    public void setSprawna(boolean sprawna) {
        this.sprawna = sprawna;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Projektor getProjektor() {
        return projektor;
    }

    public void setProjektor(Projektor projektor) {
        this.projektor = projektor;
    }

    @Override
    public String toString() {
        return "Lampa{" +
                "lampa_id=" + lampa_id +
                ", czas_pracy=" + czas_pracy +
                ", data_kontroli=" + data_kontroli +
                ", sprawna=" + sprawna +
                ", opis='" + opis + '\'' +
                '}';
    }
}
