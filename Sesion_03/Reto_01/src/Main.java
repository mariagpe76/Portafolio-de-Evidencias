public class Main {
    public static void main(String[] args) {
        Pasajero p1 = new Pasajero("Giselle Marquez", "BOL01");
        Vuelo vuelo = new Vuelo(null, "París", "14:30");
        Pasajero p2 = new Pasajero("Mario Gonzalez", "BOL02");

        vuelo.reservarAsiento(p1);
        System.out.println("✅ Reserva realizada con éxito \n");
        System.out.println(vuelo.obtenerItinerario());
        vuelo.cancelarReserva();
        System.out.println(vuelo.obtenerItinerario());
        vuelo.reservarAsiento(p2);
        System.out.println(vuelo.obtenerItinerario());

    }
}