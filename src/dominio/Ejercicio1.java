package dominio;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero mayor o igual a 1");
        num=sc.nextInt();
        System.out.println(suma(num));
    }
    public static int suma(int n){
        if(n<=1)
            return n;
        else
            return n+suma(n-1);

    }
}
