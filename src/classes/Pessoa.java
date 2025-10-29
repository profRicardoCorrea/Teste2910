package classes;

/**
 * Classe Pessoa com diferentes modificadores de acesso
 * Contém sobrecarga de construtores e métodos
 */
public class Pessoa {
    // Atributos com diferentes modificadores de acesso
    private String nome;
    private int idade;
    protected String cpf;
    public String endereco;
    private String telefone;
    protected String email;
    public boolean ativo;
    
    // Construtor padrão
    public Pessoa() {
        this.nome = "Nome não informado";
        this.idade = 0;
        this.cpf = "000.000.000-00";
        this.endereco = "Endereço não informado";
        this.telefone = "(00) 00000-0000";
        this.email = "email@exemplo.com";
        this.ativo = true;
    }
    
    // Sobrecarga de construtor - apenas nome e idade
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = "000.000.000-00";
        this.endereco = "Endereço não informado";
        this.telefone = "(00) 00000-0000";
        this.email = "email@exemplo.com";
        this.ativo = true;
    }
    
    // Sobrecarga de construtor - nome, idade e CPF
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = "Endereço não informado";
        this.telefone = "(00) 00000-0000";
        this.email = "email@exemplo.com";
        this.ativo = true;
    }
    
    // Sobrecarga de construtor - todos os parâmetros
    public Pessoa(String nome, int idade, String cpf, String endereco, String telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.ativo = true;
    }
    
    // Método com sobrecarga
    public void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + " e tenho " + idade + " anos.");
    }
    
    // Sobrecarga do método apresentar
    public void apresentar(boolean incluirContato) {
        apresentar();
        if (incluirContato) {
            System.out.println("Meu telefone é: " + telefone + " e meu email é: " + email);
        }
    }
    
    // Sobrecarga do método apresentar
    public void apresentar(String saudacao) {
        System.out.println(saudacao + "! Meu nome é " + nome + " e tenho " + idade + " anos.");
    }
    
    public void fazerAniversario() {
        idade++;
        System.out.println("Feliz aniversário! Agora tenho " + idade + " anos.");
    }
    
    // Sobrecarga do método fazerAniversario
    public void fazerAniversario(int anos) {
        idade += anos;
        System.out.println("Feliz aniversário! Agora tenho " + idade + " anos.");
    }
    
    public void ativar() {
        ativo = true;
        System.out.println("Pessoa ativada!");
    }
    
    public void desativar() {
        ativo = false;
        System.out.println("Pessoa desativada!");
    }
    
    public void atualizarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
        System.out.println("Endereço atualizado para: " + novoEndereco);
    }
    
    // Sobrecarga do método atualizarEndereco
    public void atualizarEndereco(String novoEndereco, String novoTelefone) {
        this.endereco = novoEndereco;
        this.telefone = novoTelefone;
        System.out.println("Endereço atualizado para: " + novoEndereco);
        System.out.println("Telefone atualizado para: " + novoTelefone);
    }
    
    // Métodos get e set para todos os atributos
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean isAtivo() {
        return ativo;
    }
    
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
