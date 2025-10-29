package classes;

/**
 * Classe Carro que herda da classe abstrata Veiculo
 * Implementa o método abstrato acelerar e adiciona funcionalidades específicas
 */
public class Carro extends Veiculo {
    // Atributos específicos do carro
    private int numeroPortas;
    private String tipoCombustivel;
    protected double velocidadeAtual;
    public boolean arCondicionado;
    
    // Construtor padrão
    public Carro() {
        super(); // Chama o construtor da classe pai
        this.numeroPortas = 4;
        this.tipoCombustivel = "Gasolina";
        this.velocidadeAtual = 0.0;
        this.arCondicionado = false;
    }
    
    // Sobrecarga de construtor - marca, modelo e número de portas
    public Carro(String marca, String modelo, int numeroPortas) {
        super(marca, modelo); // Chama o construtor da classe pai
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = "Gasolina";
        this.velocidadeAtual = 0.0;
        this.arCondicionado = false;
    }
    
    // Sobrecarga de construtor - todos os parâmetros
    public Carro(String marca, String modelo, int ano, String cor, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano, cor); // Chama o construtor da classe pai
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.velocidadeAtual = 0.0;
        this.arCondicionado = false;
    }
    
    // Implementação do método abstrato da classe pai
    @Override
    public void acelerar() {
        if (ligado) {
            velocidadeAtual += 10.0;
            System.out.println("Carro acelerando! Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Carro precisa estar ligado para acelerar!");
        }
    }
    
    // Sobrecarga do método acelerar
    public void acelerar(double incrementoVelocidade) {
        if (ligado) {
            velocidadeAtual += incrementoVelocidade;
            System.out.println("Carro acelerando! Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Carro precisa estar ligado para acelerar!");
        }
    }
    
    // Método específico do carro
    public void frear() {
        if (velocidadeAtual > 0) {
            velocidadeAtual -= 5.0;
            if (velocidadeAtual < 0) velocidadeAtual = 0;
            System.out.println("Carro freando! Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Carro já está parado!");
        }
    }
    
    // Sobrecarga do método frear
    public void frear(double decrementoVelocidade) {
        if (velocidadeAtual > 0) {
            velocidadeAtual -= decrementoVelocidade;
            if (velocidadeAtual < 0) velocidadeAtual = 0;
            System.out.println("Carro freando! Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Carro já está parado!");
        }
    }
    
    public void ligarArCondicionado() {
        if (ligado) {
            arCondicionado = true;
            System.out.println("Ar condicionado ligado!");
        } else {
            System.out.println("Carro precisa estar ligado para usar o ar condicionado!");
        }
    }
    
    public void desligarArCondicionado() {
        arCondicionado = false;
        System.out.println("Ar condicionado desligado!");
    }
    
    // Métodos get e set para todos os atributos
    public int getNumeroPortas() {
        return numeroPortas;
    }
    
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
    
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    
    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    
    public boolean isArCondicionado() {
        return arCondicionado;
    }
    
    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
    
    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + getCor() + '\'' +
                ", ligado=" + ligado +
                ", numeroPortas=" + numeroPortas +
                ", tipoCombustivel='" + tipoCombustivel + '\'' +
                ", velocidadeAtual=" + velocidadeAtual +
                ", arCondicionado=" + arCondicionado +
                '}';
    }
}
