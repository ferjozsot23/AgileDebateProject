package Logica;

import java.util.Scanner;

public abstract class Participante {
    private int idparticipante;
    private String nombres;
    private String nickname;
    private double sociedadDebate;


    public Participante(int idparticipante, String nombres, String nickname, double sociedadDebate) {
        this.idparticipante = idparticipante;
        this.nombres = nombres;
        this.nickname = nickname;
        this.sociedadDebate = sociedadDebate;
    }

    public void escogerRol(){
        Scanner sc = new Scanner(System.in);
        int opc = sc.nextInt();

        switch (opc){
        }

    }

    public void escogerTipoMocion(){


    }
}
