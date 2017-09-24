import java.util.Scanner;
/**
 * Testea el funcionamiento de la clase ListaCantantesFamosos.
 * @author Chompy129
 * @version 1.2
 */
public class TestListaCantantesFamosos2{
    public static void main(String[] args){
        ListaCantantesFamosos1 lista= new ListaCantantesFamosos1();    
        Scanner entradaScanner= new Scanner(System.in);
        boolean seguir= true;
        
        System.out.println("Inicia el programa");
        System.out.println("La lista actual contiene: ");
        lista.obtenerContenidoLista();
        
        do{
            System.out.print("\nIntrodusca un famoso mas: ");
            lista.colocarCantante(entradaScanner.nextLine());
        
            System.out.println("Lista actualizada contiene:");
            lista.obtenerContenidoLista();
            
            System.out.println("¿Quiere seguir con el programa?\n(Debe introducir \"true\" para seguir)");
            if(entradaScanner.nextLine().toLowerCase().equals("true")){
                seguir= true;
            }
            else{
                System.out.println("Valor no reconocido, se interpreta como false.");
                seguir=false;
            }
        }while(seguir == true); //Cierre de bucle do... while
        
        System.out.println("Fin del programa");
    }//Cierre de metodo main(..)
}