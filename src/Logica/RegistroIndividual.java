package Logica;

public class RegistroIndividual {
    private int idRegistro;
    private int idParticipante;
    private boolean esJuez;
    private int sala;

    public RegistroIndividual(int idRegistro, int idParticipante, boolean esJuez, int sala) {
        this.idRegistro = idRegistro;
        this.idParticipante = idParticipante;
        this.esJuez = esJuez;
        this.sala = sala;
    }
}
