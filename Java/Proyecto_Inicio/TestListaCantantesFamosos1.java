import java.util.Scanner;
/**
 * Testea el funcionamiento de la clase ListaCantantesFamosos.
 * @author Chompy129
 * @version 1.1
 */
public class TestListaCantantesFamosos1{
    public static void main(String[] args){
        ListaCantantesFamosos lista1= new ListaCantantesFamosos();
        Scanner entradaScanner= new Scanner(System.in);
        boolean seguir= true;
        
        System.out.println("Inicia el programa");
        System.out.println("La lista actual contiene: ");
        mostrarLista(lista1);
        
        do{
            System.out.print("\nIntrodusca un famoso mas: ");
            lista1.colocarCantante(entradaScanner.nextLine());
        
            System.out.println("Lista actualizada contiene:");
            for(String nombre: lista1.getLista()){
                System.out.println("- " + nombre);
            }
            
            System.out.println("¿Quiere seguir con el programa?\n(Debe introducir \"true\" para seguir)");
            if(entradaScanner.nextLine().toLowerCase().equals("true")){
                seguir= true;
            }
            else{
                System.out.println("Valor no reconocido, se interpreta como false.");
                seguir=false;
            }
        }while(seguir == true);
        
        System.out.println("Fin del programa");
    }//Cierre de metodo main(..).
    
    private static void mostrarLista(ListaCantantesFamosos listaMostrada){
        for(String nombre: listaMostrada.getLista()){
            System.out.println("- " + nombre);
        }
    }//Cierre del metodo mostrarLista(..)
}