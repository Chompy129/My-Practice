import java.util.ArrayList;

/**
 * Contiene una lista de cantantes famosos.
 * @author Chompy129
 * @version 1.0
 */
public class ListaCantantesFamosos{
	private String nombreDeLista;
	private ArrayList<String> listaDeCantantes;

	public ListaCantantesFamosos(){
		this.nombreDeLista= "Cantantes de POP";
		listaDeCantantes= new ArrayList<String>(3);

		listaDeCantantes.add("Michael Jackson");
		listaDeCantantes.add("Rihanna");
		listaDeCantantes.add("Shakira");
	}

	//Metodos set
	public void setNombreDeLista(String nombreDeLista){
		this.nombreDeLista= nombreDeLista;
	}

	public void cambiarCantante(int numeroCantante, String cantanteNuevo){
		listaDeCantantes.set(numeroCantante, cantanteNuevo);
	}

	public void colocarCantante(String cantanteNuevo){
		listaDeCantantes.add(cantanteNuevo);
	}

	//Metodos get
	public String getNombreCantante(int numeroCantante){
		return listaDeCantantes.get(numeroCantante);
	}

	public int getCantidadCantantes(){
		return listaDeCantantes.size();
	}
	public String getNombreDeLista(){
		return nombreDeLista;
	}

	public ArrayList<String> getLista(){
		return listaDeCantantes;
	}
}