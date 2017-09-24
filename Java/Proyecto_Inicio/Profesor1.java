/**
 * Define a un profesor a traves de sus caracteristicas.
 * 
 * @author Chompy129
 * @version 1.1
 */
public class Profesor1{
   private String nombre;
   private String apellido;
   private int edad;
   private boolean casado;
   private boolean especialista;
   
   /**
    * Constructor con parámetros.
    */
   public Profesor1(String nombre, String apellido, int edad, boolean casado, boolean especialista){
       this.nombre= nombre;
       this.apellido= apellido;
       this.edad= edad;
       this.casado= casado;
       this.especialista= especialista;
   }
   
   /**
    * Constructor por defecto.
    */
   public Profesor1(){
       nombre= "";
       apellido= "";
       edad= 0;
       casado= false;
       especialista= false;
   }
   
   //Setters (Establecer datos/valores)
   public void setNombre(String nombre){
       this.nombre= nombre;
   }
   public void setApellido(String apellido){
       this.apellido= apellido;
   }
   public void setEdad(int edad){
       this.edad= edad;
   }
   public void setCasado(boolean casado){
       this.casado= casado;
   }
   public void setEspecialista(boolean especialista){
       this.especialista= especialista;
   }
   
   //Getters (Obtener datos/valores)
   public String getNombre(){return nombre;}
   public String getApellido(){return apellido;}
   public int getEdad(){return edad;}
   public boolean getCasado(){return casado;}
   public boolean getEspecialista(){return especialista;}
}