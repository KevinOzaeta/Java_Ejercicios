import java.util.Scanner;
public class Main {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Ingresa una cadena");
            String cadena=sc.nextLine();
            String nuevaCadena="";
            System.out.println("Esta es la cadena al reves...");

            for(int c=0; c<cadena.length();c++){
                nuevaCadena=cadena.charAt(c)+nuevaCadena;
            }
            System.out.println(nuevaCadena);

        }
    }
