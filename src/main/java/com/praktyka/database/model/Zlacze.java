package com.praktyka.database.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "zlacze")
public class Zlacze {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int zlacze_id;

    @NotNull
    private String nazwa;
    private double dlugosc;
    private String opis;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    @JoinColumn(name = "sala_id", nullable = false)
    private Sala sala;

    public Zlacze() {
    }

    public Zlacze(String nazwa, double dlugosc, String opis) {
        this.nazwa = nazwa;
        this.dlugosc = dlugosc;
        this.opis = opis;
    }

    public int getZlacze_id() {
        return zlacze_id;
    }

    public void setZlacze_id(int zlacze_id) {
        this.zlacze_id = zlacze_id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
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

    @Override
    public String toString() {
        return "Zlacze{" +
                "zlacze_id=" + zlacze_id +
                ", nazwa='" + nazwa + '\'' +
                ", dlugosc=" + dlugosc +
                ", opis='" + opis + '\'' +
                '}';
    }

}
