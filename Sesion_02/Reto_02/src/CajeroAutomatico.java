import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        var saldo = 1000.0;
        int opcion;

        do {
            System.out.println("\n💵 Bienvenido al Cajero Automatico");
            System.out.println("1. Consultar Saldo ");
            System.out.println("2. Depositar Dinero ");
            System.out.println("3. Retirar Dinero ");
            System.out.println("4. Salir ");
            System.out.print("Ingrese su opcion: ");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("Tu saldo es $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = sc.nextDouble();
                    if(deposito <= 0) {
                        System.out.println("El monto no puede ser menor que 0");
                        continue;
                    }
                    saldo += deposito;
                    System.out.println("Tu nuevo saldo es de $" + saldo);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de dinero a retirar: ");
                    double retiro = sc.nextDouble();
                    if(retiro > saldo) {
                        System.out.println("Saldo insuficiente");
                        continue;
                    }
                    if(retiro <= 0) {
                        System.out.println("El monto no puede ser menor que 0");
                    }else {
                        saldo -= retiro;
                        System.out.println("Tu nuevo saldo es de $" + saldo);
                    }
                    break;
                case 4:
                    System.out.println("\n Gracias por su visita, vuelva pronto.");
                    break;
                default:
                    System.out.println("Opción inválida, intenta nuevamente.");
                    break;
            }
        }while(opcion != 4);
        sc.close();
    }
}