import java.util.Random;
/**
 * Write a description of class Probable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Probable
{
    // instance variables - replace the example below with your own
    private Random x;

    /**
     * Constructor for objects of class Probable
     */
    public Probable()
    {
        // initialise instance variables
        x = new Random();
    }

    public void CuantasVeces(int veces){
        int y = 0;
        
        for(int i = 0; i < veces; i++){
            y += menosDeCinco( x.nextInt(100) );
        }
        
        System.out.println("Has capturado un total de: " + y);
        
       
    }
    
    private int menosDeCinco(int numero){
        if(numero <= 5){
            return 1;
        }
        
        return 0;
    }
}
