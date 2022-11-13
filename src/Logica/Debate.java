package Logica;

import java.util.ArrayList;

public class Debate {
    private int idDebate;
    private Participante juezPrincipal;
    private ArrayList panelistas = new ArrayList<Participante>();
    private Mocion mocion;
    private ArrayList CAO = new ArrayList<Participante>();
    private ArrayList CAG = new ArrayList<Participante>();
    private ArrayList CBG = new ArrayList<Participante>();
    private ArrayList CBO = new ArrayList<Participante>();

    public Debate(int idDebate, Participante juezPrincipal, ArrayList panelistas, Mocion mocion, ArrayList CAO, ArrayList CAG, ArrayList CBG, ArrayList CBO) {
        this.idDebate = idDebate;
        this.juezPrincipal = juezPrincipal;
        this.panelistas = panelistas;
        this.mocion = mocion;
        this.CAO = CAO;
        this.CAG = CAG;
        this.CBG = CBG;
        this.CBO = CBO;
    }




}
