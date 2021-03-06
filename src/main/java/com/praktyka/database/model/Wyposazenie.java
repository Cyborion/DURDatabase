package com.praktyka.database.model;

import javax.persistence.*;

@Entity(name = "wyposazenie")
public class Wyposazenie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wyposazenie_id;

    private String rolety;
    private String oswietlenie;
    private String pilot;
    private String inne;
    private String opis;

    @OneToOne(fetch = FetchType.LAZY,
            optional = false)
    @JoinColumn(name = "sala_id", nullable = false)
    private Sala sala;

    public Wyposazenie() {
    }

    public Wyposazenie(String rolety, String oswietlenie, String pilot, String inne, String opis) {
        this.rolety = rolety;
        this.oswietlenie = oswietlenie;
        this.pilot = pilot;
        this.inne = inne;
        this.opis = opis;
    }

    public int getWyposazenie_id() {
        return wyposazenie_id;
    }

    public void setWyposazenie_id(int wyposazenie_id) {
        this.wyposazenie_id = wyposazenie_id;
    }

    public String getRolety() {
        return rolety;
    }

    public void setRolety(String rolety) {
        this.rolety = rolety;
    }

    public String getOswietlenie() {
        return oswietlenie;
    }

    public void setOswietlenie(String oswietlenie) {
        this.oswietlenie = oswietlenie;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public String getInne() {
        return inne;
    }

    public void setInne(String inne) {
        this.inne = inne;
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
        return "Wyposazenie{" +
                "wyposazenie_id=" + wyposazenie_id +
                ", rolety='" + rolety + '\'' +
                ", oswietlenie='" + oswietlenie + '\'' +
                ", pilot='" + pilot + '\'' +
                ", inne='" + inne + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
