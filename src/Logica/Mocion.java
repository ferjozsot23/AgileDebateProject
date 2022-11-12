package Logica;

public class Mocion {
    private int id;
    private String descripcion;
    private String tipo;

    public Mocion(int id, String descripcion, String tipo) {
        this.id = id;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Moción --> " +
                "\tID:" + id +
                "\tDescripción:" + descripcion  +
                "\tTipo=" + tipo;
    }
}
