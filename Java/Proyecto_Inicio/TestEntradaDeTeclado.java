// Nuestra clase de prueba aprenderaprogramar.com
public class TestEntradaDeTeclado {
    public static void main (String [ ] args) {
        System.out.println ("Empezamos el programa");      
        System.out.println ("Por favor introduzca la entrada 1:");
        EntradaDeTeclado entrada1 = new EntradaDeTeclado();
        System.out.println ("Por favor introduzca la entrada 2:");
        EntradaDeTeclado entrada2 = new EntradaDeTeclado();
        System.out.println ("Por favor introduzca la entrada 3:");
        EntradaDeTeclado entrada3 = new EntradaDeTeclado();
        System.out.println ("Gracias");
        System.out.println ("La entrada 1 ha sido " + entrada1.getEntrada() + " y consta de " + entrada1.getLongitud() + " caracteres");
        System.out.println ("La entrada 2 ha sido " + entrada2.getEntrada() + " y consta de " + entrada2.getLongitud() + " caracteres");
          System.out.println ("La entrada 3 ha sido " + entrada3.getEntrada() + " y consta de " + entrada3.getLongitud() + " caracteres");
          System.out.println ("La primera palabra de la entrada 1 es " + entrada1.getPrimeraPalabra() + " y la segunda palabra es " + entrada1.getSegundaPalabra());
          System.out.println ("La primera palabra de la entrada 2 es " + entrada2.getPrimeraPalabra() + " y la segunda palabra es " + entrada2.getSegundaPalabra());
          System.out.println ("La primera palabra de la entrada 3 es " + entrada3.getPrimeraPalabra() + " y la segunda palabra es " + entrada3.getSegundaPalabra());
          
          System.out.println ("Primera palabra de las dos primeras entradas iguales? " + entrada1.getPrimeraPalabra().equals(entrada2.getPrimeraPalabra() ) );
    } //Cierre del main
} //Cierre de la clase