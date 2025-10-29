package classes;

public class Bola {
	private float diametro;
	private float peso;
	private String cor;
	
	public Bola() {
		this.cor="Transparente";
		this.diametro=0.1f;
		this.peso=0.1f;		
	}
	
	public Bola(String cor) {
		this.cor=cor;	 
		
	}
	
	public Bola(String cor, float diametro) {
		this.cor=cor;	 
		this.diametro=diametro;
	}
	
	public Bola(String cor, float peso, float diametro) {
		this.cor=cor;	 
		this.diametro=diametro;
		this.peso=peso;
	}
	
	
	public float getDiametro() {
		return diametro;
	}
	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public float getPeso(float g) {
		return peso*g;
	}
	
	public float getPeso(int g) {
		return peso*g;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	 
	
	

}
