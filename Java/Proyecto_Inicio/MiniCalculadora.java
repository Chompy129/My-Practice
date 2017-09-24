/**
 * Una clase con unos metodos para realizar operaciones matematicas.
 * @author Chompy129
 * @version 1.0
 */
public class MiniCalculadora{
    
    public MiniCalculadora(){
        
    }
    
    public double calcularRaiz(double n){
        return Math.sqrt(n);
    }
    
    public double calcularValorAbsoluto(double n){
        return Math.abs(n);
    }
    
    public String obtenerString(String cadena, int beginIndex, int endIndex){
        String i= cadena.substring(beginIndex, endIndex);
        //System.out.println("Se recibe: "+i);
        return i;
    }
    public String obtenerString(String cadena, int beginIndex){
        String i= cadena.substring(beginIndex);
        System.out.println("Se recibe: "+i);
        return i;
    }
    public boolean esPar(int n){
        if(n%2 == 0){return true;}
            else{return false;}
    }
}