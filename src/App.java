import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite o número: ");
        int numero = sc.nextInt();
        sc.close();
        System.out.println("O número digitado foi: ");
        System.out.println(numero);
        }
    }

