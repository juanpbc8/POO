package S2;
public class Consulta {
    private String tipo;
    private double precio;
    private int nroConsultas;
    private double montoAdicional;
    private int consultasAdicionales;
    private double montoFinal;

    public Consulta(String tipo, int consultasAdicionales) {
        this.tipo = tipo;
        this.consultasAdicionales = consultasAdicionales;
    }

    public double calcularMontoFinal(){
        switch(tipo){
            case "A" -> {
                precio = 120;
                nroConsultas = 8;
            }
            case "B" -> {
                precio = 100;
                nroConsultas = 6;
            }
            case "C" -> {
                precio = 70;
                nroConsultas = 4;
            }  
        }
        montoAdicional = consultasAdicionales*18;
        montoFinal = precio + montoAdicional;
       
        return montoFinal;
    }
}
