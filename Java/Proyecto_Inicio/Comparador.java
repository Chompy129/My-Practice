import java.util.Scanner;
/**
 * Funciona para comparar tipos objetos y tipos primitivos.
 * 
 * @author Chompy129
 * @version 1.0
 */
public class Comparador{
    
    public static void main(String[] args){
        Scanner entradaScanner= new Scanner(System.in);
        String cadena1= "";
        String cadena2= "";
        
        //Se obtienen los valores de cadena1 y cadena2.
        System.out.print("Introdusca la primera cadena: ");
        cadena1= entradaScanner.nextLine();
        System.out.print("Introdusca la segunda cadena: ");
        cadena2= entradaScanner.nextLine();
        System.out.println("Se recibe \"" + cadena1 + "\" y \"" + cadena2 + "\".");
        System.out.println("Comparacion:\n");
        
        //Proceso de comparacion:
        //El bucle se mantiene mientras i sea menor a la cantidad de caracteres de cadena1 o cadena2.
        for(int i= 0; i < cadena1.length() || i < cadena2.length(); i++){
            
            System.out.print("¿Caracter "+(i+1)+" igual en ambos?: ");
            
            // Si i+1 supera la cantidad de caracteres de cadena1 o cadena2
            // se indica que tal cadena no posee tal cáracter.
            if(i+1 > cadena2.length()){
                System.out.println("Cadena 2 no tiene "+(i+1)+" cáracter.");
            }
            else if(i+1 > cadena1.length()){
                System.out.println("Cadena 1 no tiene "+(i+1)+" cáracter.");
            }
            else{
                //  Si no se cumplen las anteriores condiciones entonces se comparan las cadenas
                //  cáracter por cáracter, devolviendo true si son iguales y false si son distintas.
                if(cadena1.substring(i, i+1).equals(cadena2.substring(i, i+1))){
                    System.out.println(true);
                }
                else{
                    System.out.println(false);
                }
            }
        }
    }
    
}
