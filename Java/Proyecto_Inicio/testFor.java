//Clase test del for ejemplo aprenderaprogramar.com
public class testFor {
    public static void main (String [ ] args) {
        for (int i = 0; i < 5; i++) {  //Repite Gracias cinco veces
            System.out.println ("Gracias");    }
        for (int i=0; i < ("Gracias").length();  i++) { //Va devolviendo en cada iteración una letra más de la cadena
            System.out.println ("Gracias".substring (0, i+1) );  }
    } //Cierre del main
} //Cierre de la clase