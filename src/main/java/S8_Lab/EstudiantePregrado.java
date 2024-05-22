package S8_Lab;
public class EstudiantePregrado extends Estudiante{
    private static int contadorPregrado = 0;
    private double promedioPonderado;
    private String colegioProcedencia;

    public EstudiantePregrado(double promedioPonderado, String colegioProcedencia, String codigo, String nombres, int semestreDeIngreso) {
        super(codigo, nombres, semestreDeIngreso);
        this.promedioPonderado = promedioPonderado;
        this.colegioProcedencia = colegioProcedencia;
        contadorPregrado++;
    }

    public EstudiantePregrado() {
        contadorPregrado++;
    }
    
    
    @Override
    public double pagoParcialPension() {
        double pension = 0;
        if(colegioProcedencia.equals("Estatal")){
            pension = PENSION_ESTATAL;
        }else if (colegioProcedencia.equals("Particular")){
            pension = PENSION_PARTICULAR;
        }
        return pension;
    }

    @Override
    public double descuentos() {
        if(promedioPonderado < 13){
            return PORCENTAJE_1*pagoParcialPension();
        }else{
            return PORCENTAJE_2*pagoParcialPension();
        }
    }

    public double getPromedioPonderado() {
        return promedioPonderado;
    }

    public void setPromedioPonderado(double promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }

    public String getColegioProcedencia() {
        return colegioProcedencia;
    }

    public void setColegioProcedencia(String colegioProcedencia) {
        this.colegioProcedencia = colegioProcedencia;
    }
    
    
    
}
