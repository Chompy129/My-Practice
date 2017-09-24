/**
 * Paquete que incluye un metodo para multiplicar por dieces
 * @author Chompy129
 * @version 1.0
 */
public class MultiplicarDieces{
    
    public MultiplicarDieces(){
        
    }
    /**
     * a= El primer valor
     * n= Segundo valor
     * a multiplica a 10 elevado a n veces
     */
    public double multiplicarPorDieces(double a, int n){
        int resultado = 1;
        for (int i=1; i<=n; i++) {
            resultado = resultado * 10;           
        }
        
        return a * resultado;
    }
}