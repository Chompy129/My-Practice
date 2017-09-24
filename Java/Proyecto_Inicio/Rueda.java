/**
 * Identifica a una rueda y determina su diametro y grosor.
 * @author Chompy129
 * @Version 1.0
 */
public class Rueda{
    private String tipo;
    private double grosor;
    private double diametro;
    private String marca;
    
    public Rueda(){
        tipo= "";
        grosor= .0;
        diametro= .0;
        marca= "";
    }
    
    //Setters (Establecer valores)
    public void setTipo(String valueTipo){
        tipo= valueTipo;
    }
    public void setGrosor(double valueGrosor){
        grosor= valueGrosor;
    }
    public void setDiametro(double valueDiametro){
        diametro= valueDiametro;
    }
    public void setMarca(String valueMarca){
        marca= valueMarca;
    }
    
    //Getters (Obtener valores)
    public String getTipo(){return tipo;}
    public double getGrosor(){return grosor;}
    public double getDiametro(){return diametro;}
    public String getMarca(){return marca;}
    
    //Metodos con condiciones
    
    public void comprobarDimensiones(){ //Determina a que tipo de vehiculo deberia ir la rueda
        if(diametro > 1.4){
            System.out.println("La rueda es para un vehiculo grande.");
        }
        else if(diametro <= 1.4 && diametro > 0.8){
            System.out.println("La rueda es para un vehiculo mediano.");
        }
        else{
            System.out.println("La rueda es para un vehiculo pequeño.");
        }
        
        if(diametro > 1.4 && grosor < 0.4 || diametro <= 1.4 && diametro > 0.8 && grosor < 0.25){
            System.out.println("El grosor para esta rueda es inferior al recomendado");
        }
    }//Cierre de metodo
}//Cierre de la clase