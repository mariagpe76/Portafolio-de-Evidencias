public class Main {
    public static void main(String[] args) {
        Factura f1 = new Factura(2500,"Servicio de consultoria","ABCC010101XYZ");
        Factura f2 = new Factura(1800,"Reparación de equipo", null);

        System.out.println(f1.getResumen());
        System.out.println(f2.getResumen());
    }
}