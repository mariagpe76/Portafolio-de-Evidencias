import java.util.Scanner;

public class Paciente {
    private String nombre;
    private int edad;
    private String expediente;

    public Paciente(Scanner sc) {
        System.out.print("Nombre del paciente: ");
        this.nombre = sc.nextLine();

        System.out.print("Edad del paciente: ");
        this.edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Número de expediente: ");
        this.expediente = sc.nextLine();
    }
    public void mostrarInformacion(){
        System.out.println("\nPaciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + expediente);
    }
}
