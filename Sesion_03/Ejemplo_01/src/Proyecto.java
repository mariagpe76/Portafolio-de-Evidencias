public class Proyecto {

    // Atributos del proyecto
    private String nombre;
    private String cliente;
    private int duracionSemanas;
    private boolean estaActivo;

    // static - Atributo estático: número total de proyectos creados
    public static int totalProyectos = 0;

    // final - Constante: nombre del sistema
    public static final String NOMBRE_SISTEMA = "GestorProyectos v1.0";
    // Constante -> NOMBRE_SISTEMA

    // Constructor
    public Proyecto(String nombre, String cliente, int duracionSemanas, boolean estaActivo) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.duracionSemanas = duracionSemanas;
        this.estaActivo = estaActivo;
        totalProyectos++;  // Se incrementa cada vez que se crea un nuevo proyecto
    }

    // Método para mostrar información del proyecto
    public void mostrarInformacion() {
        System.out.println("📁 Proyecto: " + nombre);
        System.out.println("👨‍💼 Cliente: " + cliente);
        System.out.println("⏳ Duración: " + duracionSemanas + " semanas");
        System.out.println("✅ ¿Activo?: " + (estaActivo ? "Sí" : "No"));
    }

    // Método para marcar el proyecto como inactivo
    public void cerrarProyecto() {
        estaActivo = false;
        System.out.println("🚫 El proyecto '" + nombre + "' ha sido cerrado.");
    }
}
