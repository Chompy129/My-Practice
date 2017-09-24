/**
 * Una clase con metodos que combinan cadenas.
 * @author Chompy129
 * @version 1.0
 */
public class SistemaCombinacion{
    
    public SistemaCombinacion(){
        
    }
    
    public String combinadorLimitado(String cadena1, String cadena2, String cadena3){        
        return cadena1.substring(0, 2) + " " + cadena2.substring(0, 4) + "-" + cadena3.substring(0, 6);
    }
    
    public String combinarPalabras(String primeraPalabra, String segundaPalabra){
        return primeraPalabra.substring(0, primeraPalabra.length()/2) + segundaPalabra.substring(segundaPalabra.length()/2, segundaPalabra.length());
    }
    public String descubrirNombreDigimon(String name, String lastName){
        String i= lastName.substring(0, 3) + name.substring(0, 2) + "mon";
        System.out.println("Tu nombre digimon es: "+i);
        return i;
    }
    
    public String crearTituloDeVideo(String frase, String juegoUsado, String nombreCreador){
        return frase + " | (" + juegoUsado + ") | " + nombreCreador;
    }
}