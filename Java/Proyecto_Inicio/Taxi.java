/* Ejemplo - aprenderaprogramar.com */
//Esta clase representa un taxi.
public class Taxi { //El nombre de la clase
 
    private String ciudad; //Ciudad de cada objeto taxi
    private String matricula; //Matrícula de cada objeto taxi
    private String distrito; //Distrito asignado a cada objeto taxi
    private int tipoMotor; //tipo de motor asignado a cada objeto taxi. 0 = desconocido, 1 = gasolina, 2 = diesel
 
    //Constructor 1: constructor sin parámetros
    public Taxi () {
        ciudad = "México D.F.";       
        matricula = "";
        distrito = "Desconocido";
        tipoMotor = 0;
    } //Cierre del constructor
 
    //Constructor 2: constructor con parámetros
    public Taxi (String valorMatricula, String valorDistrito, int valorTipoMotor) {
    ciudad = "México D.F.";
    matricula = valorMatricula;
    distrito = valorDistrito;
    tipoMotor = valorTipoMotor;
    } //Cierre del constructor
 
    //Método para establecer la matrícula de un taxi
    public void setMatricula (String valorMatricula) {
        matricula = valorMatricula; //La matrícula del objeto taxi adopta el valor que contenga valorMatricula
    } //Cierre del método
 
    //Método para establecer el distrito de un taxi
    public void setDistrito (String valorDistrito) {
        distrito = "Distrito " + valorDistrito; //El distrito del objeto taxi adopta el valor indicado
    } //Cierre del método
   
    //Método para establecer el tipo de motor de un taxi
    public void setTipoMotor (int valorTipoMotor) {
        tipoMotor = valorTipoMotor; //El tipoMotor del objeto taxi adopta el valor que contenga valorTipoMotor
    } //Cierre del método
   
    //Método para obtener la matrícula del objeto taxi
    public String getMatricula () { return matricula; } //Cierre del método
   
    //Método para obtener el distrito del objeto taxi
    public String getDistrito () { return distrito; } //Cierre del método
   
    //Método para obtener el tipo de motor del objeto taxi
    public int getTipoMotor () { return tipoMotor; } //Cierre del método
 
} //Cierre de la clase