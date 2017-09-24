import javax.swing.JOptionPane;
public class ejemplo1{
    public static void main (String[] Args) {
        String entradaUsuario = JOptionPane.showInputDialog ( "Introduzca un número:" );
        Integer i= 0;
        System.out.println ("El doble del número introducido es: " + 2*i.valueOf(entradaUsuario));  
    }
}