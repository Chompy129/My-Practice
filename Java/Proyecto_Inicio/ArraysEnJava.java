import java.util.ArrayList;
/**
 * Programa para estudiar el funcionamiento de arrays.
 * @author Chompy129
 * @version 1.0
 */
public class ArraysEnJava{
	public static void main(String[] args){
		int[] miArray1= {2, -4, 3, -7};
		ArrayList<Integer> lista1= new ArrayList<Integer>();
		
		for(int i= 0; i < miArray1.length; i++){
			System.out.println("miArray1[" + i + "] = " + miArray1[i]);
			lista1.add(miArray1[i]);
		}
		System.out.println("");
		for(int i= 0; i < lista1.size(); i++){
		    System.out.println("lista1.get(" + i + ") = " + lista1.get(i));
		}
	}
}