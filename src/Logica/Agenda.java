package Logica;

public class Agenda {
    private int[][] horario = new int[7][24];

    public Agenda() {
        this.inicializar();
    }

    public void inicializar(){
        for(int i = 0; i<7; i++){
            for(int j = 0; j< 24; j++){
                horario[i][j] = 0;
            }
        }
    }
}
