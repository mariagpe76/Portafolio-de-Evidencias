import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class RegistroSimulacion {
    public static void main(String[] args) {
        Path rutarchivo = Paths.get("src/config/parametros.txt");
        String contenido = "⏱️ Tiempo de ciclo: 55.8 segundos \n📖 Velocidad de línea: 1.2 m/s \n🔢 Número de estaciones: 8 ";

        try{
            Files.write(rutarchivo,contenido.getBytes());
            System.out.println("✔ Archivo escrito correctamente.\n");
            if (Files.exists(rutarchivo)){
                String textoLeido = Files.readString(rutarchivo);
                System.out.println("📄 Contenido leído:");
                System.out.println(textoLeido);
            }
            else{
                System.out.println("❌ El archivo no existe.");
            }
        }catch (IOException e){
            System.out.println("Error al trabajar con el archivo: " + e.getMessage());
        }

    }
}