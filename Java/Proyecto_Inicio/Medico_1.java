/**
 * Indica las caracteristicas de un medico.
 * Se añaden metodos extra.
 * @author Chompy129
 * @version 1.2
 */
public class Medico_1{
    String nombre;                    //Nombre del medico
    String apellido;                  //Apellido del medico
    int edad;                         //Su edad
    boolean casado;                   //¿Esta casado?
    String numeroDocumentoIdentidad;  //Su numero de identidad
    String especialidad;              //Su especialidad

    public Medico_1(){
        nombre= "";
        apellido= "";
        edad= 0;
        casado= false;
        numeroDocumentoIdentidad= "CI-0";
        especialidad= "";
    }
    public Medico_1(String valueNombre, String valueApellido, int valueEdad, boolean valueCasado, int valueNumeroDocumentoIdentidad, String valueEspecialidad){ // Define las caracteristicas escensiales
       nombre= valueNombre; 
       apellido= valueApellido; 
       edad= valueEdad;
       casado= valueCasado;
       numeroDocumentoIdentidad= "CI-"+valueNumeroDocumentoIdentidad;
       especialidad= valueEspecialidad;
    }
    //Metodos: setters and getters

    public void setNombre(String valueName){
        nombre= valueName;
        System.out.println("Se ha cambiado el nombre del medico a: "+nombre);
    }
    public void setApellido(String valueApellido){
        apellido= valueApellido;
        System.out.println("Se ha cambiado el apellido del medico a: "+apellido);
    }
    public void setEdad(int valueEdad){
        edad= valueEdad;
        System.out.println("Se ha cambiado la edad del medico a: "+edad);
    }
    public void setCasado(boolean valueCasado){
        casado= valueCasado;
        System.out.println("El medico ahora esta casado: "+casado);
    }
    public void setNumeroDocumentoIdentidad(String valueNumeroDocumentoIdentidad){
        numeroDocumentoIdentidad= "CI-"+valueNumeroDocumentoIdentidad;
        System.out.println("Se ha cambiado el numero de identidad del medico a: "+numeroDocumentoIdentidad);
    }
    public void setEspecialidad(String valueEspecialidad){
        especialidad= valueEspecialidad;
        System.out.println("Se ha cambiado la especialidad del medico a: "+especialidad);
    }
    public String getNombre(){ return nombre;}
    public String getApellido(){return apellido;}
    public int getEdad(){return edad;}
    public boolean getCasado(){return casado;}
    public String getNumeroDocumentoIdentidad(){return numeroDocumentoIdentidad;}
    public String getEspecialidad(){return especialidad;}
    
    //Metodos Extra
    public void calculoParaMultiploEdad(){
       System.out.println("El medico "+nombre+" "+apellido+" con especialidad en "+especialidad+" tendra una edad multiplo de 5 dentro de "+(5-edad%5)+" año/s.");
    }
}