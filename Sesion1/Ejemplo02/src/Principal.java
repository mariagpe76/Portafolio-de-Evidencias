public class Principal {
    public static void main(String[] args) {
        //Crear los objetos
        //1. La clase a la que pertenezca el objeto
        //2. Identificador
        //3. new + constructor
        Estudiante estudiante1 = new Estudiante();

        estudiante1.nombre = "Lupita";
        estudiante1.edad = 21;

        estudiante1.saludar();
    }
}
