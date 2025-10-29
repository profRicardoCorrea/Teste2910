public class Rua {
    private String nome;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;

    public Rua(String nome, String cep, String logradouro, String bairro, String cidade, String estado) {
        this.nome = nome;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
