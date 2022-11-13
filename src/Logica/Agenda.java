package Logica;

import java.util.ArrayList;

public class Agenda {
    private ArrayList listaSalas = new ArrayList<Sala>();
    private int contSalas;
    public void agendarSala(Sala sala){
        listaSalas.add(sala);
        contSalas++;
    }

    public Agenda() {
        contSalas=1;
    }

    public void mostrarSalas(){
        for(int i=0; i<listaSalas.size();i++){
            System.out.println(listaSalas.get(i));
        }
    }

    public int getContSalas() {
        return contSalas;
    }

    public ArrayList getListaSalas() {
        return listaSalas;
    }
}
