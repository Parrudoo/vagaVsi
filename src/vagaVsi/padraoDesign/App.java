package vagaVsi.padraoDesign;

public class App {
	
//	eu usei o padrão designer adapter para 
//	desaclopar o codigo de uma biblioteca de terceiro
//	ele criar uma interface comum que minha aplicação utiliza 
//	enquanto a implementação concreta  fica na biblioteca de terceiros

//	com esse padrão Adapter eu desacoplei minha
//	aplicação da biblioteca dos Correios. Isso significa que, se no futuro eu decidir usar uma 
//	biblioteca diferente para consultar endereços, você eu só vou precisar criar um novo adapter
//	que implemente a interface EnderecoService, sem precisar modificar o restante do código da sua aplicação.

	public static void main(String[] args) {
		EnderecoService enderecoService = new EnderecoServiceAdapter();
		ServiceEntregaEndereco serviceEntregaEndereco = new ServiceEntregaEndereco(enderecoService);

		serviceEntregaEndereco.printAddress("01001-000");
	}
}
