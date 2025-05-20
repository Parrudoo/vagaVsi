package vagaVsi.sobrescritaEquals;

public class InstanciaPessoa {
	
	public static void main(String[] args) {
					
		
		Pessoa pessoa = new Pessoa("Diego", 28);
		Pessoa pessoa2 = new Pessoa("Diego", 28);				

		
		if (pessoa.equals(pessoa2)) {	
//			utilizando o equals padrão o resultado seria VERDADEIRO
			System.out.println("Verdadeiro");
		}else {
//			utilizando o equals com sobrescrita caso eu queira saber se só o nome da Pessoa são iguais o resultado seria 
			System.out.println("Falso");
		}
		
	}
	
}
