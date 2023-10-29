package principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class GerenciaAgenda extends Locacao {
    private ArrayList<Locacao> locacoes;
    private Scanner lerN, lerS;
    private LocalDate data;
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Carro> carros = new ArrayList<>();
    ArrayList<Caminhao> caminhoes = new ArrayList<>();

    
    public GerenciaAgenda(Agenda agenda) {
    	lerN = new Scanner(System.in);
    	lerS = new Scanner(System.in);
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