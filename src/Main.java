import Interfaces.LoginWindow;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        star();
    }

    public static void star(){
        LoginWindow dialog = new LoginWindow();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}