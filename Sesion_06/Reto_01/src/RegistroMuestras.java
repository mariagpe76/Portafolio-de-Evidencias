import java.util.*;
public class RegistroMuestras {
    public static void main(String[] args) {
        // Orden de llegada de muestras
        List<String> muestrasRecibidas = new ArrayList<>();
        muestrasRecibidas.add("Homo sapiens");
        muestrasRecibidas.add("Mus musculus");
        muestrasRecibidas.add("Arabidopsis thaliana");
        muestrasRecibidas.add("Homo sapiens"); // Llega repetido

        System.out.println("📋 Orden de llegada de las muestras:");
        for (String muestra : muestrasRecibidas) {
            System.out.println("- " + muestra);
        }

        // Validar especies únicas (sin duplicados)
        HashSet<String> especiesUnicas = new HashSet<>(muestrasRecibidas);

        System.out.println("\n✅ Especies únicas procesadas (sin duplicados):");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // Código de muestra asociado a un investigador
        Map<String, String> catalogoMuestras = new HashMap<>();
        catalogoMuestras.put("M-1001", "Dra. López");
        catalogoMuestras.put("M-1002", "Dr. Hernández");
        catalogoMuestras.put("M-1003", "Dra. Cuevas");

        System.out.println("\n📇 Muestra de especies (ID de muestra -> Investigador):");
        for (Map.Entry<String, String> entrada : catalogoMuestras.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }

        // 🔎 Buscar descripción a partir del código
        String codigoBuscado = "M-1002";
        System.out.println("\n🔍 Descripción de la muestra " + codigoBuscado + ": " + catalogoMuestras.get(codigoBuscado));
    }
}