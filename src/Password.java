import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        String senha = "12345";
        int tentativasMaximas = 3;
        int tentativas = 0;

        // Loop de 3 tentativas de login
        while (tentativas < tentativasMaximas) {
            //Solicita entrada de senha
            System.out.println("Digite a senha:");
            // Lê a entrada do usuário e armazena em uma variável
            String senhaUser = scanner.nextLine();

            if (senha.equals(senhaUser)) {
                System.out.println("Acesso autorizado!");
                break;
            }
            else {
                System.out.println("Senha incorreta. Tentativas restantes:" +(tentativasMaximas - tentativas -1));
                tentativas++;
            }
        if (tentativas == tentativasMaximas) {
            System.out.println("Acesso bloqueado.");
        }
        }
        scanner.close();
    }
}
