package Logica;

import java.util.ArrayList;

public class Debate {
    private int idDebate;
    private Juez juezPrincipal;
    private ArrayList panelistas = new ArrayList<Juez>();
    private Mocion mocion;
    private ArrayList CAO = new ArrayList<Debatiente>();
    private ArrayList CAG = new ArrayList<Debatiente>();
    private ArrayList CBG = new ArrayList<Debatiente>();
    private ArrayList CBO = new ArrayList<Debatiente>();

    public Debate(int idDebate, Juez juezPrincipal, ArrayList panelistas, Mocion mocion, ArrayList CAO, ArrayList CAG, ArrayList CBG, ArrayList CBO) {
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
