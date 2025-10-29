package classes;

/**
 * Classe Aviao que herda da classe abstrata Veiculo
 * Implementa o método abstrato acelerar e adiciona funcionalidades específicas
 */
public class Aviao extends Veiculo {
    // Atributos específicos do avião
    private int numeroMotores;
    private double altitudeMaxima;
    protected int capacidadePassageiros;
    public boolean pilotoAutomatico;
    private String tipoAeronave;
    
    // Construtor padrão
    public Aviao() {
       // super(); // Chama o construtor da classe pai
        //this.numeroMotores = 2;
        //this.altitudeMaxima = 12000.0;
        //this.capacidadePassageiros = 150;
        //this.pilotoAutomatico = true;
        //this.tipoAeronave = "Comercial";
    }
    
    // Sobrecarga de construtor - marca, modelo e número de motores
    public Aviao(String marca, String modelo, int numeroMotores) {
        super(marca, modelo); // Chama o construtor da classe pai
        this.numeroMotores = numeroMotores;
        this.altitudeMaxima = 12000.0;
        this.capacidadePassageiros = 150;
        this.pilotoAutomatico = true;
        this.tipoAeronave = "Comercial";
    }
    
    // Sobrecarga de construtor - todos os parâmetros
    public Aviao(String marca, String modelo, int ano, String cor, int numeroMotores, double altitudeMaxima, int capacidadePassageiros, String tipoAeronave) {
        super(marca, modelo, ano, cor); // Chama o construtor da classe pai
        this.numeroMotores = numeroMotores;
        this.altitudeMaxima = altitudeMaxima;
        this.capacidadePassageiros = capacidadePassageiros;
        this.pilotoAutomatico = true;
        this.tipoAeronave = tipoAeronave;
    }
    
    // Implementação do método abstrato da classe pai
    @Override
    public void acelerar() {
        if (ligado) {
            System.out.println("Aumentando a potência dos motores! Avião acelerando!");
        } else {
            System.out.println("Avião precisa estar ligado para acelerar!");
        }
    }
    
    // Sobrecarga do método acelerar
    public void acelerar(double potenciaMotores) {
        if (ligado) {
            System.out.println("Aumentando a potência dos motores para " + potenciaMotores + "%! Avião acelerando!");
        } else {
            System.out.println("Avião precisa estar ligado para acelerar!");
        }
    }
    
    // Métodos específicos do avião
    public void decolar() {
        if (ligado) {
            System.out.println("Avião decolando! Altitude aumentando...");
        } else {
            System.out.println("Avião precisa estar ligado para decolar!");
        }
    }
    
    // Sobrecarga do método decolar
    public void decolar(double altitude) {
        if (ligado && altitude <= altitudeMaxima) {
            System.out.println("Avião decolando para altitude de " + altitude + " metros!");
        } else if (!ligado) {
            System.out.println("Avião precisa estar ligado para decolar!");
        } else {
            System.out.println("Altitude muito alta! Máximo: " + altitudeMaxima + " metros");
        }
    }
    
    public void aterrissar() {
        System.out.println("Avião aterrissando! Reduzindo altitude...");
    }
    
    public void ligarPilotoAutomatico() {
        if (ligado) {
            pilotoAutomatico = true;
            System.out.println("Piloto automático ligado!");
        } else {
            System.out.println("Avião precisa estar ligado para usar o piloto automático!");
        }
    }
    
    public void desligarPilotoAutomatico() {
        pilotoAutomatico = false;
        System.out.println("Piloto automático desligado!");
    }
    
    public void verificarCapacidade(int passageiros) {
        if (passageiros <= capacidadePassageiros) {
            System.out.println("Capacidade OK! " + passageiros + " passageiros a bordo.");
        } else {
            System.out.println("Capacidade excedida! Máximo: " + capacidadePassageiros + " passageiros");
        }
    }
    
    // Métodos get e set para todos os atributos
    public int getNumeroMotores() {
        return this.numeroMotores;
    }
    
    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }
    
    public double getAltitudeMaxima() {
        return altitudeMaxima;
    }
    
    public void setAltitudeMaxima(double altitudeMaxima) {
        this.altitudeMaxima = altitudeMaxima;
    }
    
    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
    
    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
    
    public boolean isPilotoAutomatico() {
        return pilotoAutomatico;
    }
    
    public void setPilotoAutomatico(boolean pilotoAutomatico) {
        this.pilotoAutomatico = pilotoAutomatico;
    }
    
    public String getTipoAeronave() {
        return tipoAeronave;
    }
    
    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }
    
    @Override
    public String toString() {
        return "Aviao{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + getCor() + '\'' +
                ", ligado=" + ligado +
                ", numeroMotores=" + numeroMotores +
                ", altitudeMaxima=" + altitudeMaxima +
                ", capacidadePassageiros=" + capacidadePassageiros +
                ", pilotoAutomatico=" + pilotoAutomatico +
                ", tipoAeronave='" + tipoAeronave + '\'' +
                '}';
    }
}
