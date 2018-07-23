package com.praktyka.database.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "audio")
public class Audio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int audio_id;

    @NotNull
    private String typ;
    private String opis;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    @JoinColumn(name = "sala_id", nullable = false)
    //   @JsonIgnore
    private Sala sala;

    public Audio() {
    }

    public Audio(String typ, String opis) {
        this.typ = typ;
        this.opis = opis;
    }

    public int getAudio_id() {
        return audio_id;
    }

    public void setAudio_id(int audio_id) {
        this.audio_id = audio_id;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
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
        return "Audio{" +
                "audio_id=" + audio_id +
                ", typ='" + typ + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }

}
