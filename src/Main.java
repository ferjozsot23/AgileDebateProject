import Interfaces.LoginWindow;
import Logica.Agenda;
import Logica.Participante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Con consola
        Scanner sc = new Scanner(System.in);
        Agenda agendaSalas = new Agenda();

        Participante participante = new Participante(1, "Juan", "El destructor", "OFN");

        //Proponer al usuario las opciones disponibles
        mostrarMenu(agendaSalas, participante);



        //Con interfaces
        //star();
    }

    private static void  mostrarMenu(Agenda agendaSalas, Participante participante) {
        Scanner sc = new Scanner(System.in);
        String menu = "";

        menu +=  "--------Bienvenido--------\n";
        menu += "Opciones:\n";
        menu += "1: Crear Sala\n";
        menu += "2: Unirme a Sala\n";
        menu += "0: Finalizar\n";
        menu += "Ingrese la opción que desea: ";

        System.out.print(menu);
        int opcion = sc.nextInt();

        if(opcion == 1) {
            participante.crearSala(agendaSalas);
            mostrarMenu(agendaSalas, participante);
        }
        if(opcion == 2) {
            participante.unirseSala(agendaSalas);
            mostrarMenu(agendaSalas, participante);
        }
        if(opcion == 0) {
            System.exit(0);
        }
    }


    private static void star(){
        LoginWindow dialog = new LoginWindow();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}