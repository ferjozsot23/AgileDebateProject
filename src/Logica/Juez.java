package Logica;

public class Juez extends Participante{
    private String rolJuez;

    public Juez(int idparticipante, String nombres, String nickname, double sociedadDebate, String rolJuez) {
        super(idparticipante, nombres, nickname, sociedadDebate);
        this.rolJuez = rolJuez;
    }
}
