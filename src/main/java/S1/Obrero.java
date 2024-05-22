package S1;
public class Obrero {
    private String categoria;
    private String tipoProducto;
    private int cantidadProducida;

    public Obrero(String categoria, String tipoProducto, int cantidadProducida) {
        this.categoria = categoria;
        this.tipoProducto = tipoProducto;
        this.cantidadProducida = cantidadProducida;
    }

    public double calcularPago() {
        double tarifa = 0;

        switch (categoria) {
            case "A" -> {
                tarifa = tipoProducto.equals("tejas") ? 2.50 : 2.00;
            }
            case "B" -> {
                tarifa = tipoProducto.equals("tejas") ? 2.00 : 1.50;
            }
            case "C" -> {
                tarifa = tipoProducto.equals("tejas") ? 1.50 : 1.00;}
        }

        double ingresoBase = tarifa * cantidadProducida;

        double bono = 0;
        if (cantidadProducida <= 250) {
            bono= 0;
        } else if (cantidadProducida >= 251 && cantidadProducida <= 500) {
            bono = 50;
        } else if (cantidadProducida >= 501 && cantidadProducida <= 1000) {
            bono = 100;
        } else if (cantidadProducida > 1000) {
            bono = 150;
        }

        double totalIngresos = ingresoBase + bono;
        double descuentoSeguro = totalIngresos * 0.07;
        double pagoFinal = totalIngresos - descuentoSeguro;

        return pagoFinal;
    }
}
