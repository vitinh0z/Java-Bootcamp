import java.util.Scanner;

public class CadastroUsuario {

    public static class MenuSelecao {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String[] opcoes = {"Fazer Cadastro", "Sair"};
            int opcaoSelecionada = 0;

            while (true) {
                System.out.println("Selecione uma opção:");

                for (int i = 0; i < opcoes.length; i++) {
                    if (i == opcaoSelecionada) {
                        System.out.println("> " + opcoes[i]);
                    } else {
                        System.out.println("  " + opcoes[i]);
                    }
                }

                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("w") && opcaoSelecionada > 0) {
                    opcaoSelecionada--;
                } else if (input.equalsIgnoreCase("s") && opcaoSelecionada < opcoes.length - 1) {
                    opcaoSelecionada++;
                } else if (input.isEmpty()) {
                    System.out.println("Opção Selecionada: " + opcoes[opcaoSelecionada]);
                    if (opcaoSelecionada == 1) {
                        System.out.println("Saindo...");
                        break;
                    } else if (opcaoSelecionada == 0) {
                        // Adicione a lógica para "Fazer Cadastro" aqui
                        System.out.println("Iniciando o cadastro...");

                        try{
                            Thread.sleep(2000);
                        } catch (InterruptedException e ) {
                            e.printStackTrace();
                        }
                        System.out.println("DIGITE SEU EMAIL");
                        String email = scanner.nextLine();
                        System.out.println("Digite SEU EMAIL NOVAMENTE");
                        String segundoEmail = scanner.nextLine();

                        if (email.equals(segundoEmail)){
                        System.out.println("DIGITE UMA SENHA: ");
                        String senha = scanner.nextLine();

                        System.out.println("Digite sua senha novamente: ");
                        String segundaSenha = scanner.nextLine();

                        try{
                            Thread.sleep(5000);
                        } catch (InterruptedException e ){
                            e.printStackTrace();
                        }
                        System.out.println("Sua conta foi criada ");

                        }
                        else if (!email.equals(segundoEmail)){
                            System.out.println("Email não são iguais");
                        }
                    }
                }

                
            }

            scanner.close();
        }
    }
}