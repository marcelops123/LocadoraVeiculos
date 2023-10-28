package principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class GerenciaAgenda extends Locacao{
    private ArrayList<Locacao> locacoes;
    private Scanner lerN,lerS;

    ArrayList<Cliente> clientes = new ArrayList<>();
	ArrayList<Carro> carros = new ArrayList<>();
	ArrayList<Caminhao> caminhoes = new ArrayList<>();
	
	Cliente gm = new Cliente(clientes);
	
	int op, opMoto, opCarro, opCami;
    
    
    
    public GerenciaAgenda(Cliente cliente, ArrayList <Veiculo> veiculos, ArrayList<Locacao> locacoes, LocalDate dataInicio, LocalDate dataPrevistaDevolucao, LocalDate dataDevolucao, double preco,
    		double multa, int status) {
        super(cliente, veiculos, dataInicio,dataPrevistaDevolucao,dataDevolucao,preco,multa,status);
    	this.lerS = new Scanner(System.in);
        this.lerN = new Scanner(System.in);
        this.locacoes = locacoes;
    }
    
    

    public void Agendar() {
    	if(clientes.)
    	
    	
    	
    	
    	
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