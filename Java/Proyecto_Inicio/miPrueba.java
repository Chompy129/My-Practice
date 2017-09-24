/* Ejemplo - aprenderaprogramar.com */
//Esta clase es una prueba
public class miPrueba {
    public String resultado (String dimeUnString) {
        System.out.println ("dimeUnString inicialmente vale " + dimeUnString);
        dimeUnString = dimeUnString + " recibido";
        System.out.println ("dimeUnString ahora vale " + dimeUnString);
        return "El método devuelve " + dimeUnString;
    }
}