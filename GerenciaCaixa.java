package principal;

import java.util.Scanner;
import java.util.ArrayList;

public class GerenciaCaixa {
    private ArrayList<Locacao> locacoes;
    private Scanner lerS,lerN;
    
    public GerenciaCaixa(ArrayList<Locacao> locacoes) {
        this.lerS = new Scanner(System.in);
        this.lerN = new Scanner(System.in);
        this.locacoes = locacoes;
    }

    public void pagamentoLocacao() {
        System.out.println("Agendamento efetuado com sucesso.");

    }

    public void totalArrecadado() {
        System.out.println("Cancelado com sucesso!");

    }

    public void totalArrecadadoPorPeriodo() {
        System.out.println("Alterado com sucesso!");

    }

    public void totalAReceber() {
        System.out.println("Relatório impresso com sucesso!");
    }

}