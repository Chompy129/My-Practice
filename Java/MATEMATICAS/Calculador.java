
/**
 * Contiene problemas matematicos.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculador
{
    // instance variables - replace the example below with your own
    public Calculador()
    {
    
    }
    /**
     * Exponentes.
     */
    public static int Pow(int value, int n){
        if (n > 1){ return value * Pow(value, n - 1);}
        else{ return value;}
    }
    /**
     * Factorial.
     */
    public static int Fac(int value){
        if(value > 1){ return value * Fac(value - 1); }
        else{ return 1; }
    }
    /**
     * Combinatorio.
     */
    public static int Comb(int m, int n){
        return Fac(m) / ( Fac(n) * Fac(m-n) );
    }
}
