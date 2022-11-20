package Logica;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Participante {
    private int idparticipante;
    private String nombres;
    private String contraseña;
    private String nickname;
    private String sociedadDebate;

    //Constructores
    public Participante(int idparticipante, String nombres, String nickname, String sociedadDebate) {
        this.idparticipante = idparticipante;
        this.nombres = nombres;
        this.nickname = nickname;
        this.sociedadDebate = sociedadDebate;
    }

    public Participante(int idparticipante, String nombres, String contraseña) {
        this.idparticipante = idparticipante;
        this.nombres = nombres;
        this.contraseña = contraseña;
    }

    //Getters
    public String getNombres() {
        return nombres;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getIdparticipante() {
        return idparticipante;
    }

    public void crearSala(Agenda agenda){
        Scanner sc = new Scanner(System.in);
        int día = obtenerDia();
        int hora = obtenerHora();
        boolean esJuez= obtenerRol();
        int tipoMocion = obtenerTipoMocion();

        System.out.println("Ingrese el nombre de la sala");
        String nombreSala = sc.next();

        Date date = Date.from(Instant.now());
        Sala sala = new Sala(agenda.getContSalas(),nombreSala,date , tipoMocion);
        agenda.agendarSala(sala);
        unirRegistroASala(agenda, sala, esJuez);
        System.out.println("Sala creada con éxito "+ sala.toString());
    }

    public void unirRegistroASala(Agenda agenda,Sala sala, boolean esJuez){
        int idRegistro = sala.getListaRegistroLenght();
        RegistroIndividual regInd = new RegistroIndividual(sala.getListaRegistroLenght(),this.idparticipante, esJuez, sala.getIdSala());
        sala.addRegistroInd(regInd);
    }

    public void unirseSala(Agenda agenda) {
        Scanner sc = new Scanner(System.in);
        agenda.mostrarSalas();
        System.out.println("Ingrese el ID de la sala a unirse");
        int idSala = sc.nextInt();

        boolean esJuez = obtenerRol();

        unirRegistroSalaCreada(agenda,idSala, esJuez);
        System.out.println("Ingreso a sala con éxito "+ ((Sala)agenda.getListaSalas().get(idSala-1)).toString());

    }

    public void unirRegistroSalaCreada(Agenda agenda, int idSala, boolean esJuez){
        int idRegistro = ((Sala)agenda.getListaSalas().get(idSala-1)).getListaRegistroLenght();
        RegistroIndividual regInd = new RegistroIndividual(idRegistro,this.idparticipante, esJuez, idSala);

        ((Sala) agenda.getListaSalas().get(idSala-1)).addRegistroInd(regInd);
        ((Sala) agenda.getListaSalas().get(idSala-1)).aumentarDebatientes();
    }

    public int obtenerDia(){
        System.out.println("¿Qué día de la semana desea participar?+" +
                "\n1:Lunes" +
                "\n--------" +
                "\n7:Domingo" +
                "\n Ingrese un numero(1-7)");
        Scanner sc = new Scanner(System.in);
        //-----------------------
        int día = sc.nextInt();
        return día;
    }

    public int obtenerHora(){
        System.out.println("¿Qué hora del día desea participar?" +
                "\nIngrese un número del 1 al 24");
        Scanner sc = new Scanner(System.in);
        //-----------------------
        int hora = sc.nextInt();
        return hora;
    }

    public boolean obtenerRol(){
        //--------------------
        System.out.println("¿Qué rol desea cumplir?" +
                "\n 0: Debatiente" +
                "\n 1: Juez");
        Scanner sc = new Scanner(System.in);
        int rol = sc.nextInt();
        boolean esJuez = false;
        if(rol==1){
            esJuez=true;
        }
        return esJuez;
    }

    public int obtenerTipoMocion(){
        Scanner sc = new Scanner(System.in);
        //-------------------
        System.out.println("Ingrese el tipo de moción" +
                "\n1:Aleatoria" +
                "\n2:Analisis" +
                "\n3:Políticas" +
                "\n4:Narrativas");
        int tipoMocion = sc.nextInt();
        return tipoMocion;
    }

    public void escogerTipoMocion(){

    }
}
