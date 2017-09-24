import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java
// Definimos una clase EntradaDeTeclado aprenderaprogramar.com
public class EntradaDeTeclado {
    private String entradaTeclado; //Variable de instancia (campo) de la clase
 
    public EntradaDeTeclado ()  { //Constructor
        entradaTeclado="";
        pedirEntrada(); //Esto es una llamada a un método interno. Al crear un objeto ejecutamos el método
    } //Cierre del constructor
 
    public void pedirEntrada ()  {  //Método de la clase          
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine ();     } //Cierre del método pedirEntrada
 
    public String getEntrada () { return entradaTeclado; } //Cierre del método getEntrada
    public String getPrimeraPalabra ()  {
       /*IMPORTANTE: EN JAVA LOS OBJETOS NO SE PUEDEN COMPARAR USANDO == POR ESO ESTO NO FUNCIONARÁ       
          if (entradaTeclado.substring(0,1)=="j") {
          System.out.println ("Hemos detectado una j");
          } else { System.out.println ("Mira esto:" + entradaTeclado.substring(0,1) ); }*/  
        for (int i=0; i < entradaTeclado.length()-1; i++) {
            if (entradaTeclado.substring (i, i+1).equals(" ") ) {     //IMPORTANTÍSIMO: COMPARAMOS CON EQUALS
                return entradaTeclado.substring(0, i);        
            }
        }
        return entradaTeclado;  //Caso de que no se detecte ningún espacio devolvemos lo que haya
    } //Cierre del método getPrimeraPalabra
    public String getSegundaPalabra(){
        int inicioDeSegunda= 0;
        for (int i=0; i < entradaTeclado.length()-1; i++) {
            if (entradaTeclado.substring (i, i+1).equals(" ") ) {     //IMPORTANTÍSIMO: COMPARAMOS CON EQUALS
                inicioDeSegunda= i; break;
            }
        }
        
        int fin= 0;
        if(inicioDeSegunda != 0){fin= inicioDeSegunda;}
        while(inicioDeSegunda < entradaTeclado.length()-1) {
            if (entradaTeclado.substring (fin+1, fin+2).equals(" ")){
                return entradaTeclado.substring(inicioDeSegunda+1, fin+1);
            }
            fin++;
            
            if(entradaTeclado.substring(fin+1).isEmpty()){
                if(fin+1==entradaTeclado.length()){return "";}
                return entradaTeclado.substring(inicioDeSegunda+1);
            }
        }
        return entradaTeclado;
    }

    public int getCantidadDePalabras(){
        int cantidad= 0;

        if(entradaTeclado.isEmpty()){
            return 0;
        }
        else{
            for(int i=0; i < entradaTeclado.length(); i++){
                if(entradaTeclado.substring(i, i+1).equals(" ")){
                    cantidad++;
                }
            }
        }
        return cantidad+1;
    }

    public int getLongitud ()  {  //Método de la clase
        return entradaTeclado.length();
    } //Cierre del método getLongitud
} //Cierre de la clase