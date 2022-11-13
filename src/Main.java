import Interfaces.LoginWindow;
import Logica.Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Con consola
        Agenda agendaSalas = new Agenda();

        //Proponer al usuario las opciones disponibles
        int opcion = mostrarMenu();

        if(opcion == 1) {
            crearSala(agendaSalas);
        }
        if(opcion == 2) {
            unirseSala(agendaSalas);
        }

        //Con interfaces
        //star();
    }

    private static int  mostrarMenu() {
        String menu = "";

        menu +=  "--------Bienvenido--------\n";
        menu += "Opciones:\n";
        menu += "1: Crear Sala\n";
        menu += "2: Visualizar Sala\n";
        menu += "3: Unirme a Sala\n";
        menu += "Ingrese la opción que desea: ";

        System.out.print(menu);

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        return opcion;
    }

    private static void crearSala(Agenda agenda){
        String mensaje = "";
        mensaje += "";
        System.out.println(mensaje);

    }

    private static void unirseSala(Agenda agenda) {

    }
    private static void star(){
        LoginWindow dialog = new LoginWindow();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}