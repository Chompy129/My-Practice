//Clase que permite elevar un número entero m a otro número entero n y obtener un resultado
public class Exponenciador {
//Constructor
     public Exponenciador () {
        //Nada que declarar
    }
    //Método 1 para calcular la potencia
    public int potenciaIterando (int m, int n) {
        int resultado = 1;
        for (int i=1; i<=n; i++) {
            resultado = resultado * m;           
        }
        return resultado;
    } //Cierre del método
    //Método 2 para calcular la potencia
    public int potenciaConRecursion (int m, int n) {
        if (n==0) { return 1; }
        return m * potenciaConRecursion (m, n-1);
    } //Cierre del método
} //Cierre de la clase