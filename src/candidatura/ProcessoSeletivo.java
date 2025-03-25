package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
    selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        double salarioBase = 2000.0;
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos [candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou um salário de: " + salarioPretendido);
                if(salarioBase >= salarioPretendido){
                    System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                    candidatosSelecionados++;
                }
            candidatosAtual++;
        }
    }


    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato (double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRAPROPOSTA");
        }
        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
    }

}
