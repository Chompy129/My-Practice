
import java.util.Scanner;
/**
 * Programa
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Program
{
    public static void main(String[] args){
        Scanner nScan = new Scanner(System.in);

        System.out.println("Bienvenido al programa de calculos matematicos".toUpperCase());
        System.out.println("¿Qué deseas calcular?\n");

        System.out.println("1 - Potencias\n2 - Factoriales\n3 - Combinatorios");
        System.out.print("Escribe el numero correspondiente a tu respuesta... ");

        int      seleccion = Integer.parseInt(nScan.nextLine());
        boolean  continuar = true;
        while(continuar){
            System.out.print("\nVamos a calcular ");
            switch(seleccion){
                case 1:
                    potencias();
                break;
                case 2:
                    factoriales();
                break;
                case 3:
                    combinatorios();
                break;
            }
            System.out.print("Para repetir presione Y... ");
            
            if( ! nScan.nextLine().toLowerCase().equals("y") ){
                continuar = false;
            }
        }
    }

    private static void potencias(){
        Scanner nScan = new Scanner(System.in);
        int n = 0;
        int m = 0;
        
        System.out.println("potencias:");
        System.out.print("Pides que el numero: ");
        n = Integer.parseInt(nScan.nextLine());
        System.out.print("Este elevado a la: ");
        m = Integer.parseInt(nScan.nextLine());
        
        System.out.println( "El resultado es: " + Calculador.Pow(n, m) + "\n" );
    }
    private static void factoriales(){
        Scanner nScan = new Scanner(System.in);
        int n = 0;
        
        System.out.println("factoriales:");
        System.out.print("Pides el factorial de: ");
        n = Integer.parseInt(nScan.nextLine());
        
        System.out.println( "El resultado es: " + Calculador.Fac(n) + "\n" );
    }
    private static void combinatorios(){
         Scanner nScan = new Scanner(System.in);
        int n = 0;
        int m = 0;
        
        System.out.println("combinatorios:");
        System.out.print("Pides un proceso combinatorio entre: ");
        n = Integer.parseInt(nScan.nextLine());
        System.out.print("Y: ");
        m = Integer.parseInt(nScan.nextLine());
        
        System.out.println( "El resultado es: " + Calculador.Comb(n, m) + "\n" );
        
    }
}
