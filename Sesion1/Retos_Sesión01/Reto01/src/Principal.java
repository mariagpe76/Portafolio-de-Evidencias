import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Paciente paciente1 = new Paciente(sc);

        paciente1.mostrarInformacion();
    }
}