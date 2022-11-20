package Logica;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        //-----------------------
        System.out.println("¿Qué día de la semana desea participar?+" +
                "\n1:Lunes" +
                "\n--------" +
                "\n7:Domingo" +
                "\n Ingrese un numero(1-7)");
        int día = sc.nextInt();
        //--------------------
        System.out.println("¿Qué hora del día desea participar?" +
                "\nIngrese un número del 1 al 24");
        int hora = sc.nextInt();
        //--------------------
        System.out.println("¿Qué rol desea cumplir?" +
                "\n 0: Debatiente" +
                "\n 1: Juez");
        int rol = sc.nextInt();
        boolean esJuez=false;
        if(rol==1){
            esJuez=true;
        }
        //-------------------
        System.out.println("Ingrese el tipo de moción" +
                "\n1:Aleatoria" +
                "\n2:Analisis" +
                "\n3:Políticas" +
                "\n4:Narrativas");
        int tipoMocion = sc.nextInt();

        System.out.println("Ingrese el nombre de la sala");
        String nombreSala = sc.next();

        Date date = Date.from(Instant.now());
        Sala sala = new Sala(agenda.getContSalas(),nombreSala,date , tipoMocion);
        RegistroIndividual regInd = new RegistroIndividual(sala.getListaRegistroLenght(),this.idparticipante, esJuez, sala.getIdSala());
        sala.addRegistroInd(regInd);
        agenda.agendarSala(sala);
        System.out.println("Sala creada con éxito "+ sala.toString());

    }

    public void unirseSala(Agenda agenda) {
        Scanner sc = new Scanner(System.in);
        agenda.mostrarSalas();
        System.out.println("Ingrese el ID de la sala a unirse");
        int idSala = sc.nextInt();
        System.out.println("¿Qué rol desea cumplir?" +
                "\n 0: Debatiente" +
                "\n 1: Juez");
        int rol = sc.nextInt();
        boolean esJuez=false;
        if(rol==1){
            esJuez=true;
        }

        RegistroIndividual regInd = new RegistroIndividual(((Sala)agenda.getListaSalas().get(idSala-1)).getListaRegistroLenght(),this.idparticipante, esJuez, idSala);
        ((Sala) agenda.getListaSalas().get(idSala-1)).addRegistroInd(regInd);
        ((Sala) agenda.getListaSalas().get(idSala-1)).aumentarNum();
        System.out.println("Ingreso a sala con éxito "+ ((Sala)agenda.getListaSalas().get(idSala-1)).toString());


    }



    public void escogerTipoMocion(){


    }
}
