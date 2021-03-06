package com.praktyka.database.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sala_id;

    @NotNull
    private int numer;
    @NotNull
    private char budynek;
    private String opis;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "sala")
    private Wyposazenie wyposazenie;

    @OneToMany(mappedBy = "sala",
            fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    private List<Naprawa> naprawaList;

    @OneToMany(mappedBy = "sala",
            fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    private List<Przylacze> przylaczeList;

    @OneToMany(mappedBy = "sala",
            fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    private List<Zlacze> zlaczeList;

    @OneToMany(mappedBy = "sala",
            fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    private List<Projektor> projektorList;

    @OneToMany(mappedBy = "sala",
            fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    private List<Audio> audioList;


    @OneToMany(mappedBy = "sala",
            fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    private List<Ekran> ekranList;

    @OneToMany(mappedBy = "sala",
            fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    private List<Tablica> tablicaList;

    @OneToMany(mappedBy = "sala",
            fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    private List<Visualizer> visualizerList;

    @OneToMany(mappedBy = "sala",
            fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    private List<Automatyka> automatykaList;

   // dodatkowa funkcja

    public void addAudio(Audio audio) {
        if (audioList == null) {
            audioList = new ArrayList<>();
        }
        audioList.add(audio);
        audio.setSala(this);
    }

    public void addAutomatyka(Automatyka automatyka) {
        if (automatykaList == null) {
            automatykaList = new ArrayList<>();
        }
        automatykaList.add(automatyka);
        automatyka.setSala(this);
    }

    public void addEkran(Ekran ekran) {
        if (ekranList == null) {
            ekranList = new ArrayList<>();
        }
        ekranList.add(ekran);
        ekran.setSala(this);
    }

    public void addNaprawa(Naprawa naprawa) {
        if (naprawaList == null) {
            naprawaList  = new ArrayList<>();
        }
        naprawaList.add(naprawa);
        naprawa.setSala(this);
    }

    public void addProjektor(Projektor projektor) {
        if (projektorList == null) {
            projektorList = new ArrayList<>();
        }
        projektorList.add(projektor);
        projektor.setSala(this);
    }

    public void addPrzylacze(Przylacze przylacze) {
        if (przylaczeList == null) {
            przylaczeList = new ArrayList<>();
        }
        przylaczeList.add(przylacze);
        przylacze.setSala(this);
    }

    public void addTablica(Tablica tablica) {
        if (tablicaList == null) {
            tablicaList = new ArrayList<>();
        }
        tablicaList.add(tablica);
        tablica.setSala(this);
    }

    public void addVisualizer(Visualizer visualizer) {
        if (visualizerList == null) {
            visualizerList = new ArrayList<>();
        }
        visualizerList.add(visualizer);
        visualizer.setSala(this);
    }

    public void addZlacze(Zlacze zlacze) {
        if (zlaczeList == null) {
            zlaczeList = new ArrayList<>();
        }
        zlaczeList.add(zlacze);
        zlacze.setSala(this);
    }

    // konstruktory

    public Sala() {
    }

    public Sala(char budynek, String opis) {
        this.budynek = budynek;
        this.opis = opis;
    }

    // getter & setter

    public int getSala_id() {
        return sala_id;
    }

    public void setSala_id(int sala_id) {
        this.sala_id = sala_id;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public char getBudynek() {
        return budynek;
    }

    public void setBudynek(char budynek) {
        this.budynek = budynek;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Wyposazenie getWyposazenie() {
        return wyposazenie;
    }

    public void setWyposazenie(Wyposazenie wyposazenie) {
        this.wyposazenie = wyposazenie;
    }

    public List<Naprawa> getNaprawaList() {
        return naprawaList;
    }

    public void setNaprawaList(List<Naprawa> naprawaList) {
        this.naprawaList = naprawaList;
    }

    public List<Przylacze> getPrzylaczeList() {
        return przylaczeList;
    }

    public void setPrzylaczeList(List<Przylacze> przylaczeList) {
        this.przylaczeList = przylaczeList;
    }

    public List<Zlacze> getZlaczeList() {
        return zlaczeList;
    }

    public void setZlaczeList(List<Zlacze> zlaczeList) {
        this.zlaczeList = zlaczeList;
    }

    public List<Projektor> getProjektorList() {
        return projektorList;
    }

    public void setProjektorList(List<Projektor> projektorList) {
        this.projektorList = projektorList;
    }

    public List<Audio> getAudioList() {
        return audioList;
    }

    public void setAudioList(List<Audio> audioList) {
        this.audioList = audioList;
    }

    public List<Ekran> getEkranList() {
        return ekranList;
    }

    public void setEkranList(List<Ekran> ekranList) {
        this.ekranList = ekranList;
    }

    public List<Tablica> getTablicaList() {
        return tablicaList;
    }

    public void setTablicaList(List<Tablica> tablicaList) {
        this.tablicaList = tablicaList;
    }

    public List<Visualizer> getVisualizerList() {
        return visualizerList;
    }

    public void setVisualizerList(List<Visualizer> visualizerList) {
        this.visualizerList = visualizerList;
    }

    public List<Automatyka> getAutomatykaList() {
        return automatykaList;
    }

    public void setAutomatykaList(List<Automatyka> automatykaList) {
        this.automatykaList = automatykaList;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "sala_id=" + sala_id +
                ", numer=" + numer +
                ", budynek=" + budynek +
                ", opis='" + opis + '\'' +
                '}';
    }
}
