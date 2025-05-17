import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.BufferedReader;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        Path ruta = Paths.get("errores.log");
        Path error = Paths.get("registro_fallos.txt");
        int lineasTotales = 0;
        int erroresTotales = 0;
        int warningTotales = 0;

        try(BufferedReader lector = Files.newBufferedReader(ruta)){
            String linea;
            while ((linea = lector.readLine())!= null){
                lineasTotales++;
                if (linea.contains("ERROR")) {
                    erroresTotales++;
                }
                if (linea.contains("WARNING")) {
                    warningTotales++;
                }
            }
            double porErrores = (lineasTotales > 0) ? ((double) erroresTotales / lineasTotales) * 100 : 0;
            double porWarnings = (lineasTotales > 0) ? ((double) warningTotales / lineasTotales) * 100 : 0;

            System.out.println("📌 Total de líneas leídas: " + lineasTotales);
            System.out.println("🚨 Errores encontrados: " + erroresTotales);
            System.out.println("⚠️ Warnings encontrados: " + warningTotales);
            System.out.printf("➗ Porcentaje de errores: %f%%\n", porErrores);
            System.out.printf("➗ Porcentaje de advertencias: %f%%\n", porWarnings);

        }catch (IOException e){
            System.out.println("❌ Error al procesar el archivo: " + e.getMessage());
            try (BufferedWriter archError = Files.newBufferedWriter(error)) {
                archError.write("❌ Error al procesar el archivo." + e.getMessage());
            } catch (IOException ex) {
                System.out.println("❌ Error al escribir el archivo.");
            }
        }
    }
}