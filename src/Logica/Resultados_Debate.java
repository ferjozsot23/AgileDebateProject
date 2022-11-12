package Logica;

import java.util.ArrayList;

public class Resultados_Debate {
    private int idDebate;
    private ArrayList resultadosDebate = new ArrayList<String>();
    private ArrayList speakerPoints = new ArrayList<Integer>();

    public Resultados_Debate(int idDebate, ArrayList resultadosDebate, ArrayList speakerPoints) {
        this.idDebate = idDebate;
        this.resultadosDebate = resultadosDebate;
        this.speakerPoints = speakerPoints;
    }
}
