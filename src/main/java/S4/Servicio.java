package S4;
public class Servicio {
    private double cargoFijo;
    protected double montoFinal;
    
    public Servicio(double cargoFijo){
        this.cargoFijo = cargoFijo;
        this.montoFinal = cargoFijo;
    }
    
    public void calcularMontoFinal(){
    }
}
