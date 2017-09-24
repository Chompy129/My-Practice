import java.util.Scanner;
import java.util.ArrayList;
/**
 * Usando un metodo main, funciona como una calculadora con las formulas de  Vector3.
 * 
 * @author Chompy129
 * @version 1.0
 */
public class ProgramaVector3{
    private static Scanner entradaS = new Scanner(System.in);
    
    public static void main(String[] args){
        ArrayList<Vector3> listaVectores = new ArrayList<Vector3>(1);
        
        System.out.println("Bienvenido a Vectores en el espacio");
        do{
            
            System.out.println("Escribe el vector: ");
            listaVectores.add( crearVector() );
           
            System.out.println("Tienes " + listaVectores.size() + " Vectores.\nEscribe S para continuar ¿Continuar añadiendo vectores?");
            if( entradaS.nextLine().toLowerCase().equals("s") ){
                
            }
            else{
                System.out.println("Interpretado como \"No seguir\".\n");
                break;
            }
        }while(true);
        
        System.out.println("Tenemos " + listaVectores.size() + " vectores:");
        for(int i = 0; i < listaVectores.size(); i++){
            Vector3 obtener= listaVectores.get(i);
            System.out.println((i+1) + "- { " + obtener.getX() + ", " + obtener.getY() + ", " + obtener.getZ() + " }");
        }
        System.out.println("\n¿Que quieres calcular?");
        elegirCalcular();
    }
    
    private static Vector3 crearVector(){
        Vector3 x= new Vector3();
        
        System.out.print("X: ");
        x.setX(Double.parseDouble(entradaS.nextLine()));
        
        System.out.print("Y: ");
        x.setY(Double.parseDouble(entradaS.nextLine()));
        
        System.out.print("Z: ");
        x.setZ(Double.parseDouble(entradaS.nextLine()));
        
        return x;
    }
    
    private static void elegirCalcular(){
        int eleccion= 0;
        System.out.println("1- Sumar.\n2- Restar.\n3- Calcular producto escalar.\n4- Calcular longitud.\n5- Calcular producto vectorial.\n6- Calcular longitud de paralelogramo.\n7- Calcular volumen de paralelepipedo.");
        
        System.out.print("\nYo elijo la opcion...  ");
        eleccion= Integer.parseInt(entradaS.nextLine());
         switch(eleccion){
            case 1: 
            System.out.println("Elegiste Sumar");
            break;
            
            case 2: 
            System.out.println("Elegiste Restar");
            break;
            
            case 3: 
            System.out.println("Elegiste calcular el producto escalar");
            break;
            
            case 4: 
            System.out.println("Elegiste calcular la longitud");
            break;
            
            case 5: 
            System.out.println("Elegiste calcular el producto vectorial");
            break;
            
            case 6: 
            System.out.println("Elegiste calcular longitud del paralelogramo");
            break;
            
            case 7: 
            System.out.println("Elegiste calcular volumen de paralelepipedo");
            break;
            
            default: 
            System.out.println("No es una opcion valida");
            break;
        }
    }
}
