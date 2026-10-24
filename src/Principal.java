import java.util.Scanner;
import java.util.InputMismatchException;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            boolean sucesso = false;
            while (!sucesso) {
                try {
                    Chamado c = new Chamado();
                    System.out.print("Digite o número do chamado " + i + ": ");
                    int num = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite a descrição: ");
                    String desc = scanner.nextLine();

                    c.setNumero(num);
                    c.setDescricao(desc);
                    sucesso = true;
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Digite apenas números inteiros.\n");
                    scanner.nextLine();
                }
            }
        }
        System.out.println("\nTotal de chamados registrados: " + Chamado.getTotalChamados());
        scanner.close();
    }
}