package vagaVsi.padraoDesign;

public class EnderecoServiceAdapter implements EnderecoService {
	
	
	private FakeCorreioService correioService;

	
	public EnderecoServiceAdapter() {
		this.correioService = new FakeCorreioService();
	}
	
	@Override
	public String obterEndeceroCep(String cep) {
		
		return this.correioService.consultarCep(cep).toString();
	}

}
