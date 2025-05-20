package vagaVsi.cadUsuario;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UsuarioServiceTest {

	
	private UserService userService;

	// Método executado antes de cada teste para configurar o estado inicial
    @Before
    public void setUp() {
        userService = new UserService();
    }

    // Testa a validação de e-mails
    @Test
    public void testValidaEmail() {
    	
    	 // Verifica se um e-mail válido é corretamente validado
        assertTrue(userService.validaEmail("diego@example.com"));
        // Verifica que um e-mail inválido retorna false
        assertFalse(userService.validaEmail("diegoexample.com"));
    }

    @Test
    public void testCriarUsuario() {
    	 // Verifica que um usuário pode ser criado com um e-mail válido
        assertTrue(userService.criarUsuario("diego1@example.com"));        
        // Verifica que se tentar criar o mesmo usuário novamente falha
        assertFalse(userService.criarUsuario("diego1@example.com")); // Já existe        
        // verifica que se inserir um email inválido não vai permitir a criação do usuario
        assertFalse(userService.criarUsuario("diego1example.com")); // Email inválido
    }

    @Test
    public void testDeletarUsuario() {
    	
    	 // Cria um usuário para testar a exclusão
        userService.criarUsuario("diego2@example.com");        
        // Verifica que o usuário pode ser excluído com sucesso
        assertTrue(userService.deletarUsuario("diego2@example.com"));        
        // Verifica que tentar excluir o mesmo usuário novamente falha
        assertFalse(userService.deletarUsuario("diego2@example.com")); // Já excluído
    }
}
