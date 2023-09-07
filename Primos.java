
import java.util.Scanner;
public class Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor");
        int qnt = scanner.nextInt(); //Converte para número a entrada
        int numero = 2;
        int count = 0;
        while (count < qnt) {
            //se for verdade
            if (Primo(numero)) {
               System.out.println(numero);
               count++;
            }
            numero++;
    }

}
  public static boolean Primo(int n) {
    //se n for menor que 1
        if (n <= 1) {
            return false;
        }
    //verifica até a raiz do numero ser menor ou igual a ele
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

