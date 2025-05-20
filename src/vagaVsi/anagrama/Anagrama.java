package vagaVsi.anagrama;

import java.util.ArrayList;
import java.util.List;

public class Anagrama {

	public static void main(String[] args) {
		
		 // String de entrada para gerar anagramas
		String entrada = "abc";

		 // Chama o gerador de anagramas e armazena o resultado
		List<String> anaGramas = geradorDeAnagramas(entrada);
		
		 // Exibe cada anagrama gerado
		anaGramas.forEach(System.out::println);
	}


	public static List<String> geradorDeAnagramas(String entrada) {
		
		// Lista para armazenar os anagramas gerados
		List<String> resultado = new ArrayList<>();
		
		//verifica se a entrada é igual a nula ou vazia ou contem carater numerico
		if (entrada == null || entrada.isEmpty() || !entrada.matches("[a-zA-Z]+")) {
			 throw new IllegalArgumentException("A entrada não deve estar vazia e deve conter apenas letras.");
		}else {
			  // Chama o método recursivo para gerar anagramas	
			gerarAnagramas("", entrada, resultado);
		}

		return resultado;
	}


	public static void gerarAnagramas(String prefix, String entrada, List<String> resultado) {

		// Obtém o comprimento da string de entrada
		 int n = entrada.length();
		 
		 // Se a string de entrada estiver vazia, adiciona o prefixo à lista de resultados
	        if (n == 0) {
	            resultado.add(prefix);
	        } else {
	        	 // Loop para gerar anagramas recursivamente
	            for (int i = 0; i < n; i++) {
	            	// Chama recursivamente o método, adicionando o caractere atual ao prefixo
	                // e removendo-o da string de entrada
	            	gerarAnagramas(prefix + entrada.charAt(i), entrada.substring(0, i) + entrada.substring(i + 1, n), resultado);
	            }
	        }


	}


}
