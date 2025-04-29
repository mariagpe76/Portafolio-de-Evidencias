import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("💊 Ingrese el nombre del medicamento: ");
        String nom_Med = sc.nextLine();

        System.out.print("🔢 Ingrese la cantidad: ");
        int cantidad = sc.nextInt();

        System.out.print("💲 Ingrese el precio unitario: ");
        double precio = sc.nextDouble();

        double total = (cantidad * precio);

        var apDescuento = total > 500;

        double descuento = apDescuento ? total * 0.15 : 0;

        double totalFinal = total - descuento;

        System.out.println("\n🛒 Resumen de la compra");
        System.out.println("💊 Medicamento: " + nom_Med);
        System.out.println("🔢 Cantidad: " + cantidad);
        System.out.println("💲 Precio unitario: $" + precio);
        System.out.println("‼️ Total: $" + total);
        System.out.println("\n✔️ Aplica el descuento: " + apDescuento);
        System.out.println("👀 Descuento: $" + descuento);
        System.out.println("😊 Total a pagar: $" + totalFinal);

        sc.close();
    }
}
