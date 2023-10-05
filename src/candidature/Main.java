package candidature;

public class Main {
    public static void main(String[] args) {
        /* ProcessoSeletivo.analisarCandidato(2200.00);
        ProcessoSeletivo.analisarCandidato(1700);
        ProcessoSeletivo.analisarCandidato(2000);
        */
        //ProcessoSeletivo.selecaoCandidatos();
        ProcessoSeletivo.imprimirSelecionados();
        String [] candidatos = {"GABRIEL", "FELIPE", "MARCELO", "MARIA", "LORENA"};
        for(String candidato : candidatos) {
            ProcessoSeletivo.contato(candidato);
        }
    }
}