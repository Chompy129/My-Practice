import java.util.Scanner;
/**
 * Esto es algo porque si.
 * 
 * (17/01/2017) Estoy aprendiendo vectores en el espacio (matemática) y quise realizar todos esas operaciones
 *              en un programa informatico.
 *              
 * @author Chompy129 (Angel Fuenmayor)
 * @version 1.3
 */
public class Vector3
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    private double z;

    /**
     * Constructor con valores por defecto.
     */
    public Vector3()
    {
        // initialise instance variables
        x = .0;
        y = .0;
        z = .0;
    }
    
    /**
     * Constructor con parametros para inicializar el objeto con valores especificos.
     * 
     * @param  x El vector x en el espacio (ancho).
     * @param  y El vector y en el espacio (alto).
     * @param  z El vector z en el espacio (Profundidad).
     */
    public Vector3(double x, double y, double z){
        // initialise instance variables
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    //Setters and getters
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setZ(double z){
        this.z = z;
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    
    //Metodos
    /**
     * Invierte los valores de los ejes de un vector. Se debe seleccionar que eje va a ser invertido.
     * @param xI Se debe pasar un Boolean. Si es true se invierte, si es false no hay cambios.
     * @param yI Igual al parametro xI.
     * @param zI Igual al parametro xI.
     */
    public void invertirEjes(boolean xI,boolean yI,boolean zI){
        if(xI){x *= -1;}
        if(yI){y *= -1;}
        if(zI){z *= -1;}
    }
    /**
     * Suma dos vectores
     * @param a El primer Vector3 a sumar.
     * @param b El segundo Vector3 a sumar.
     * @return Un Vector3 con cada eje de a, sumado con el mismo eje de b.
     */
    public Vector3 sumarVectores(Vector3 a, Vector3 b){
        //a+b = (x1 + x2, y1 + y2, z1 + z2)
        Vector3 c= new Vector3();
        
        c.setX( a.getX() + b.getX() );
        c.setY( a.getY() + b.getY() );
        c.setZ( a.getZ() + b.getZ() );
        
        return c;
    }
    /**
     * Resta dos vectores
     * @param a El primer Vector3 a restar.
     * @param b El segundo Vector3 a restar.
     * @return Un Vector3 con cada eje de a, restado con el mismo eje de b.
     */
    public Vector3 restarVectores(Vector3 a, Vector3 b){
        //a-b = (x1 - x2, y1 - y2, z1 - z2)
        Vector3 c= new Vector3();
        
        c.setX( a.getX() - b.getX() );
        c.setY( a.getY() - b.getY() );
        c.setZ( a.getZ() - b.getZ() );
        
        return c;
    }
    /**
     * Calcula la longitud de un Vector3.
     * @return La longitud.
     */
    public double calcularLongitud(){
        //|a| = sqrt(x*x + y*y + z*z)
        double a= Math.sqrt( ( (x*x) + (y*y) + (z*z) ) );
        return a;
    }
    /**
     * Calcula el producto escalar entre dos Vector3.
     * @param a El primer Vector3.
     * @param b El segundo Vector3.
     * @return El producto escalar.
     */
    public double calcularProductoEscalar(Vector3 a, Vector3 b){
        //a*b = |a| |b| cos(alpha)
        //a*b = x1 * x2 + y1 * y2 + z1 * z2
        double c = (a.x * b.x) + (a.y * b.y) + (a.z * b.z);
        return c;
    }
    /**
     * Calcula el angulo que forman dos vectores.
     * @param a El primer vector.
     * @param b El segundo vector.
     * @return El angulo que forman los vectores.
     */
    private double calcularAnguloEntreVectores(Vector3 a, Vector3 b){
        //angulo= calcularProductoEscalar(---) / (a.calcularLongitud() * b.calcularLongitud())
        double angulo = calcularProductoEscalar(a, b) / ((a.calcularLongitud() * b.calcularLongitud()));
        angulo= Math.cos(1/angulo);
        return angulo;
    }
    /**
     * Calcula el producto vectorial entre dos vectores.
     * @param a Indica el primer vector.
     * @param b Indica al segundo vector.
     * @return El vector resultante.
     */
    public Vector3 calcularProductoVectorial(Vector3 a, Vector3 b){
        Vector3 resultante = new Vector3();
        //i(y1*z2 - z1*y2) - j(x1*z2 - x2*z1) + k(a.x*b.y - y1*x2)
        resultante.setX( (a.y * b.z) - (a.z * b.y) );
        resultante.setY( (a.x * b.z) - (b.x * a.z) );
        resultante.setZ( (a.x * b.y) - (a.y * b.x) );
        resultante.invertirEjes(false, true, false);
        
        return resultante;
    }
    /**
     * Calcula la longitud de un paralelogramo con dos vertices.
     * @param a Primer vertice.
     * @param b Segundo vertice.
     * @return la longitud del paralelogramo.
     */
    public double calcularLongitudParalelogramo(Vector3 a, Vector3 b){
        Vector3 prllgrm = new Vector3();

        prllgrm = calcularProductoVectorial(a, b);
        
        return prllgrm.calcularLongitud();
    }
    /**
     * Calcula el volumen de un paralelepipedo a traves de tres vertices.
     * @param a Primer vertice.
     * @param b Segundo vertice.
     * @param c Tercer vertice.
     * @return El volumen del paralelepipedo.
     */
    public double calcularVolumenParalelepipedo(Vector3 a, Vector3 b, Vector3 c){
        Vector3 prllppd = new Vector3();
        prllppd = calcularProductoVectorial(a, b);

        return calcularProductoEscalar(prllppd, c);
    }
}