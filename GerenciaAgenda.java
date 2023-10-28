package principal;

import java.util.Scanner;
import java.util.ArrayList;

public class GerenciaAgenda {
    private ArrayList<Locacao> locacoes;

    public GerenciaAgenda(ArrayList<Locacao> locacoes) {
        this.lerS = new Scanner(System.in);
        this.lerN = new Scanner(System.in);
        this.locacoes = locacoes;
    }

    public void Agendar() {
        System.out.println("Agendamento efetuado com sucesso.");

    }

    public void Cancelar() {
        System.out.println("Cancelado com sucesso!");

    }

    public void Alterar() {
        System.out.println("Alterado com sucesso!");

    }

    public void RelatorioVeiculosAgendados() {
        System.out.println("Relatório impresso com sucesso!");
    }

    public void RelatorioVeiculosAlocadosEmDia() {
        System.out.println("Relatório impresso com sucesso!");
    }

    public void RelatorioVeiculosAlocadosEmAtraso() {
        System.out.println("Relatório impresso com sucesso!");
    }

}
