/**
 * Define a una casa respecto a su contenido (habitaciones).
 * @author Chompy129
 * @version 1.1
 */
public class Casa{
    private double superficie;
    private String direccion;
    private SalonCasa salonCasa;
    private CocinaCasa cocina;
    
    public Casa(){
        superficie= 0;
        direccion= "desconocido";
        salonCasa= new SalonCasa();
        cocina= new CocinaCasa();
    }
    
    public Casa(double valueSuperficie, String valueDireccion, SalonCasa objetoSalonCasa, CocinaCasa objetoCocinaCasa){
        superficie= valueSuperficie;
        direccion= valueDireccion;
        salonCasa= objetoSalonCasa;
        cocina= objetoCocinaCasa;
    }
}