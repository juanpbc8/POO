package S4;
public class Luz extends Servicio{
    
    private boolean esTrifasico;
    private double KW;
    public Luz(double cargoFijo, boolean esTrifasico, double KW){
        super(cargoFijo);
        this.KW = KW;
        this.esTrifasico = esTrifasico; 
    }
    
    @Override
    public void calcularMontoFinal() {
        double tarifa = esTrifasico ? 9.00 : 6.00;
        montoFinal += KW * tarifa;
        montoFinal += montoFinal * 0.02;
    }
}
