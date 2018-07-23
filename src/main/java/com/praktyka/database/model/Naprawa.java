package com.praktyka.database.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "naprawa")
public class Naprawa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int naprawa_id;

    @NotNull
    private Date data_naprawy;
    private String opis;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    @JoinColumn(name = "sala_id", nullable = false)
    private Sala sala;

    public Naprawa() {
    }

    public Naprawa(Date data_naprawy, String opis) {
        this.data_naprawy = data_naprawy;
        this.opis = opis;
    }

    public int getNaprawa_id() {
        return naprawa_id;
    }

    public void setNaprawa_id(int naprawa_id) {
        this.naprawa_id = naprawa_id;
    }

    public Date getData_naprawy() {
        return data_naprawy;
    }

    public void setData_naprawy(Date data_naprawy) {
        this.data_naprawy = data_naprawy;
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
        return "Naprawa{" +
                "naprawa_id=" + naprawa_id +
                ", data_naprawy=" + data_naprawy +
                ", opis='" + opis + '\'' +
                '}';
    }
}
