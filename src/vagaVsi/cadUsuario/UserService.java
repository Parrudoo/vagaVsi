package vagaVsi.cadUsuario;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class UserService {

	
	 private Map<String, String> usuario = new HashMap<>();

//	    faz a validação de email
	 	public boolean validaEmail(String email) {
	        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,6}$";
	        return Pattern.matches(emailRegex, email);
	    }
	    
//	    faz a criação de um usuario na memoria do programa
	    public boolean criarUsuario(String email) {
	        if (validaEmail(email) && !usuario.containsKey(email)) {
	        	usuario.put(email, "UserData");
	            return true;
	        }
	        return false;
	    }
	    
//	    faz a exclusão de um usuario da memoria do programa
	    public boolean deletarUsuario(String email) {
	        return usuario.remove(email) != null;
	    }
	
}
