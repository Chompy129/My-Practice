import java.util.ArrayList;
/**
 * Contiene y administra una lista de cantantes famosos.
 * @version 1.1
 */
public class ListaCantantesFamosos1{
    private ArrayList<String> listaCantantesF;
    public ListaCantantesFamosos1(){
        listaCantantesF = new ArrayList<String>();
        listaCantantesF.add("Michael Jackson");
        listaCantantesF.add("Elvis Presley");   
        listaCantantesF.add("Shakira");
    }

    public ArrayList<String> getLista(){
        return listaCantantesF;
    }
    
    public void obtenerContenidoLista(){
        for(String nombre: listaCantantesF){
            System.out.println("- " + nombre);
        }
    }
    
    public void colocarCantante(String nuevoCantante){
        listaCantantesF.add(nuevoCantante);
    }
}