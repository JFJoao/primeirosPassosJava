import java.util.Scanner;
public class ConversorTemp {
    public static void main(String[] args) {
        int temperaturaFare = 0;

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner (System.in);

        // Solicita temperatura em graus a ser convertida
        System.out.println("Qual a temperatura em graus celsius a ser convertida ?");
        // Lê a entrada do usuário e armazena em uma variável
        int temperaturaUsuario = Integer.parseInt(scanner.nextLine());

        temperaturaFare = (int) (temperaturaUsuario * 1.8 + 32);
        System.out.println(temperaturaUsuario + " graus celsius equivalem a " + temperaturaFare + " graus Fahrenheits.");

    }
}
