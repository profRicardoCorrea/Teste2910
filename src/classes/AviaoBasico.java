package classes;

public class AviaoBasico {
	  // Atributos específicos do avião
    private int numeroMotores;
    private double altitudeMaxima;
    protected int capacidadePassageiros;
    public boolean pilotoAutomatico;
    private String tipoAeronave;
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
   
}
