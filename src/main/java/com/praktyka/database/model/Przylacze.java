package com.praktyka.database.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "przylacze")
public class Przylacze {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int przylacze_id;

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

    public Przylacze() {
    }

    public Przylacze(String nazwa, String opis) {
        this.nazwa = nazwa;
        this.opis = opis;
    }

    public int getPrzylacze_id() {
        return przylacze_id;
    }

    public void setPrzylacze_id(int przylacze_id) {
        this.przylacze_id = przylacze_id;
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
        return "Przylacze{" +
                "przylacze_id=" + przylacze_id +
                ", nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
