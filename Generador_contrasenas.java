
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        String caracteres="1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        int cantidadCaracteres=caracteres.length();
        String contraseña="";
        boolean error;
while(error=true){
    System.out.println("---GENERADOR DE CONTRASEÑAS---");
    System.out.println("Ingresa la logintud de la contraseña...");
    int longitudPassword = sc.nextInt();
    if (longitudPassword < 8 || longitudPassword >24) {
        System.out.println("LA CONTRASEÑA NO CUMPLE EL NUMERO DE CARACTERES RECOMENDADOS...");
        System.out.println("Intenta otra vez...");
    } else {
        for (int c = 0; c < longitudPassword; c++) {
            contraseña = contraseña + caracteres.charAt(r.nextInt(caracteres.length()));

        }
        System.out.println("Esta es la contraseña");
        System.out.println(contraseña);
        break;

    }
}
    }

}
