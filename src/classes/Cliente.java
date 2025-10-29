package classes;

public class Cliente {
	
	private String nome;
	public String dataNasci;
	protected String genero;
	private String CPF;
	private String Email;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataNasci() {
		return dataNasci;
	}
	public void setDataNasci(String dataNasci) {
		this.dataNasci = dataNasci;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = "C"+cPF;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	

}
