/**
 * Identifica a un bombero a traves de caracteristicas como
 * nombre, apellido, edad, si esta casado y si es especialista.
 * @author Chompy129
 * @version 1.0
 */
public class Bombero{
    private char nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private boolean especialista;
    
    public Bombero(char valueNombre, String valueApellido, int valueEdad, boolean valueCasado, boolean valueEspecialista){
        nombre= valueNombre;
        apellido= valueApellido;
        edad= valueEdad;
        casado= valueCasado;
        especialista= valueEspecialista;
    }
    
    //Setters (Establecer valores)
    public void setNombre (char valueNombre){
        nombre= valueNombre;
    }
    public void setApellido (String valueApellido){
        apellido= valueApellido;
    }
    public void setEdad (int valueEdad){
        edad= valueEdad;
    }
    public void setCasado (boolean valueCasado){
        casado= valueCasado;
    }
    public void setEspecialista (boolean valueEspecialista){
        especialista= valueEspecialista;
    }
    
    //Getters (Obtener valores)
    public char getNombre (){return nombre;}
    public String getApellido (){return apellido;}
    public int getEdad (){return edad;}
    public boolean getCasado (){return casado;}
    public boolean getEspecialista (){return especialista;}
    
}