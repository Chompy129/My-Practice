import java.util.ArrayList;
/**
 * Se encarga de administrar datos de una tabla estadistica
 * 
 * @author ANGEL FUENMAYOR
 * @version 05/2017
 */
public class TablaEstadistica
{
    /**
     * Cantidad total de datos.
     */
    private int n;
    /**
     * Lista de cada dato en la tabla.
     */
    private ArrayList<Float> xi;
    /**
     * Version sin repeticiones de valores de xi
     */
    private ArrayList<Float> Xi;
    /**
     * Lista de que tanto se repite un dato en la tabla (frecuencia absoluta).
     */
    private ArrayList<Float> fi;
    /**
     * Lista del cociente de la frecuencia absoluta del dato y la cantidad
     * n de datos (frecuencia relativa).
     */
    private ArrayList<Float> hi;
    /**
     * La suma total de frecuencias absolutas anteriores al dato especificado
     * (frecuencia absoluta acumulada).
     */
    private ArrayList<Float> Fi;
    /**
     * El cociente entre la frecuencia absoluta acumulada del dato y la
     * cantidad n de datos (frecuencia relativa acumulada).
     */
    private ArrayList<Float> Hi;
    
    //CONSTRUCTOR
    public TablaEstadistica(){
        this.xi = new ArrayList<Float>(0);
        this.n  = xi.size();
        
        this.Xi = new ArrayList<Float>(0);
        this.fi = new ArrayList<Float>(0);
        this.hi = new ArrayList<Float>(0);
        this.Fi = new ArrayList<Float>(0);
        this.Hi = new ArrayList<Float>(0);
    }
    
    public TablaEstadistica(ArrayList<Float> xi){
        this.xi = xi;
        this.n  = xi.size();
        
        UpdateDATA();
    }
    /**
     * Actualiza todos los datos que dependen de xi
     */
    private void UpdateDATA(){
        ArrayList<Float> newXi = new ArrayList<Float>(0);
        ArrayList<Float> newfi = new ArrayList<Float>(0);
        for (float element : xi){
            if (!newXi.contains(element)){
                newXi.add(element);
                newfi.add(1F);
            }else{
                for(int i = 0; i < newXi.size(); i++){
                    if(element == newXi.get(i)){
                        newfi.set(i, newfi.get(i) + 1F);
                    }
                }
            }
        }
        Xi = newXi;
        fi = newfi;
        
    }
    
    //SETTERS AND GETTERS
    public void setxi(ArrayList<Float> xi){
        this.xi = xi;
        n = xi.size();
        
        UpdateDATA();
    }
    
    public int              getN() { return n;  }
    public ArrayList<Float> getxi(){ return xi; }
    public ArrayList<Float> getXi(){ return Xi; }
    public ArrayList<Float> getfi(){ return fi; }
    public ArrayList<Float> gethi(){ return hi; }
    public ArrayList<Float> getFi(){ return Fi; }
    public ArrayList<Float> getHi(){ return Hi; }
}
