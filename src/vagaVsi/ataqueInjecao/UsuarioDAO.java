package vagaVsi.ataqueInjecao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
	
	private Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }


//    Usar consultas parametrizadas é uma das formas mais eficazes de evitar
//    a injeção de SQL. Em vez de concatenar strings para formar uma consulta SQL, 
//    você utiliza parâmetros que são tratados de forma segura pelo banco de dados.
    
    public Usuario getUserById(int userId) {
        String sql = "SELECT * FROM users WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, userId); // Define o parâmetro
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Usuario(resultSet.getLong("id"), resultSet.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
