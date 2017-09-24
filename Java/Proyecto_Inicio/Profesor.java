/**
 * Identifica a un profesor a traves de sus caracteristicas
 * @author Chompy129
 * @version 1.0
 */


public class Profesor {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private boolean especialista;
 
    /**
     * Construye el objeto a traves de parametros
     */
    public Profesor(String valueNombre, String valueApellido, int valueEdad, boolean valueCasado, boolean valueEspecialista) {
       nombre= valueNombre;
       apellido= valueApellido;
       edad= valueEdad; 
       casado= valueCasado;
       especialista= valueEspecialista;
    }
   
    /**
     * Construye el objeto por defecto
     */
    public Profesor() {
       nombre= "";
       apellido= "";
       edad= 0;
       casado= false;
       especialista= false;    
    }
    
    //Setters (Establecer valores)
    public void setNombre(String valueNombre){
        nombre= valueNombre;
    }
    public void setApellido(String valueApellido){
        apellido= valueApellido;
    }
    public void setEdad(int valueEdad){
        edad= valueEdad;
    }
    public void setCasado(boolean valueCasado){
        casado= valueCasado;
    }
    public void setEspecialista(boolean valueEspecialista){
        especialista= valueEspecialista;
    }

    //Getters (Obtener valores)
    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}
    public int getEdad(){return edad;}
    public boolean getCasado(){return casado;}
    public boolean getEspecialista(){return especialista;}

} //Cierre de la clase