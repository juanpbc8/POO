package S1;
public class Entrada {
    private String ubicacion;
    private double precio;
    private double descuento;
    
    public Entrada(String ubicacion, double precio, double descuento){
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.descuento = descuento;
    }
    
    public double calcularPrecio(int cantidad){
        double precioSinDescuento = cantidad*precio;
        double descuentoAplicado = 0;
        if (cantidad > 6){
            descuentoAplicado = precioSinDescuento*descuento/100;
        }
        return precioSinDescuento - descuentoAplicado;
    }
    
}
