package vagaVsi.ataqueInjecao;

public class Usuario {

	private Long id;
	private String nome;
		

	public Usuario(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
