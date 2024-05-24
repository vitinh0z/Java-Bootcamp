import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }


        }
        static void entrandoEmContato(String candidato){
            int tentativaRealizada = 1;
            boolean contunuarTentando = true;
            boolean atendeu = false;
            do {
                atendeu = atender();
                contunuarTentando = !atendeu;
                if (contunuarTentando)
                    tentativaRealizada++;
                else
                    System.out.println("CONTATO REALIZADO");
                
            } while (contunuarTentando && tentativaRealizada <3); 
                if (atendeu)
                    System.out.println("CONSEGUIMOS CONTATO COM " + candidato + "NA " + tentativaRealizada);
                else 
                    System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + "NUMERO MAXIMO ATINGIDO " + tentativaRealizada + "REALIZADA");
            }

        
        static boolean atender(){
            return new Random().nextInt(3)==1;
        }
        static void imprimirSelecionados(){
            String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
            System.out.println("Imprimindo a lista de candidatos informado o indice do elemento");

            for (int indice=0; indice < candidatos.length; indice++){
                System.out.println("o candidato de nº " + (indice+1) + "é" + candidatos[indice]);
            }
    } 
    static void selecaoCandidatos (){
        String [] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "VICTOR", "VITÓRIA"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual > candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou esse valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;

            }
            candidatosAtual++;

        }
        
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

static void analisarCandidato(double salarioPretendido){
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido){
        System.out.println("Ligar para o candidato");
    } else if (salarioBase == salarioPretendido)
        System.out.println("Ligando para o candidato com contra proposta");
    else {
        System.out.println("Aguarde o resultado dos demais candidatos");
    }
    
    }
}
