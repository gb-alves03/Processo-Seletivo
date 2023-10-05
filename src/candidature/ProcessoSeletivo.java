package candidature;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class ProcessoSeletivo {

    public static void selecaoCandidatos() {
        String [] candidatos = {"GABRIEL", "FELIPE", "MARCELO", "MARIA", "LORENA", "JOSEFINA", "ANTONELA", "MURILO", "GIOVANNI"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        try {
            while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
                if (salarioBase >= salarioPretendido) {
                    System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                    candidatosSelecionados++;
                } else {
                    System.out.println("O candidato " + candidato + " não foi selecionado para a vaga!");
                }
                candidatoAtual++;
            }
        } catch(Exception e) {
            System.out.println("Erro ao selecionar o candidato " + e.getMessage());
        }
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    public static void imprimirSelecionados() {
        String [] candidatos = {"GABRIEL", "FELIPE", "MARCELO", "MARIA", "LORENA"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        try {
            for(String candidato : candidatos) {
                System.out.println("O candidato selecionado foi " + candidato);
            }
        } catch(Exception e) {
            System.out.println("Erro ao imprimir os candidatos selecionados");
        }
    }

    public static void contato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        try {
            do {
                atendeu = atender();
                continuarTentando = !atendeu;
                if(continuarTentando) {
                    tentativasRealizadas++;
                } else {
                    System.out.println("Contato realizado com sucesso!");
                }
            } while(continuarTentando && tentativasRealizadas < 3);

            if (atendeu) {
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa.");
            } else {
                System.out.println("Não conseguimos contato com " + candidato + " , número máximo de tentativas realizadas excedido");
            }
        } catch(Exception e) {
            System.out.println("Erro ao realizar contato com o candidato" + e.getMessage());
        }
    }
    public static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;

        try {
            if(salarioBase > salarioPretendido) {
                System.out.println("Ligar para o Candidato!");
            } else if (salarioBase == salarioPretendido) {
                System.out.println("Ligar para o Candidato com Contra Proposta!");
            } else {
                System.out.println("Aguardando o resultado dos demais candidatos!");
            }
        } catch(Exception e) {
            System.out.println("Erro ao analisar candidato " + e.getMessage());
        }

    }
}
