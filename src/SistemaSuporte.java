public class SistemaSuporte {

    public static void main(String[] args) {
        String nomeSistema = "IT Solutions ";
        String versao = "1.0.0";
        String nomeTecnico = "Leandro Andrade";
        int quantidadeChamados = 3;
        boolean sistemaAtivo = true;

        System.out.println("Nome do Sistema: " + nomeSistema);
        System.out.println("Versão:          " + versao);
        System.out.println("Técnico Responsável: " + nomeTecnico);
        System.out.println("Chamados Abertos:   " + quantidadeChamados);
        System.out.println("Status do Sistema:   " + (sistemaAtivo ? "Em OPERAÇÃO" : "EM MANUTENÇÃO"));

        if (quantidadeChamados > 0) {
            System.out.println("Existem chamados aguardando atendimento.");
        } else {
            System.out.println("Nenhum chamado pendente.");
        }
    }
}
