import java.util.ArrayList;
/**
 * Crea una lista con objetos de tipo CantanteFamoso.
 * 
 * @author Chompy129
 * @version 1.0
 */
public class ListaCantantesFamoso{
    private ArrayList<CantanteFamoso> listaCF;

    public ListaCantantesFamoso(){
        listaCF= new ArrayList<CantanteFamoso>();
    }
    
    public ArrayList<CantanteFamoso> getLista(){
        return listaCF;
    }

    public void anadirCantante(String nombreCantante, String discoConMasVentas){
        CantanteFamoso nuevoCantante= new CantanteFamoso();
        nuevoCantante.setNombre(nombreCantante);
        nuevoCantante.setDiscoConMasVentas(discoConMasVentas);
        listaCF.add(nuevoCantante);
    }
}