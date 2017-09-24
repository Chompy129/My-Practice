import java.util.Scanner;
/**
 * El usuario introduce una cadena y el metodo main devuelve todas los caracteres de esa cadena.
 * En lugar de usarse bucles for, se usan bucles while.
 * @author Chompy129
 * @version 1.1
 */
public class MuestraLetrasWhile{
    public static void main(String[] args){
        Scanner entradaScanner= new Scanner(System.in);
        String entradaTeclado= "";
        int contador= 0;

        System.out.print("Introduce la cadena: ");
        entradaTeclado= entradaScanner.nextLine();

        while(contador < entradaTeclado.length()){
            System.out.print("Cáracter " + (contador+1) + ": ");
            System.out.println(entradaTeclado.substring(contador, contador+1));
            contador++;
        }
        
    }//Cierre de Método
    
}//Cierre de clase
