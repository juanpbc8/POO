package S2;
public class Empleado {
    private String categoria;
    private double tarifa;
    private int años, horas;
    private double bono;

    public Empleado(String categoria, int años, int horas) {
        this.categoria = categoria;
        this.años = años;
        this.horas = horas;
    }
    
    public double calcularSueldoFinal(){
        switch(categoria){
            case "A" -> {
                tarifa = 33.5;
            }
            case "B" -> {
                tarifa = 29.8;
            }
            case "C" -> {
                tarifa = 25.7;
            }
        }
        
        double sueldoBase = tarifa * horas;
        
        if (años <= 3){
            bono = 0;
        }else if (años <= 10){
            bono = 10;
        }else if (años <= 17){
            bono = 20;
        }else{
            bono = 30;
        }
        
        double sueldoFinal = sueldoBase + (bono / 100 * sueldoBase);
        return sueldoFinal;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getTarifa() {
        return tarifa;
    }

    public int getAños() {
        return años;
    }

    public int getHoras() {
        return horas;
    }

    public double getBono() {
        return bono;
    }
}
