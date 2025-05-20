package vagaVsi.anagrama;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

public class AnagramaTest {


	
	/**
     * Testa a geração de anagramas para uma string com três letras.
     * Este teste verifica se o número de anagramas gerados para a entrada "abc" é igual a 6.
     */	
	@Test
    public void testAnagramaDeTresLetras() {
        List<String> result = Anagrama.geradorDeAnagramas("abc");
        assertEquals(6, result.size());
    }

	 /**
     * Testa a geração de anagramas para uma string com uma única letra.
     * Este teste garante que não haja anagramas gerados para a entrada "a".
     */	
    @Test
    public void testAnagramaUmaUnicaLetra() {
        List<String> result = Anagrama.geradorDeAnagramas("abc"); 
        
        assertNotEquals(1, result.size());
        assertNotEquals("a", result.get(0));
    }
    
     
    /**
     * Testa a geração de anagramas com uma entrada vazia.
     * Este teste verifica se uma IllegalArgumentException é lançada ao passar uma string vazia.
     */
    @Test
    public void testAnagramaEntradaVazia() {
    	try {
            Anagrama.geradorDeAnagramas(""); // Deve lançar exceção
            // Se não lançar exceção, o teste deve falhar
            
        } catch (IllegalArgumentException exception) {
//             Verifica se a mensagem da exceção é a esperada
        	fail("Deveria ter lançado IllegalArgumentException para entrada vazia.");
            assertEquals("A entrada não deve estar vazia e deve conter apenas letras.", exception.getMessage());
        }
    }
}
