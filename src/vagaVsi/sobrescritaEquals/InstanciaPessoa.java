package vagaVsi.sobrescritaEquals;

public class InstanciaPessoa {
	
	public static void main(String[] args) {
		
		
//		a sobreescrita do metodo equals, é quando você quer uma comparação personalizada
//		de duas referencias de objetos , por padrão o metodo equals compara se duas referencia 
//		de um objeto são para o mesmo objeto
		
		
		Pessoa pessoa = new Pessoa("Diego", 28);
		Pessoa pessoa2 = new Pessoa("Diego", 28);
		
//		Equals padrão
		
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Pessoa other = (Pessoa) obj;
//			return idade == other.idade && Objects.equals(nome, other.nome);
//		}
		
		
//		Equals Sobrescrito
		
//		@Override
//		public boolean equals(Object obj) {
//		    // Compara se as referências são as mesmas
//		    return this == obj;
//		}
		
		if (pessoa.equals(pessoa2)) {			
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}
		
	}
	
}
