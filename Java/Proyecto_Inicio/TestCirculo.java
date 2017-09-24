import javax.swing.JOptionPane;
/**
 * Testea el funcionamiento de la clase Circulo.
 * @author Chompy129
 * @version 1.0
 */
public class TestCirculo{
   public static void main(String[] args){
       Circulo circunferencia= new Circulo();
       circunferencia.setRadio(Double.parseDouble(JOptionPane.showInputDialog("Introdusca el radio del circulo:")));
       
       System.out.println("El area del circulo es " + circunferencia.calcularArea());
       System.out.println("La longitud del circulo es " + circunferencia.calcularLongitud());
   }
}
