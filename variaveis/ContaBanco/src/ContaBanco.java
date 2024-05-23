import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua Agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite Número: ");
        int numero = scanner.nextInt();

        if (nome.equals("Mario Andrade") && agencia.equals("0678") && numero == 1021) {
            System.out.println("Olá Mario Andrade, seu saldo em conta é 237.48");
        } else {
            CadastroUsuario.MenuSelecao.main(new String[0]);
        }
    }
}