package vagaVsi.padraoDesign;
import java.util.HashMap;
import java.util.Map;

public class FakeCorreioService {
    private Map<String, Endereco> cepDatabase;

    public FakeCorreioService() {
        cepDatabase = new HashMap<>();
        initializeCepData();
    }

    private void initializeCepData() {
        cepDatabase.put("01001-000", new Endereco("Praça da Sé", "Sé", "São Paulo", "SP"));
        cepDatabase.put("20040-001", new Endereco("Rua do Ouvidor", "Centro", "Rio de Janeiro", "RJ"));
        cepDatabase.put("30130-100", new Endereco("Avenida Afonso Pena", "Centro", "Belo Horizonte", "MG"));
        cepDatabase.put("40010-000", new Endereco("Praça da Sé", "Centro", "Salvador", "BA"));
        cepDatabase.put("88015-001", new Endereco("Rua Dom Jaime Câmara", "Centro", "Florianópolis", "SC"));
    }

    public Endereco consultarCep(String cep) {
        return cepDatabase.getOrDefault(cep, null);
    }

    public static void main(String[] args) {
        FakeCorreioService service = new FakeCorreioService();
        
        String[] cepsToQuery = {"01001-000", "20040-001", "30130-100", "40010-000", "88015-001", "99999-999"};
        
        for (String cep : cepsToQuery) {
            Endereco endereco = service.consultarCep(cep);
            if (endereco != null) {
                System.out.println("Consulta para CEP " + cep + ": " + endereco);
            } else {
                System.out.println("CEP " + cep + " não encontrado.");
            }
        }
    }
}

class Endereco {
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    public Endereco(String logradouro, String bairro, String localidade, String uf) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return logradouro + ", " + bairro + ", " + localidade + " - " + uf;
    }
}