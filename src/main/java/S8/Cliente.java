package S8;

public class Cliente implements Cable, Telefono{
    String tipoTelefono;
    String poseeServicioBasico;
    double totalCable;
    double totalTelefono;
    @Override
    public void pagoCable() {
        if(poseeServicioBasico.equalsIgnoreCase("si")){
            totalCable = pagoBasico;
        }else{
            totalCable = pagoBasico + 40;
        }
    }

    @Override
    public void pagoTelefono() {
        switch(tipoTelefono){
            case "Basico":
                totalTelefono = rentaBasica; break;
            case "Medio":
                totalTelefono = rentaBasica + 25; break;
            case "Completo":
                totalTelefono = rentaBasica + 30; break;
            case "Plus":
                totalTelefono = rentaBasica + 40; break;
        }
    }
    
}
