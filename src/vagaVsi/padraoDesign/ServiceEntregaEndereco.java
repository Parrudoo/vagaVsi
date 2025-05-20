package vagaVsi.padraoDesign;

public class ServiceEntregaEndereco {
	
	private EnderecoService enderecoService;

	public ServiceEntregaEndereco(EnderecoService enderecoService) {
		this.enderecoService = enderecoService;
	}
	
	public void printAddress(String cep) {
        String endereco = enderecoService.obterEndeceroCep(cep);
        System.out.println("Endereço: " + endereco);
    }
}
