package classes;

/**
 * Classe abstrata que representa um veículo genérico
 * Contém método abstrato que deve ser implementado pelas subclasses
 */
public abstract class Veiculo {
    // Atributos com diferentes modificadores de acesso
    protected String marca;
    protected String modelo;
    protected int ano;
    private String cor;
    public boolean ligado;
    
    // Construtor padrão
    public Veiculo() {
        this.marca = "Desconhecida";
        this.modelo = "Desconhecido";
        this.ano = 2024;
        this.cor = "Branco";
        this.ligado = false;
    }
    
    // Sobrecarga de construtor - apenas marca e modelo
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = 2024;
        this.cor = "Branco";
        this.ligado = false;
    }
    
    // Sobrecarga de construtor - todos os parâmetros
    public Veiculo(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.ligado = false;
    }
    
    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void acelerar();
    
    // Método concreto com sobrecarga
    public void ligar() {
        this.ligado = true;
        System.out.println("Veículo ligado!");
    }
    
    // Sobrecarga do método ligar
    public void ligar(boolean forcarLigacao) {
        if (forcarLigacao) {
            this.ligado = true;
            System.out.println("Veículo ligado forçadamente!");
        } else {
            ligar();
        }
    }
    
    public void desligar() {
        this.ligado = false;
        System.out.println("Veículo desligado!");
    }
    
    // Métodos get e set para todos os atributos
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public boolean isLigado() {
        return ligado;
    }
    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", ligado=" + ligado +
                '}';
    }
}
