public class TecnicoHardware extends Tecnico implements Atendimento {

    @Override
    public void realizarAtendimento() {
        System.out.println("Atendimento HARDWARE [Técnico: " + getNome() + "]");
        System.out.println("Ação: Executando limpeza e substiyuição de memória RAM com defeito.");
    }
}