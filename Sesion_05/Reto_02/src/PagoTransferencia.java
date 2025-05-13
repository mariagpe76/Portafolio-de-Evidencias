public class PagoTransferencia extends MetodoPago{
    private boolean validoExternamente;
    public PagoTransferencia (double monto, boolean validoExternamente){
        super(monto);
        this.validoExternamente = validoExternamente;
    }
    public boolean autenticar(){
        return validoExternamente;
    }
    @Override
    public void procesarPago(){
        System.out.println("📲 Procesando transferencia por $" + monto);
    }
}
