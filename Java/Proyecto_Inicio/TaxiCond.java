/* Ejemplo - aprenderaprogramar.com */
//Ejemplo de clase que utiliza tipos definidos en otras clases (usa otras clases)
public class TaxiCond {

    private Taxi vehiculoTaxi;
    private Persona conductorTaxi;

    //Constructor
    public TaxiCond (Taxi objetoTaxi, Persona objetoPersona) {
         //Creamos un objeto Taxi con los mismos datos del Taxi recibido como parámetro
         vehiculoTaxi = new Taxi (objetoTaxi.getMatricula(), objetoTaxi.getDistrito(), objetoTaxi.getTipoMotor() );
         //Creamos un objeto Persona con los mismos datos de la Persona recibidos como parámetro
        conductorTaxi = new Persona ();     
    }

    public void setMatricula (String valorMatricula) { vehiculoTaxi.setMatricula(valorMatricula); }
    public void setTipoMotor (int valueTipoMotor){vehiculoTaxi.setTipoMotor(valueTipoMotor) ;}

    //Método que devuelve la información sobre el objeto TaxiCond
    public String getDatosTaxiCond () {
        String matricula = vehiculoTaxi.getMatricula();
        String distrito = vehiculoTaxi.getDistrito();
        int tipoMotor = vehiculoTaxi.getTipoMotor();
        String cadenaTipoMotor = "";
        if(tipoMotor == 0){cadenaTipoMotor= "Desconocido";}
        else if(tipoMotor== 1){cadenaTipoMotor= "Gasolina";}
        else if(tipoMotor== 2){cadenaTipoMotor= "Diesel";}
        /*switch(tipoMotor){
            case 0: cadenaTipoMotor= "Desconocido"; break;
            case 1: cadenaTipoMotor= "Gasolina"; break;
            case 2: cadenaTipoMotor= "Diesel"; break;
        }*/

        String datosTaxiCond = "El objeto TaxiCond presenta estos datos. Matrícula: " + matricula +
            " Distrito: " + distrito + " Tipo de motor: " + cadenaTipoMotor;

        System.out.println (datosTaxiCond);
        return datosTaxiCond;
    } //Cierre del método

} //Cierre de la clase