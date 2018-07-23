package com.praktyka.database.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "automatyka")
public class Automatyka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int automatyka_id;

    @NotNull
    private String nazwa;
    private String opis;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    @JoinColumn(name = "sala_id", nullable = false)
    private Sala sala;

    public Automatyka() {
    }

    public Automatyka(String nazwa, String opis, Sala sala) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.sala = sala;
    }

    public int getAutomatyka_id() {
        return automatyka_id;
    }

    public void setAutomatyka_id(int automatyka_id) {
        this.automatyka_id = automatyka_id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
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
        return "Automatyka{" +
                "automatyka_id=" + automatyka_id +
                ", nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
