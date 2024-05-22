package S1;
import java.util.Scanner;
public class ObreroMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String categoria;
        String tipoProducto;
        int cantidadProducida;
        do{
            System.out.print("Ingrese la categoría del obrero (A, B, C): ");
            categoria = scanner.nextLine().toUpperCase();
        }while(!((categoria.equals("A")) || categoria.equals("B") || categoria.equals("C")));

        do{
            System.out.print("Ingrese el tipo de producto que produce (Tejas, Losetas): ");
            tipoProducto = scanner.nextLine().toLowerCase();
        }while(!((tipoProducto.equals("tejas")) || tipoProducto.equals("losetas")));
        
        do{
            System.out.print("Ingrese la cantidad producida: ");
            cantidadProducida = scanner.nextInt();
        }while(cantidadProducida < 1);
        

        Obrero obrero = new Obrero(categoria, tipoProducto, cantidadProducida);
        double pagoFinal = obrero.calcularPago();

        System.out.println("El pago final que recibe el obrero es: S/" + pagoFinal);
    }
}
