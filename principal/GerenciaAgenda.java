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

    public void Agendar(ArrayList<Fisica> fisicas) {
        System.out.println("Digite o nome do cliente a ser pesquisado:");
        String nomePesquisado = lerS.nextLine();
        boolean encontrado = false;

        for (Fisica cliente : fisicas) {
            if (cliente.getNome().equalsIgnoreCase(nomePesquisado)) {
                encontrado = true;
                System.out.println("--=[ Dados do Cliente Encontrado ]=--");
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Endereço: " + cliente.getEndereco());
                System.out.println("Telefone: " + cliente.getTelefone());
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Cliente não encontrado.");
        }
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