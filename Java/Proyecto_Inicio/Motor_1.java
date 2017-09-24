/**
 * Define un motor y sus características.
 * 
 * @author Chompy129 
 * @version 1.1
 */
public class Motor_1{
    private int tipoBomba;
    private String tipoFluido;
    private String combustible;

    public Motor_1(){
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
    public boolean dimeSiMotorEsParaAgua(){
        boolean motorEsParaAgua;

        if(tipoBomba == 1){motorEsParaAgua= true;}
        else{motorEsParaAgua= false;}

        return motorEsParaAgua;
    }

}