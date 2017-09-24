/**
 * Un programa que presente a un medico
 * @author Chompy129
 * @Version 1.0
 */
public class Medico{
	String nombre;                    //Nombre del medico
	String apellido;                  //Apellido del medico
	int edad;                         //Su edad
	boolean casado;                   //¿Esta casado?
	String numeroDocumentoIdentidad;  //Su numero de identidad
	String especialidad;              //Su especialidad

	public Medico(){
		nombre= "";
		apellido= "";
		edad= 0;
		casado= false;
		numeroDocumentoIdentidad= "CI-0";
		especialidad= "";
	}
	//Metodos: setters and getters

	public void setNombre(String valueName){
		nombre= valueName;
		if(nombre== "Ronaldo"){System.out.println("GOOOOOOOOOLL");}
		else{System.out.println("Se ha cambiado el nombre del medico a: "+nombre);};
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
	public String getNombre(String g){ return nombre+" "+g;}
	public String getApellido(){return apellido;}
	public int getEdad(){return edad;}
	public boolean getCasado(){return casado;}
	public String getNumeroDocumentoIdentidad(){return numeroDocumentoIdentidad;}
	public String getEspecialidad(){return especialidad;}
	public String obtenerNombreCompleto(){return nombre+" "+apellido;}
}