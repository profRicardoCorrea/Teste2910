package classes;

/**
 * Classe Professor que herda da classe Pessoa
 * Adiciona funcionalidades específicas de professor
 */
public class Professor extends Pessoa {
    // Atributos específicos do professor
    private String disciplina;
    private String nivelEscolaridade;
    protected int anosExperiencia;
    public String instituicao;
    private int cargaHoraria;
    protected boolean temMestrado;
    private double salarioHora;
    
    // Construtor padrão
    public Professor() {
        super(); // Chama o construtor da classe pai
        this.disciplina = "Não definida";
        this.nivelEscolaridade = "Graduação";
        this.anosExperiencia = 0;
        this.instituicao = "Instituição não definida";
        this.cargaHoraria = 40;
        this.temMestrado = false;
        this.salarioHora = 50.0;
    }
    
    // Sobrecarga de construtor - nome, idade e disciplina
    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade); // Chama o construtor da classe pai
        this.disciplina = disciplina;
        this.nivelEscolaridade = "Graduação";
        this.anosExperiencia = 0;
        this.instituicao = "Instituição não definida";
        this.cargaHoraria = 40;
        this.temMestrado = false;
        this.salarioHora = 50.0;
    }
    
    // Sobrecarga de construtor - nome, idade, CPF e disciplina
    public Professor(String nome, int idade, String cpf, String disciplina) {
        super(nome, idade, cpf); // Chama o construtor da classe pai
        this.disciplina = disciplina;
        this.nivelEscolaridade = "Graduação";
        this.anosExperiencia = 0;
        this.instituicao = "Instituição não definida";
        this.cargaHoraria = 40;
        this.temMestrado = false;
        this.salarioHora = 50.0;
    }
    
    // Sobrecarga de construtor - todos os parâmetros
    public Professor(String nome, int idade, String cpf, String endereco, String telefone, String email, String disciplina, String nivelEscolaridade, String instituicao, int cargaHoraria) {
        super(nome, idade, cpf, endereco, telefone, email); // Chama o construtor da classe pai
        this.disciplina = disciplina;
        this.nivelEscolaridade = nivelEscolaridade;
        this.anosExperiencia = 0;
        this.instituicao = instituicao;
        this.cargaHoraria = cargaHoraria;
        this.temMestrado = false;
        this.salarioHora = 50.0;
    }
    
    // Método específico do professor
    public void darAula() {
        if (ativo) {
            System.out.println(getNome() + " está dando aula de " + disciplina + " na " + instituicao);
        } else {
            System.out.println("Professor não está ativo!");
        }
    }
    
    // Sobrecarga do método darAula
    public void darAula(String tema) {
        if (ativo) {
            System.out.println(getNome() + " está dando aula de " + disciplina + " sobre " + tema + " na " + instituicao);
        } else {
            System.out.println("Professor não está ativo!");
        }
    }
    
    public void corrigirProvas() {
        System.out.println(getNome() + " está corrigindo provas de " + disciplina);
    }
    
    // Sobrecarga do método corrigirProvas
    public void corrigirProvas(int quantidadeProvas) {
        System.out.println(getNome() + " está corrigindo " + quantidadeProvas + " provas de " + disciplina);
    }
    
    public void calcularSalario() {
        double salarioMensal = cargaHoraria * salarioHora * 4; // 4 semanas por mês
        System.out.println("Salário mensal: R$ " + salarioMensal);
    }
    
    // Sobrecarga do método calcularSalario
    public void calcularSalario(double bonus) {
        double salarioMensal = (cargaHoraria * salarioHora * 4) + bonus;
        System.out.println("Salário mensal com bônus: R$ " + salarioMensal);
    }
    
    public void fazerMestrado() {
        if (!temMestrado) {
            temMestrado = true;
            nivelEscolaridade = "Mestrado";
            salarioHora += 20.0; // Aumento por ter mestrado
            System.out.println(getNome() + " concluiu o mestrado! Salário por hora aumentado!");
        } else {
            System.out.println(getNome() + " já possui mestrado!");
        }
    }
    
    public void fazerDoutorado() {
        if (temMestrado) {
            nivelEscolaridade = "Doutorado";
            salarioHora += 30.0; // Aumento adicional por ter doutorado
            System.out.println(getNome() + " concluiu o doutorado! Salário por hora aumentado!");
        } else {
            System.out.println("É necessário ter mestrado para fazer doutorado!");
        }
    }
    
    public void aumentarExperiencia() {
        anosExperiencia++;
        System.out.println(getNome() + " completou mais um ano de experiência! Total: " + anosExperiencia + " anos");
    }
    
    // Sobrecarga do método aumentarExperiencia
    public void aumentarExperiencia(int anos) {
        anosExperiencia += anos;
        System.out.println(getNome() + " ganhou " + anos + " anos de experiência! Total: " + anosExperiencia + " anos");
    }
    
    public void trocarDisciplina(String novaDisciplina) {
        this.disciplina = novaDisciplina;
        System.out.println(getNome() + " agora leciona " + novaDisciplina);
    }
    
    // Sobrecarga do método trocarDisciplina
    public void trocarDisciplina(String novaDisciplina, String novaInstituicao) {
        this.disciplina = novaDisciplina;
        this.instituicao = novaInstituicao;
        System.out.println(getNome() + " agora leciona " + novaDisciplina + " na " + novaInstituicao);
    }
    
    // Sobrecarga do método apresentar da classe pai
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Sou professor de " + disciplina + " na " + instituicao + " com " + anosExperiencia + " anos de experiência");
    }
    
    // Sobrecarga do método apresentar
    public void apresentar(boolean incluirFormacao) {
        apresentar();
        if (incluirFormacao) {
            System.out.println("Minha formação é " + nivelEscolaridade + " e tenho " + cargaHoraria + " horas semanais");
        }
    }
    
    // Métodos get e set para todos os atributos
    public String getDisciplina() {
        return disciplina;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public String getNivelEscolaridade() {
        return nivelEscolaridade;
    }
    
    public void setNivelEscolaridade(String nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }
    
    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    public String getInstituicao() {
        return instituicao;
    }
    
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public boolean isTemMestrado() {
        return temMestrado;
    }
    
    public void setTemMestrado(boolean temMestrado) {
        this.temMestrado = temMestrado;
    }
    
    public double getSalarioHora() {
        return salarioHora;
    }
    
    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
    
    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", email='" + email + '\'' +
                ", ativo=" + ativo +
                ", disciplina='" + disciplina + '\'' +
                ", nivelEscolaridade='" + nivelEscolaridade + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                ", instituicao='" + instituicao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", temMestrado=" + temMestrado +
                ", salarioHora=" + salarioHora +
                '}';
    }
}
