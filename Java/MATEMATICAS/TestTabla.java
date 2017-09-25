import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class TestTabla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestTabla
{
    public static void main(String[] args){
        Scanner nScan = new Scanner(System.in);
        TablaEstadistica tS = new TablaEstadistica();
        
        System.out.println("Escribe los datos:");
        ArrayList<Float> datos = new ArrayList<Float>();
        
        String dato = nScan.nextLine();
        while(!dato.equals("")){
            datos.add(Float.parseFloat(dato));
            
            dato = nScan.nextLine();
        }
        
        tS.setxi(datos);
        
        System.out.println("LOS DATOS SON:\n");
        for(int i = 0; i < tS.getXi().size(); i++){
            System.out.println(tS.getXi().get(i) + "Y se repite " + tS.getfi().get(i) + " veces.");
        }
    }
}
