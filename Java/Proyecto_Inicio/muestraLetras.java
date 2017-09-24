import java.util.Scanner;
/**
 * El usuario introduce una cadena y el metodo main devuelve todas los caracteres de esa cadena.
 * 
 * @author Chompy129
 * @version 1.0
 */
public class muestraLetras{
    public static void main(String[] args){
        String entradaTeclado;
        Scanner entradaScanner= new Scanner(System.in);
        
        System.out.print("Introdusca una cadena: ");
        entradaTeclado= entradaScanner.nextLine();
        
        for(int i= 0; i < entradaTeclado.length(); i++){//Devuelve cada caracter de la cadena una por una.
            System.out.print("Cáracter " + (i+1) +": ");
            System.out.println(entradaTeclado.substring(i, i+1));
        }
    }
}