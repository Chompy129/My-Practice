import java.util.Scanner;
/**
 * Testea el funcionamiento de la clase ListaCantantesFamosos.
 * @author Chompy129
 * @version 1.0
 */
public class TestListaCantantesFamosos{
    public static void main(String[] args){
    	Scanner entradaScanner= new Scanner(System.in);
    	ListaCantantesFamosos lista1= new ListaCantantesFamosos();

    	System.out.println("Inicia el programa.");
    	for(int i= 0; i != 2; i++){
    		System.out.println("Introduce a la lista un nuevo cantante: ");
    		lista1.colocarCantante(entradaScanner.nextLine());
    	}

    	//El bucle se encarga de mostrar cada uno de los cantantes
    	System.out.print("Los elementos de la lista son: ");
    	for(int i= 0; i < lista1.getCantidadCantantes(); i++){
    		if(i== lista1.getCantidadCantantes()-1){
    			System.out.println(lista1.getNombreCantante(i) + ".");
    		}
    		else{
    			System.out.print(lista1.getNombreCantante(i) + ", ");
    		}
    	}//Cierre de bucle

    }//Cierre de metodo main
}