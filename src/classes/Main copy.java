package classes;

public class Main {
	public static void main(String []args) {
		Aviao av1=new Aviao();
		av1.getNumeroMotores();
		System.out.println(av1.getNumeroMotores());
		av1.setNumeroMotores(1255);
		System.out.println(av1.getNumeroMotores());
	}

}
