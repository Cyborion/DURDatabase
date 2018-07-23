package com.praktyka.database.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "visualizer")
public class Visualizer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int visualizer_id;

    @NotNull
    private String model;
    private String opis;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    @JoinColumn(name = "sala_id", nullable = false)
    private Sala sala;

    public Visualizer() {
    }

    public Visualizer(String model, String opis) {
        this.model = model;
        this.opis = opis;
    }

    public int getVisualizer_id() {
        return visualizer_id;
    }

    public void setVisualizer_id(int visualizer_id) {
        this.visualizer_id = visualizer_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
        return "Visualizer{" +
                "visualizer_id=" + visualizer_id +
                ", model='" + model + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }

}
