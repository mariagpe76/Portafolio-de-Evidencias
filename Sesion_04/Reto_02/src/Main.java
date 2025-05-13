public class Main {
    public static void main(String[] args) {
        DeclaracionImpuestos dec = new DeclaracionImpuestos("RFC123456", 9000);
        CuentaFiscal cuenta = new CuentaFiscal("RFC1234567", 10000);

        System.out.println("Declaración enviada por RFC: " + dec.rfcContribuyente() + " por $" + dec.montoDeclarado());
        cuenta.mostrarCuenta();

        boolean rfcValido = cuenta.validarRFC(dec);
        System.out.println("¿RFC valido para esta cuenta?: " + rfcValido);
    }
}
