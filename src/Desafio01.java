import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //indica quantos minutos faltam para o final do expediente
        int A = scanner.nextInt() + scanner.nextInt(); //indica quantos minutos são necessários para fabricar os presentes

        if (A>N){
            System.out.println("Deixa para amanha!");
        }else{
            System.out.println("Farei hoje");
        }
    }
}
