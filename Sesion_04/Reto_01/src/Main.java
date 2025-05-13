public class Main {
    public static void main (String[] args){
        Factura fac1 = new Factura("FAC01", "Jasmin Gallegos", 8016);
        Factura fac2 = new Factura("FAC01", "Giselle Olague", 6231);

        System.out.println(fac1);
        System.out.println(fac2);

        System.out.println("¿Las facturas son iguales?: " + fac1.equals(fac2));
    }
}
