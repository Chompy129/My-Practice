import formas.formas1dimension.*;
/**
 * Write a description of class Goku here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goku
{
    // instance variables - replace the example below with your own
    private int x;
    private Recta z;
    private Curva j;

    /**
     * Constructor for objects of class Goku
     */
    public Goku()
    {
        // initialise instance variables
        x = 0;
        z= new Recta();
        j= new Curva();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public int obtener(int y, int i){
        return z.sampleMethod(y) + j.sampleMethod(i);
    }
}
