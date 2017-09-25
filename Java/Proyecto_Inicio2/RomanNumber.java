
import java.util.Scanner;
/**
 * Convierte numeros a romanos
 * 
 * @author Chompy129
 * @version 1.0
 */
public class RomanNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        
        int n = Integer.parseInt(scan.nextLine());
        while(n != -1){
            System.out.println(toRoman( n ) );
            n = Integer.parseInt(scan.nextLine());
        }
        /*
        for(int i = 0; i < 100; i+=10){
            String ord = "";
            for(int j = 1; j <= 10; j++){
                ord += toRoman(i+j) + ", ";
            }
            System.out.println(ord.substring(0, ord.length() - 2));
        }*/
    }

    private static String toRoman(int number){
        int n = number;
        String rm = "";

        if(n <= 100 && n > 0){
            while(true){
                if(n == 100){
                    rm += "C";
                    n-=100;
                }else if(n >= 50){
                    rm += "L";
                    if(n >= 90 && n < 100){rm = rm.substring(0, rm.length()-1) + "XC"; n-=40;}
                    n -= 50;
                }else if (n >= 10){
                    rm += "X";
                    if(n >= 40 && n < 50){rm+="L"; n-=30;}
                    n -= 10;
                }else if (n >= 5){
                    rm += "V";
                    if(n == 9){rm = rm.substring(0, rm.length()-1) + "IX"; n-=4;}
                    n -= 5;
                }else if (n >= 1){
                    rm += "I";
                    if(n == 4){rm+="V"; n-=3;}
                    n -= 1;
                }else if (n <= 0){break;}
            }
        }

        return rm;
    }
    /*private static int abs(int n){
    if(n<0){return n * -1;}
    return n;
    }*/
}
