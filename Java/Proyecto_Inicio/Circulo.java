
/**
 * Define las cualidades de un circulo
 * 
 * @author Chompy129
 * @version 1.0
 */
public class Circulo{
    private static final double numeroPI= 3.1416;
    private double radio;
    
    public Circulo(){
        radio= .0;
    }
    
	//Métodos set
    public void setRadio(double radio){
        this.radio= radio;
    }
	
    //Métodos get
    public double getRadio(){
        return this.radio;
    }
	//Fin métodos set/get
	
	public double calcularArea(){
		return numeroPI * radio * radio;
	}
	
	public double calcularLongitud(){
		return 2 * numeroPI * radio;
	}
}