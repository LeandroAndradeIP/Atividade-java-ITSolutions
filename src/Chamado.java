import java.util.InputMismatchException;
import java.util.Scanner;

public class Chamado {
    private static int totalChamados = 0;
    private int numero;
    private String descricao;

    public Chamado() {
        totalChamados++;
    }

    public static int getTotalChamados() {
        return totalChamados;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
