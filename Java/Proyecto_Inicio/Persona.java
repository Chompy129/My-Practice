/**
 * Clasificar a cierto numero de personas
 * @author Chompy129 
 * @version 1.0
 */
public class Persona{
    private String name;                   //Nombre
    private String lastName;               //Apellido
    private int age;                       //Edad
    private boolean married;               //¿Esta casado/a?
    private String identityDocumentNumber; //Numero del documento de identidad

    //Constructor
    public Persona(){
        name= "";
        lastName= "";
        age= 0;
        married= false;
        identityDocumentNumber= "No establecido";
    } //Cierre de constructor

    //Como se definen las caracteristicas:
    //Nombre
    public void setName(String valueName){
        name= valueName;
    }
    //Apellido
    public void setLastName(String valueLastName){
        lastName= valueLastName;
    }
    //Edad
    public void setAge(int valueAge){
        age= valueAge;
    }
    //Casado/a o no casado/a
    public void married(boolean valueMarried){
        married= valueMarried;
    }
    //Su numero de identidad
    public void setIdentityDocumentNumber(String valueIdentityDocumentNumber){
        identityDocumentNumber= "CI-"+valueIdentityDocumentNumber;
    }

    //Obtener las caracteristicas:
    //Nombre
    public String getName(){return name;}
    //Apellido
    public String getLastName(){return lastName;}
    //Edad
    public int getAge(){return age;}
    //Casado/a o no casado/a
    public boolean married(){return married;}
    //Su numero de identidad
    public String getIdentityDocumentNumber(){return identityDocumentNumber;}

}