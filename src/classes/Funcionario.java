package classes;

/**
 * Classe Funcionario que herda da classe Pessoa
 * Adiciona funcionalidades específicas de funcionário
 */
public class Funcionario extends PessoaL {
    // Atributos específicos do funcionário
    private String cargo;
    private double salario;
    protected String departamento;
    public String matricula;
    private int horasTrabalhadas;
    protected boolean temFerias;
    
    // Construtor padrão
    public Funcionario() {
        super(); // Chama o construtor da classe pai
        this.cargo = "Funcionário";
        this.salario = 0.0;
        this.departamento = "Não definido";
        this.matricula = "000000";
        this.horasTrabalhadas = 0;
        this.temFerias = false;
    }
    
    // Sobrecarga de construtor - nome, idade e cargo
    public Funcionario(String nome, int idade, String cargo) {
        super(nome, idade); // Chama o construtor da classe pai
        this.cargo = cargo;
        this.salario = 0.0;
        this.departamento = "Não definido";
        this.matricula = "000000";
        this.horasTrabalhadas = 0;
        this.temFerias = false;
    }
    
    // Sobrecarga de construtor - nome, idade, CPF e cargo
    public Funcionario(String nome, int idade, String cpf, String cargo) {
        super(nome, idade, cpf); // Chama o construtor da classe pai
        this.cargo = cargo;
        this.salario = 0.0;
        this.departamento = "Não definido";
        this.matricula = "000000";
        this.horasTrabalhadas = 0;
        this.temFerias = false;
    }
    
    // Sobrecarga de construtor - todos os parâmetros
    public Funcionario(String nome, int idade, String cpf, String endereco, String telefone, String email, String cargo, double salario, String departamento, String matricula) {
        super(nome, idade, cpf, endereco, telefone, email); // Chama o construtor da classe pai
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
        this.matricula = matricula;
        this.horasTrabalhadas = 0;
        this.temFerias = false;
    }
    
    // Método específico do funcionário
    public void trabalhar() {
        if (ativo && !temFerias) {
            horasTrabalhadas += 8;
            System.out.println(getNome() + " trabalhou 8 horas hoje. Total: " + horasTrabalhadas + " horas");
        } else if (!ativo) {
            System.out.println("Funcionário não está ativo!");
        } else {
            System.out.println("Funcionário está de férias!");
        }
    }
    
    // Sobrecarga do método trabalhar
    public void trabalhar(int horas) {
        if (ativo && !temFerias) {
            horasTrabalhadas += horas;
            System.out.println(getNome() + " trabalhou " + horas + " horas hoje. Total: " + horasTrabalhadas + " horas");
        } else if (!ativo) {
            System.out.println("Funcionário não está ativo!");
        } else {
            System.out.println("Funcionário está de férias!");
        }
    }
    
    public void calcularSalario() {
        double salarioCalculado = salario + (horasTrabalhadas * 10.0); // R$ 10 por hora extra
        System.out.println("Salário calculado: R$ " + salarioCalculado);
    }
    
    // Sobrecarga do método calcularSalario
    public void calcularSalario(double bonus) {
        double salarioCalculado = salario + (horasTrabalhadas * 10.0) + bonus;
        System.out.println("Salário calculado com bônus: R$ " + salarioCalculado);
    }
    
    public void solicitarFerias() {
        if (ativo) {
            temFerias = true;
            System.out.println(getNome() + " solicitou férias!");
        } else {
            System.out.println("Funcionário não está ativo!");
        }
    }
    
    public void retornarFerias() {
        temFerias = false;
        System.out.println(getNome() + " retornou das férias!");
    }
    
    public void promover(String novoCargo) {
        this.cargo = novoCargo;
        System.out.println(getNome() + " foi promovido para " + novoCargo + "!");
    }
    
    // Sobrecarga do método promover
    public void promover(String novoCargo, double novoSalario) {
        this.cargo = novoCargo;
        this.salario = novoSalario;
        System.out.println(getNome() + " foi promovido para " + novoCargo + " com salário de R$ " + novoSalario + "!");
    }
    
    public void transferirDepartamento(String novoDepartamento) {
        this.departamento = novoDepartamento;
        System.out.println(getNome() + " foi transferido para o departamento " + novoDepartamento);
    }
    
    /*// Sobrecarga do método apresentar da classe pai
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Sou funcionário da empresa, trabalho como " + cargo + " no departamento " + departamento);
    }
    
    // Sobrecarga do método apresentar
    public void apresentar(boolean incluirSalario) {
        apresentar();
        if (incluirSalario) {
            System.out.println("Meu salário é R$ " + salario);
        }
    }*/
    
    // Métodos get e set para todos os atributos
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public boolean isTemFerias() {
        return temFerias;
    }
    
    public void setTemFerias(boolean temFerias) {
        this.temFerias = temFerias;
    }
    
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", email='" + email + '\'' +
                ", ativo=" + ativo +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                ", matricula='" + matricula + '\'' +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", temFerias=" + temFerias +
                '}';
    }
}
