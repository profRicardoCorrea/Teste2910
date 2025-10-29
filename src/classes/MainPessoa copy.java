package classes;

public class MainPessoa {
	public static void main(String[] args) {
		PessoaL p1=new PessoaL();
		System.out.println("NOME:"+p1.getNome());
		System.out.println("CPF:"+p1.getCpf());
		System.out.println("Email:"+p1.getEmail());
		System.out.println("Endereco:"+p1.getEndereco());
		System.out.println("Idade:"+p1.getIdade());
		System.out.println("Telefone:"+p1.getTelefone());
		 
		
		PessoaL p3=new PessoaL("CILCANO", 40);
		System.out.println("NOME:"+p3.getNome());
		System.out.println("CPF:"+p3.getCpf());
		System.out.println("Email:"+p3.getEmail());
		System.out.println("Endereco:"+p3.getEndereco());
		System.out.println("Idade:"+p3.getIdade());
		System.out.println("Telefone:"+p3.getTelefone());
		
		
		PessoaL p4=new PessoaL("BELTRANO", 21,"435435435");
		System.out.println("NOME:"+p4.getNome());
		System.out.println("CPF:"+p4.getCpf());
		System.out.println("Email:"+p4.getEmail());
		System.out.println("Endereco:"+p4.getEndereco());
		System.out.println("Idade:"+p4.getIdade());
		System.out.println("Telefone:"+p4.getTelefone());
		
		PessoaL p2=new PessoaL("",0,"","","","");
		System.out.println("NOME:"+p2.getNome());
		System.out.println("CPF:"+p2.getCpf());
		System.out.println("Email:"+p2.getEmail());
		System.out.println("Endereco:"+p2.getEndereco());
		System.out.println("Idade:"+p2.getIdade());
		System.out.println("Telefone:"+p2.getTelefone());
		
		/*Funcionario f1=new Funcionario("Fulano3", 23, "234234324", "END","234234"
				 ,"email@","GERENTE",4455.45,"GERENCIA","GE23342423");
		System.out.println(f1.getNome());		
		
		
		 PessoaL p3=new Funcionario("Fulano2", 23, "234234324", "END","234234"
				 ,"email@","GERENTE",4455.45,"GERENCIA","GE23342423");
		System.out.println(f1.getNome());; 
		PessoaL p3=null;
		p3=f1;
		System.out.println(p3.getNome());;*/
		
	 
	}

}
