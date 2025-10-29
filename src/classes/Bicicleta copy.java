package classes;

/**
 * Classe Bicicleta que herda da classe abstrata Veiculo
 * Implementa o método abstrato acelerar e adiciona funcionalidades específicas
 */
public class Bicicleta extends Veiculo {
    // Atributos específicos da bicicleta
    private int numeroMarchas;
    private String tipoFreio;
    protected boolean temBagageiro;
    public String tamanhoQuadro;
    
    // Construtor padrão
    public Bicicleta() {
        super(); // Chama o construtor da classe pai
        this.numeroMarchas = 21;
        this.tipoFreio = "Freio a disco";
        this.temBagageiro = false;
        this.tamanhoQuadro = "Médio";
    }
    
    // Sobrecarga de construtor - marca, modelo e número de marchas
    public Bicicleta(String marca, String modelo, int numeroMarchas) {
        super(marca, modelo); // Chama o construtor da classe pai
        this.numeroMarchas = numeroMarchas;
        this.tipoFreio = "Freio a disco";
        this.temBagageiro = false;
        this.tamanhoQuadro = "Médio";
    }
    
    // Sobrecarga de construtor - todos os parâmetros
    public Bicicleta(String marca, String modelo, int ano, String cor, int numeroMarchas, String tipoFreio, boolean temBagageiro, String tamanhoQuadro) {
        super(marca, modelo, ano, cor); // Chama o construtor da classe pai
        this.numeroMarchas = numeroMarchas;
        this.tipoFreio = tipoFreio;
        this.temBagageiro = temBagageiro;
        this.tamanhoQuadro = tamanhoQuadro;
    }
    
    // Implementação do método abstrato da classe pai
    @Override
    public void acelerar() {
        if (ligado) {
            System.out.println("Pedalando mais rápido! Bicicleta acelerando!");
        } else {
            System.out.println("Bicicleta precisa estar em uso para acelerar!");
        }
    }
    
    // Sobrecarga do método acelerar
    public void acelerar(int marcha) {
        if (ligado && marcha <= numeroMarchas) {
            System.out.println("Pedalando na marcha " + marcha + "! Bicicleta acelerando!");
        } else if (!ligado) {
            System.out.println("Bicicleta precisa estar em uso para acelerar!");
        } else {
            System.out.println("Marcha inválida! Máximo: " + numeroMarchas);
        }
    }
    
    // Método específico da bicicleta
    public void trocarMarcha(int novaMarcha) {
        if (novaMarcha >= 1 && novaMarcha <= numeroMarchas) {
            System.out.println("Trocando para a marcha " + novaMarcha);
        } else {
            System.out.println("Marcha inválida! Escolha entre 1 e " + numeroMarchas);
        }
    }
    
    // Sobrecarga do método trocarMarcha
    public void trocarMarcha(int marchaAtual, int novaMarcha) {
        if (marchaAtual >= 1 && marchaAtual <= numeroMarchas && novaMarcha >= 1 && novaMarcha <= numeroMarchas) {
            System.out.println("Trocando da marcha " + marchaAtual + " para a marcha " + novaMarcha);
        } else {
            System.out.println("Marchas inválidas! Escolha entre 1 e " + numeroMarchas);
        }
    }
    
    public void frear() {
        System.out.println("Freando a bicicleta usando " + tipoFreio + "!");
    }
    
    public void instalarBagageiro() {
        if (!temBagageiro) {
            temBagageiro = true;
            System.out.println("Bagageiro instalado!");
        } else {
            System.out.println("Bagageiro já está instalado!");
        }
    }
    
    public void removerBagageiro() {
        if (temBagageiro) {
            temBagageiro = false;
            System.out.println("Bagageiro removido!");
        } else {
            System.out.println("Bagageiro não está instalado!");
        }
    }
    
    // Métodos get e set para todos os atributos
    public int getNumeroMarchas() {
        return numeroMarchas;
    }
    
    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }
    
    public String getTipoFreio() {
        return tipoFreio;
    }
    
    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }
    
    public boolean isTemBagageiro() {
        return temBagageiro;
    }
    
    public void setTemBagageiro(boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }
    
    public String getTamanhoQuadro() {
        return tamanhoQuadro;
    }
    
    public void setTamanhoQuadro(String tamanhoQuadro) {
        this.tamanhoQuadro = tamanhoQuadro;
    }
    
    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + getCor() + '\'' +
                ", ligado=" + ligado +
                ", numeroMarchas=" + numeroMarchas +
                ", tipoFreio='" + tipoFreio + '\'' +
                ", temBagageiro=" + temBagageiro +
                ", tamanhoQuadro='" + tamanhoQuadro + '\'' +
                '}';
    }
}
