public class CentralEmergencia {
    public static void main(String[] args){
        Ambulancia ambulancia = new Ambulancia("Ambulancia","Sofia");
        Patrulla patrulla = new Patrulla("Patrulla","Mario");
        UnidadBomberos bomberos = new UnidadBomberos("Unidad de Bomberos","Carlos");

        ambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        bomberos.iniciarOperacion();
        System.out.println();
    }
}
