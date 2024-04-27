import java.util.Scanner;

public class  EntradaNumero {
    public static void main(String[] args) throws Exception {

       
    Scanner scanner = new Scanner (System.in);

    // Solicita que o usuario digite um número
    System.out.println("Digite um Número:  ");
    
    // Lê o número digitado pelo usúario
     int numero = scanner.nextInt();

    // Exibe o número digitado pelo usuário
    System.out.println("Número que você digitou foi:  " + numero);


    }

}
