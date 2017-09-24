/**
 * Define un motor y sus características.
 * 
 * @author Chompy129 
 * @version 1.0
 */
public class Motor{
    private int tipoBomba;
    private String tipoFluido;
    private String combustible;
    
    public Motor(){
        tipoBomba= 0;
        tipoFluido= "";
        combustible= "";
    }
    
    //setters (Establecer valores)
    public void setTipoBomba(int valueTipoBomba){
        tipoBomba= valueTipoBomba;
    }
    public void setTipoFluido(String valueTipoFluido){
        tipoFluido= valueTipoFluido;
    }
    public void setCombustible(String valueCombustible){
        combustible= valueCombustible;
    }
    
    //Getters (Obtener valores)
    public int getTipoBomba(){return tipoBomba;}
    public String getTipoFluido(){return tipoFluido;}
    public String getCombustible(){return combustible;}
    
    //Metodos
    public void dimeTipoMotor(){
        switch(tipoBomba){
            case 0: System.out.println("No hay establecido un valor definido para el tipo bomba."); break;
            case 1: System.out.println("La bomba es una bomba de agua."); break;
            case 2: System.out.println("La bomba es una bomba de gasolina."); break;
            case 3: System.out.println("La bomba es una bomba de hormigón."); break;
            case 4: System.out.println("La bomba es una bomba de pasta alimenticia."); break;
            default: System.out.println("No existe un valor válido para tipo de bomba."); break;
        }
    }//Cierre de metodo
    
}