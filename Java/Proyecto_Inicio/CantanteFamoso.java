/**
 * Define a un cantante famoso.
 * 
 * @author Chompy129
 * @version 1.0
 */
public class CantanteFamoso{
    private String nombre;
    private String discoConMasVentas;

    public CantanteFamoso(){
    	nombre= "desconocido";
    	discoConMasVentas= "desconocido";
    }

    //Métodos set
    public void setNombre(String nombre){
    	this.nombre= nombre;
    }

    public void setDiscoConMasVentas(String discoConMasVentas){
    	this.discoConMasVentas= discoConMasVentas;
    }

    //Métodos get
    public String getNombre(){
    	return nombre;
    }

    public String getDiscoConMasVentas(){
    	return discoConMasVentas;
    }
}