
/**
 * Clasificar discos musicales
 * @author Chompy129 
 * @version 1.0
 */
public class DiscoMusical{
    private String titulo;    //Titulo del disco
    private String autor;     //Autor del disco
    private int añoEdicion;   //Año de edicion
    private String formato;   //El formato que usa
    private boolean digital;  //¿Es digital?

    //Constructor
    public DiscoMusical(){
        titulo= "";
        autor= "desconocido";
        añoEdicion= 0;
        formato= "";
        digital= true;
    }//Cierre de constructor

    //Establecer los valores:
    //titulo
    public void setTitulo (String valueTitulo){
        titulo= valueTitulo;
    }
    //autor
    public void setAutor (String valueAutor){
        autor= valueAutor;
    }
    //añoEdicion
    public void setAñoEdicion (int valueAñoEdicion){
        añoEdicion= valueAñoEdicion;
    }
    //formato
    public void setFormato (String valueFormato){
        formato= "." + valueFormato;
    }
    //digital
    public void setDigital (boolean valueDigital){
        digital= valueDigital; System.out.println("Ahora vale "+digital+digital);
    }

    //Obtener los valores:
    //titulo
    public String getTitulo(){return titulo;}
    //autor
    public String getAutor(){return autor;}
    //añoEdicion
    public int getAñoEdicion(){return añoEdicion;}
    //formato
    public String getFormato(){return formato;}
    //digital
    public boolean getDigital(){return digital;}
    
    public void saludo(String hola){System.out.println("HOLA SOY TU "+hola);}
}