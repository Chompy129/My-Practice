//Clase test del while curso aprenderaprogramar.com
public class testWhile {
    public static void main (String [ ] args) {
        int i = 0;
        while (true) {          //Condición trivial: siempre cierta
            i++;
            System.out.println ("Valor de i: " + i);
            if (i==9) { break;}
        }                
 } //Cierre del main
} //Cierre de la clase