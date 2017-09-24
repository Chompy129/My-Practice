import java.util.Scanner;
/**
 * Contiene un metodo main.
 * Interactua con los datos recibidos por el usario.
 * @author Chompy129
 * @version 1.0
 */
public class DatosPalabras{
    public static void main(String[] args){
        String datosTeclado= "";
        Scanner entradaDeScanner= new Scanner(System.in);
        String fraseFinal= ""; //Frase que ira construyendose.
        

        System.out.print("Introdusca una frase: ");
        datosTeclado= entradaDeScanner.nextLine();

        //Introduce en la frase si tiene mas de 15 caracteres, entre 15 y 5 caracteres o menos de 5 caracteres.
        if(datosTeclado.length() > 15){
            fraseFinal= "La cadena introducida tiene mas de 15 caracteres";
        }
        else if (datosTeclado.length() <= 15 && datosTeclado.length() >= 5){
            fraseFinal= "La cadena introducida tiene entre 5 y 15 caracteres";
        }
        else{
            fraseFinal= "La cadena introducida tiene menos de 5 caracteres";
        }

        //Añade en la frase si inicia por la letra A (Sea mayuscula o minuscula).
        if(datosTeclado.substring(0, 1).equalsIgnoreCase("a")){
            fraseFinal += " y empieza por la letra A.";
        }
        else{
            fraseFinal += " y no empieza por la letra A.";
        }

        System.out.println(fraseFinal);
    }//Cierre de metodo
}//Cierre de clase