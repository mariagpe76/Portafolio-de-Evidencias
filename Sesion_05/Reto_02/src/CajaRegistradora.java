public class CajaRegistradora {
    public static void main(String[] args){
        MetodoPago[] pagos = {new PagoEfectivo(230), new PagoTarjeta(320,600),
                new PagoTransferencia(480,false)};
        for (MetodoPago pago : pagos){
            if (pago.autenticar()){
                System.out.println("✔️ Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            }
            else{
                System.out.println("❌ Fallo de autenticación");
            }
            System.out.println();
        }
    }
}
