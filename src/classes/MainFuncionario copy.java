package classes;

public class MainFuncionario {
	public static void main(String[] args) {
		Funcionario f1=new Funcionario();
		PessoaL p1=f1;
		System.out.println("NOME:"+p1.getNome());
		System.out.println("CPF:"+p1.getCpf());
		System.out.println("Email:"+p1.getEmail());
		System.out.println("Endereco:"+p1.getEndereco());
		System.out.println("Idade:"+p1.getIdade());
		System.out.println("Telefone:"+p1.getTelefone());
		
		System.out.println("Cargo:"+f1.getCargo());
		System.out.println("Departamento:"+f1.getDepartamento());
		System.out.println("HorasTrabalhadas:"+f1.getHorasTrabalhadas());
		System.out.println("Salario:"+f1.getSalario());
		 
	}

}
