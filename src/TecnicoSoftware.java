public class TecnicoSoftware extends Tecnico implements Atendimento {

    @Override
    public void realizarAtendimento() {
        System.out.println("Atendimento SOFTWARE Técnico:  " + getNome() + " .");
        System.out.println("Ação: Acessando terminal remoto e aplicando patch de segurança.");
    }
}