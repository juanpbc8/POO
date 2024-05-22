package S8_Lab;
public abstract class Estudiante implements Valores{
    protected String codigo;
    protected String nombres;
    protected int semestreDeIngreso;

    public Estudiante(String codigo, String nombres, int semestreDeIngreso) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.semestreDeIngreso = semestreDeIngreso;
    }

    public Estudiante() {
    }
    
    public abstract double pagoParcialPension();
    public abstract double descuentos();
    public double calculoPagoFinal(){
        return pagoParcialPension() - descuentos();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getSemestreDeIngreso() {
        return semestreDeIngreso;
    }

    public void setSemestreDeIngreso(int semestreDeIngreso) {
        this.semestreDeIngreso = semestreDeIngreso;
    }
    
}
