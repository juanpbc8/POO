package S1;
import java.util.Scanner;
public class EntradaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ubicacion;
        
        do{
            System.out.println("Ingrese la ubicación de la entrada (Palco, Platea, Vip): ");
            ubicacion = sc.nextLine().toLowerCase();
        }while(!(ubicacion.equals("palco") || ubicacion.equals("platea") || ubicacion.equals("vip")));
        

        System.out.println("Ingrese la cantidad de entradas que desea comprar: ");
        int cantidad = sc.nextInt();
        
        double precioBase = 0;
        double descuento = 0;
        
        switch(ubicacion){
            case "palco" -> {
                precioBase = 60;
                descuento = 5;
            }   
            case "platea" -> {
                precioBase = 80;
                descuento = 7;
            }  
            case "vip" -> {
                precioBase = 120;
                descuento = 10;
            }
        }
        
        Entrada entrada = new Entrada(ubicacion, precioBase, descuento);
        double precioFinal = entrada.calcularPrecio(cantidad);
        
        System.out.println("\n"+cantidad+" entrada(s) en "+ubicacion+": S/"+precioFinal);
    }
}
