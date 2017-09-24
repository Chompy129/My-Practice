import java.util.Arrays;
public class TestMetodoFillArrays {
    public static void main (String [ ] Args) {   //main cuerpo del programa ejemplo aprenderaprogramar.com
        int [ ] miArray = {45,9,12,5,4,9,15,87,18,10};
        Arrays.fill(miArray, miArray.length-7, miArray.length-5, 33);
        for (int tmp= 0; tmp < miArray.length; tmp++) {
            
            if(tmp == 9){
                System.out.println(miArray[tmp] + ".");
            }
            else{
                System.out.print (miArray[tmp] + ",");
            }
        }    //Recorrido del array con un for each   
    }
} //Cierre del main y de la clase