package pkgif;
import java.util.Scanner;
public class If {
    public void Divisible(){
        int n, d;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca dos enteros:");
        n = entrada.nextInt();
        d = entrada.nextInt();
        if (n%d == 0) {
            System.out.println(n + " es divisible por " + d);
        }
    }
    public static void main(String[] args) {
        If divisible = new If();
        divisible.Divisible();
    }
}
