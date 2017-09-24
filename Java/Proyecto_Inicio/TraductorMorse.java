import java.util.Scanner;
import java.util.ArrayList;
/**
 * Un programa que traduce oraciones en codigo morse.
 * @author Chompy129
 * @version 2.0
 */
public class TraductorMorse
{
    /**
     * Activa el programa, decide que modalidad elegir (traducir a morse o traducir a letra).
     */
    public static void main(String[] args){
        Scanner entradaS = new Scanner(System.in);

        System.out.println("Bienvenido a mi traductor\n\n¿Quieres traducir oraciones a morse(y) o traducir morse a oraciones(n)?");
        if(entradaS.nextLine().equalsIgnoreCase("n")){
            traducirAOracion();
        }
        else{
            traducirAMorse();
        }
    }
    
    /**
     * La modalidad traducir a morse, se encarga de pedir al usuario la frase u oracion que sera traducida.
     * Escanea la oracion para traducir letra por letra.
     */
    private static void traducirAMorse(){
        Scanner entradaS  = new Scanner(System.in);
        String  frase     = "";

        System.out.println("Escribe tu frase u oracion:");
        frase = entradaS.nextLine();
        System.out.println("\nResultado:");
        for(int i = 0; i < frase.length(); i++){
            System.out.print( traducirL_M(frase.substring(i,i+1), true) + " ");
        }
        System.out.println("");
    }  
    
    /**
     * La modalidad traducir a caracteres alfanumericos, se encarga de pedir al usuario la frase u oracion que sera traducida.
     * Escanea la oracion para traducir cada pieza de morse, determina la longitud de cada pieza para poder traducirla.
     */
    private static void traducirAOracion(){
        Scanner entradaS         = new Scanner(System.in);
        String  frase            = "";
        int     inicioCaracter   = 0;
        int     finalCaracter    = 0;

        System.out.println("Reglas:\n -Letras separadas por un espacio\n -Al hacer espacios debe colocar tres de ellos\n -Finalizar codigo con un espacio\nEscribe tu codigo en morse:");
        frase = entradaS.nextLine();
        System.out.println("\nResultado:");
        if(!frase.substring(frase.length() - 1, frase.length()).equals(" "))
        {
            System.out.println("ERROR: No se detecto un espacio al final");
            traducirAOracion();
        }
        else
        {
            while(true)
            {
                inicioCaracter = finalCaracter;
                do{finalCaracter++;}while( !frase.substring(finalCaracter-1, finalCaracter).equals(" ") );

                System.out.print(    traducirL_M( frase.substring(inicioCaracter, finalCaracter-1), false )    );
                if(finalCaracter == frase.length())
                {
                    break;
                }
                else if(frase.substring(inicioCaracter, finalCaracter+1).equals("  "))
                {
                    System.out.print(" ");
                }
            }
        }
        System.out.println("");
    }
    
    /**
     * Se encarga de traducir un caracter de letra a morse y viceversa.
     * 
     * @param caracterM Una cadena de texto de longitud variable, puede ser morse o letra.
     * @param aMorse Un valor booleano, si se envia true entonces se encargara de traducir letras a morse, si se envia false traducira morse a letras.
     * 
     * @return El caracter morse o letra correspondiente (ej: con aMorse = true, si se envia "a" devolvera ".-"). Si se envia un caracter extraño o se hace mal uso de aMorse, devuelve ERROR.
     */
    private static String traducirL_M(String caracterM, boolean aMorse){
        String[]            morse  = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", " ", "", "ERROR"};
        String[]            letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " ", "", "ERROR"};
        ArrayList<String[]> orden  = new ArrayList<String[]>(0);
        int                 selec  = -1;
        
        if(aMorse)
        {
            orden.add(letras);
            orden.add(morse);
        }
        else
        {
            orden.add(morse);
            orden.add(letras);
        }
        do
        {
            selec++;
            if(selec == orden.get(0).length)
            {
                selec--;
                break;
            }
        }while( !orden.get(0)[selec].equalsIgnoreCase(caracterM) );

