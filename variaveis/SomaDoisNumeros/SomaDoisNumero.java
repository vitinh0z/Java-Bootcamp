import java.util.Scanner;

    public class SomaDoisNumero {

    public static void main (String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("Escolha a operção\n [-] \n [+] ");

        String opcao = scanner.next();

        if (opcao.equals("-")) {

            // Solicita que digite o primeiro número
            System.out.println("DIgite o Primeiro Número: ");

            int numero1 = scanner.nextInt();

            // Solicita que digite o segundo número
            System.out.println("Digite o Segundo Número: ");

            int numero2 = scanner.nextInt();
            int subtracao = numero1 - numero2;

        System.out.println("A subtrção entre de " + numero1 + " e "  + numero2 + " é " + subtracao );
    
        
        } else if (opcao.equals("+")) {

            // Solicita que digite o primeiro número
            System.out.println("DIgite o Primeiro Número: ");

        int numero1 = scanner.nextInt();

        // Solicita que digite o segundo número
        System.out.println("Digite o Segundo Número: ");

        int numero2 = scanner.nextInt();
        int soma = numero1 + numero2;

        System.out.println("A soma entre de " + numero1 + " e "  + numero2 + " é " + soma );

         }
        scanner.close();
    }
}
