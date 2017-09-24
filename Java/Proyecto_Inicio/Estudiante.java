/* Ejemplo - aprenderaprogramar.com */
public class Estudiante { //El nombre de la clase
 
    private String nombre; //Campo de los objetos Estudiante
 
    //Constructor: cuando se cree un objeto Estudiante se ejecutará el código que incluyamos en el constructor
    public Estudiante () {
        nombre = "Pepe";
    } //Cierre del constructor
 
    //Método que devuelve true si el nombre del objeto tipo Estudiante es Pepe
    public boolean esPepe() {
        return nombre.equals("Pepe");
    } //Cierre del método
} //Cierre de la clase