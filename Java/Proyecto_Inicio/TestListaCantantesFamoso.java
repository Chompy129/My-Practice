import java.util.Iterator;
import java.util.Scanner;
/**
 * Este método main testea el funcionamiento de ListaCantantesFamoso.
 * Hace uso de variables tipo Iterator.
 * @author Chompy129
 * @version 1.0
 */

public class TestListaCantantesFamoso{
    public static void main(String[] args){
        Scanner entradaS= new Scanner(System.in);
        ListaCantantesFamoso lista= new ListaCantantesFamoso();
        lista.anadirCantante("Michael Jackson", "Thriller");
        lista.anadirCantante("Madonna", "All I want is you");

        String nombreNuevo= "";
        String discoMasVendidoNuevo= "";

        boolean inicial= true;

        Iterator<CantanteFamoso> it;
        CantanteFamoso next;

        while(true){
            String m= "";
            it= lista.getLista().iterator();
            
            if (inicial){System.out.println("La lista inicial contiene los siguientes datos:"); inicial= false;}
            else{System.out.println("La lista actualizada contiene los siguientes datos:");}

            while(it.hasNext()){
                next= it.next();
                System.out.print("Cantante: " + next.getNombre() + ".");
                System.out.println("       Disco con más ventas: " + next.getDiscoConMasVentas() + ".");
            }

            System.out.println("Añada un nuevo cantante:");
            System.out.print("- Nombre: ");
            nombreNuevo= entradaS.nextLine();
            System.out.print("- Disco con mas ventas: ");
            discoMasVendidoNuevo= entradaS.nextLine();
            lista.anadirCantante(nombreNuevo, discoMasVendidoNuevo);            

            
            
            System.out.println("¿Desea introducir un nuevo cantante (s/n)?");
            m= entradaS.nextLine();
            if(m.equalsIgnoreCase("s")){
                //Sin accion
            }
            else if(m.equalsIgnoreCase("n")){
                break;
            }
            else{
                System.out.println("Valor interpretado como \"no seguir\".");
                break;
            }
        }
    }//Cierre de método main.
}