import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> consumosCPU = new HashSet<>();

        System.out.println("💻 Monitor de Consumo de CPU");
        System.out.println("Ingrese 'fin' para terminar.");

        String entrada;
        int consumo;
        try {
            while (true) {
                System.out.print("\nIngrese consumo de CPU de los servidores: ");
                entrada = scanner.nextLine();

                if (entrada.equalsIgnoreCase("fin")) {
                    break;
                }

                try {
                    consumo = Integer.parseInt(entrada);
                    if (consumo < 0 || consumo > 100) {
                        System.out.println("❌ Error: El valor debe estar entre 0% y 100%.");
                    }else if (consumosCPU.contains(consumo)) {
                        System.out.println("⚠️ Advertencia: El valor ya fue registrado.");
                    }
                    else {
                        consumosCPU.add(consumo);
                        System.out.println("\n✔ Consumo registrado -> " + consumo + "%");
                        if (consumo > 95) {
                            System.out.println("⚠️ ¡Alerta! Consumo de CPU alto, consumo de 🚨 " + consumo + "%.");
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("❌ Error: Ingrese un valor numérico.");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("\n📄 Reporte Final");
            if (consumosCPU.isEmpty()) {
                System.out.println("No se registraron consumos de CPU.");
            } else {
                System.out.println("Consumos de CPU registrados: " + consumosCPU);
            }

        } finally {
            scanner.close();
        }
    }
}