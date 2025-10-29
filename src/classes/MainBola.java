package classes;

public class MainBola {
	public static void main(String[] args) {
		Bola b1= new Bola();
		b1.setDiametro(2.11f);
		b1.setPeso(3);
		b1.setCor("Branca");
		
		System.out.println(b1);
		System.out.println(b1.getCor());
		System.out.println(b1.getDiametro());
		
		Bola b2=b1; //new Bola();
		/*b2.setDiametro(2.11f);
		b2.setPeso(3);
		b2.setCor("Branca");*/
		
		System.out.println(b2);
		System.out.println(b2.getCor());
		System.out.println(b2.getDiametro());
		
		if(b1==b2)
			System.out.println("IGUAL");
		else
			System.out.println("Diferente");
		
		if(b1.getCor().equals(b2.getCor()) && b1.getDiametro()==b2.getDiametro() 
				&& b1.getPeso()==b2.getPeso())  
			System.out.println("SEMELHANTE");
			
		 else
			 System.out.println("DIFERENTE");
		
		b1.setCor("ROSA");
		System.out.println(b2.getCor());
		
		Bola b3 =new Bola();
		System.out.println(b3);
		System.out.println(b3.getCor());
		System.out.println(b3.getDiametro());
		System.out.println(b3.getPeso());
		
		Bola b4 =new Bola("VERMELHA");
		System.out.println(b4);
		System.out.println(b4.getCor());
		System.out.println(b4.getDiametro());
		System.out.println(b4.getPeso());
		
		Bola b5 =new Bola("VERMELHA",345);
		System.out.println(b5);
		System.out.println(b5.getCor());
		System.out.println(b5.getDiametro());
		System.out.println(b5.getPeso());
		
		Bola b6 =new Bola("LARANJA",345,0.45f);
		b6.setCor("ROXa");
		System.out.println(b6);
		System.out.println(b6.getCor());
		System.out.println(b6.getDiametro());
		System.out.println(b6.getPeso());
		System.out.println(b6.getPeso(2.234556f));
		 
	}

}
