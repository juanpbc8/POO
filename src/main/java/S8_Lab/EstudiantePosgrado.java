package S8_Lab;
public class EstudiantePosgrado extends Estudiante implements Descuentos{
    private static int contadorPosgrado = 0;
    private String gradoAcademico;
    private String condicionSocial;

    public EstudiantePosgrado(String gradoAcademico, String condicionSocial, String codigo, String nombres, int semestreDeIngreso) {
        super(codigo, nombres, semestreDeIngreso);
        this.gradoAcademico = gradoAcademico;
        this.condicionSocial = condicionSocial;
        contadorPosgrado++;
    }

    public EstudiantePosgrado() {
        contadorPosgrado++;
    }
    
    
    
    

    @Override
    public double pagoParcialPension() {
        double pension = 0;
        if(gradoAcademico.equals("Bachiller")){
            pension = PENSION_BACHILLER;
        }else if(gradoAcademico.equals("Titulado")){
            pension = PENSION_TITULADO;
        }
        return pension;
    }

    @Override
    public double descuentos() {
        return 50 + descuentoCondicion();
    }

    @Override
    public double descuentoCondicion() {
        double descuento = 0;
        if (condicionSocial.equals("Ninguno")) {
            descuento = 0;
        } else if (condicionSocial.equals("Bombero activo")) {
            descuento = DESCUENTO_CONDICION_1;
        } else if (condicionSocial.equals("Licenciado de FF. AA.")) {
            descuento = DESCUENTO_CONDICION_2;
        }
        return descuento*pagoParcialPension();
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public String getCondicionSocial() {
        return condicionSocial;
    }

    public void setCondicionSocial(String condicionSocial) {
        this.condicionSocial = condicionSocial;
    }
    
}

        

    


    
    
    

