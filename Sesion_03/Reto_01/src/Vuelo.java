public class Vuelo {
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado;

    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    public boolean reservarAsiento(Pasajero p) {
         if (asientoReservado == null) {
             asientoReservado = p;
             return true;
         }else {
             return false;
         }
    }

    public boolean reservarAsiento(String nombre, String pasaporte) {
        return reservarAsiento(new Pasajero(nombre, pasaporte));
    }

    public void cancelarReserva(){
        if (asientoReservado != null){
            System.out.println("❌ Cancelando reserva...\n");
            asientoReservado = null;
        } else {
            System.out.println("❌ No hay reserva para cancelar.");
        }
    }

    public String obtenerItinerario() {
        String itinerario = "🛫 Itinerario del vuelo: \n";
        itinerario += "Codigo Vuelo: " + codigoVuelo + "\n";
        itinerario += "Destino: " + destino + "\n";
        itinerario += "Hora de Salida: " + horaSalida + "\n";
        if(asientoReservado != null) {
            itinerario += "Pasajero: " + asientoReservado.nombre + "\n";
        }else {
            itinerario += "Pasajero: [Sin reserva]\n";
        }
        return itinerario;
    }
}