        return orden.get(1)[selec];
    }



    /**
     * DEPRECATED
     * Traduce una morse a letra.
     * 
     * @param caracter El caracter que sera enviado.
     * @return La letra correspondiente. Ejemplo: si se envia ".-" devuelve "a"
     */
    private static String traducirMorse_Letra(String caracterM){
        String caracterNew = "";

        switch(caracterM){
            case ".-":
            caracterNew = "a"; 
            break;
            case "-...":
            caracterNew = "b"; 
            break;
            case "-.-.":
            caracterNew = "c"; 
            break;
            case "-..":
            caracterNew = "d"; 
            break;
            case ".":
            caracterNew = "e"; 
            break;
            case "..-.":
            caracterNew = "f"; 
            break;
            case "--.":
            caracterNew = "g"; 
            break;
            case "....":
            caracterNew = "h"; 
            break;
            case "..":
            caracterNew = "i"; 
            break;
            case ".---":
            caracterNew = "j"; 
            break;
            case "-.-":
            caracterNew = "k"; 
            break;
            case ".-..":
            caracterNew = "l"; 
            break;
            case "--":
            caracterNew = "m"; 
            break;
            case "-.":
            caracterNew = "n"; 
            break;
            case "---":
            caracterNew = "o"; 
            break;
            case ".--.":
            caracterNew = "p"; 
            break;
            case "--.-":
            caracterNew = "q"; 
            break;
            case ".-.":
            caracterNew = "r"; 
            break;
            case "...":
            caracterNew = "s"; 
            break;
            case "-":
            caracterNew = "t"; 
            break;
            case "..-":
            caracterNew = "u"; 
            break;
            case "...-":
            caracterNew = "v"; 
            break;
            case ".--":
            caracterNew = "w"; 
            break;
            case "-..-":
            caracterNew = "x"; 
            break;
            case "-.--":
            caracterNew = "y"; 
            break;
            case "--..":
            caracterNew = "z"; 
            break;
            case " ":
            caracterNew = " ";
            break;
            case "":
            //NADA
            caracterNew = "";
            break;
            default:
            caracterNew = "ERROR";
            break;
        }
        return caracterNew;
    }
    
    /**
     * DEPRECATED
     * Traduce una letra a morse.
     * 
     * @param caracter El caracter que sera enviado
     * @return El morse correspondiente. Ejemplo: si se envia "a" devuelve ".-"
     */
    private static String traducirLetra_Morse(String caracter){
        String caracterNew = "";
        caracter    = caracter.toLowerCase();

        switch(caracter){
            case "a":
            caracterNew = ".-"; 
            break;
            case "b":
            caracterNew = "-..."; 
            break;
            case "c":
            caracterNew = "-.-."; 
            break;
            case "d":
            caracterNew = "-.."; 
            break;
            case "e":
            caracterNew = "."; 
            break;
            case "f":
            caracterNew = "..-."; 
            break;
            case "g":
            caracterNew = "--."; 
            break;
            case "h":
            caracterNew = "...."; 
            break;
            case "i":
            caracterNew = ".."; 
            break;
            case "j":
            caracterNew = ".---"; 
            break;
            case "k":
            caracterNew = "-.-"; 
            break;
            case "l":
            caracterNew = ".-.."; 
            break;
            case "m":
            caracterNew = "--"; 
            break;
            case "n":
            caracterNew = "-."; 
            break;
            case "ñ":
            caracterNew = ""; 
            break;
            case "o":
            caracterNew = "---"; 
            break;
            case "p":
            caracterNew = ".--."; 
            break;
            case "q":
            caracterNew = "--.-"; 
            break;
            case "r":
            caracterNew = ".-."; 
            break;
            case "s":
            caracterNew = "..."; 
            break;
            case "t":
            caracterNew = "-"; 
            break;
            case "u":
            caracterNew = "..-"; 
            break;
            case "v":
            caracterNew = "...-"; 
            break;
            case "w":
            caracterNew = ".--"; 
            break;
            case "x":
            caracterNew = "-..-"; 
            break;
            case "y":
            caracterNew = "-.--"; 
            break;
            case "z":
            caracterNew = "--.."; 
            break;
            case " ":
            caracterNew = " ";
            break;
            default:
            caracterNew = "ERROR";
            break;
        }
        return caracterNew;
    }
}
