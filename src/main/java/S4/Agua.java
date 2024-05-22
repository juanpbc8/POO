package S4;
public class Agua extends Servicio{
    
    private double consumoMetrosCubicos;
    private final double costoPorMetroCubico = 0.75;

    public Agua(double consumoMetrosCubicos, double cargoFijo) {
        super(cargoFijo);
        this.consumoMetrosCubicos = consumoMetrosCubicos;
    }
    
    @Override
    public void calcularMontoFinal() {
        montoFinal += consumoMetrosCubicos * costoPorMetroCubico;
    }
     
}
