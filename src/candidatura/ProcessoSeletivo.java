package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);

    }

    static void analisarCandidato (double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATOO");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRAPROPOSTA");
        }
        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
    }

}
