package lacos;

import java.util.*;

public class ForEach {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS DE USO DO LOOP FOREACH ===\n");
        
        // Exemplo 1: Foreach com array de inteiros
        System.out.println("1. Foreach com array de inteiros:");
        int[] numeros = {10, 20, 30, 40, 50};
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }
        System.out.println();
        
        // Exemplo 2: Foreach com array de strings
        System.out.println("2. Foreach com array de strings:");
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva", "Morango"};
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }
        System.out.println();
        
        // Exemplo 3: Foreach com array de caracteres
        System.out.println("3. Foreach com array de caracteres:");
        char[] letras = {'A', 'B', 'C', 'D', 'E'};
        for (char letra : letras) {
            System.out.println("Letra: " + letra);
        }
        System.out.println();
        
        // Exemplo 4: Foreach com array de doubles
        System.out.println("4. Foreach com array de doubles:");
        double[] precos = {19.99, 29.99, 39.99, 49.99};
        for (double preco : precos) {
            System.out.printf("Preço: R$ %.2f%n", preco);
        }
        System.out.println();
        
        // Exemplo 5: Foreach com List de strings
        System.out.println("5. Foreach com List de strings:");
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Carla", "Diego", "Elena");
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
        System.out.println();
        
        // Exemplo 6: Foreach com ArrayList de inteiros
        System.out.println("6. Foreach com ArrayList de inteiros:");
        ArrayList<Integer> idades = new ArrayList<>();
        idades.add(25);
        idades.add(30);
        idades.add(35);
        idades.add(40);
        
        for (int idade : idades) {
            System.out.println("Idade: " + idade + " anos");
        }
        System.out.println();
        
        // Exemplo 7: Foreach com LinkedList
        System.out.println("7. Foreach com LinkedList:");
        LinkedList<String> cores = new LinkedList<>();
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Amarelo");
        
        for (String cor : cores) {
            System.out.println("Cor: " + cor);
        }
        System.out.println();
        
        // Exemplo 8: Foreach com Set
        System.out.println("8. Foreach com Set (HashSet):");
        Set<String> paises = new HashSet<>();
        paises.add("Brasil");
        paises.add("Argentina");
        paises.add("Chile");
        paises.add("Uruguai");
        
        for (String pais : paises) {
            System.out.println("País: " + pais);
        }
        System.out.println();
        
        // Exemplo 9: Foreach com TreeSet (ordenado)
        System.out.println("9. Foreach com TreeSet (ordenado):");
        TreeSet<Integer> numerosOrdenados = new TreeSet<>();
        numerosOrdenados.add(5);
        numerosOrdenados.add(2);
        numerosOrdenados.add(8);
        numerosOrdenados.add(1);
        numerosOrdenados.add(9);
        
        for (int num : numerosOrdenados) {
            System.out.println("Número ordenado: " + num);
        }
        System.out.println();
        
        // Exemplo 10: Foreach com Map (entrySet)
        System.out.println("10. Foreach com Map (entrySet):");
        Map<String, String> capitais = new HashMap<>();
        capitais.put("Brasil", "Brasília");
        capitais.put("Argentina", "Buenos Aires");
        capitais.put("Chile", "Santiago");
        capitais.put("Uruguai", "Montevidéu");
        
        for (Map.Entry<String, String> entrada : capitais.entrySet()) {
            System.out.println("País: " + entrada.getKey() + " - Capital: " + entrada.getValue());
        }
        System.out.println();
        
        // Exemplo 11: Foreach com Map (keySet)
        System.out.println("11. Foreach com Map (keySet):");
        for (String pais : capitais.keySet()) {
            System.out.println("País: " + pais);
        }
        System.out.println();
        
        // Exemplo 12: Foreach com Map (values)
        System.out.println("12. Foreach com Map (values):");
        for (String capital : capitais.values()) {
            System.out.println("Capital: " + capital);
        }
        System.out.println();
        
        // Exemplo 13: Foreach com array bidimensional
        System.out.println("13. Foreach com array bidimensional:");
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Exemplo 14: Foreach com List de objetos personalizados
        System.out.println("14. Foreach com List de objetos personalizados:");
        List<Produto> produtos = Arrays.asList(
            new Produto("Laptop", 2500.00),
            new Produto("Mouse", 50.00),
            new Produto("Teclado", 150.00),
            new Produto("Monitor", 800.00)
        );
        
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + " - Preço: R$ " + produto.getPreco());
        }
        System.out.println();
        
        // Exemplo 15: Foreach com filtro (simulado)
        System.out.println("15. Foreach com filtro (simulado):");
        List<Integer> numerosParaFiltrar = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        System.out.println("Números pares:");
        for (int num : numerosParaFiltrar) {
            if (num % 2 == 0) {
                System.out.println("Par: " + num);
            }
        }
        System.out.println();
        
        // Exemplo 16: Foreach com contador (usando índice externo)
        System.out.println("16. Foreach com contador (usando índice externo):");
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio"};
        int indice = 1;
        
        for (String mes : meses) {
            System.out.println("Mês " + indice + ": " + mes);
            indice++;
        }
        System.out.println();
        
        // Exemplo 17: Foreach com String (caracteres)
        System.out.println("17. Foreach com String (caracteres):");
        String texto = "Java";
        for (char caractere : texto.toCharArray()) {
            System.out.println("Caractere: " + caractere);
        }
        System.out.println();
        
        // Exemplo 18: Foreach com Queue
        System.out.println("18. Foreach com Queue (PriorityQueue):");
        PriorityQueue<String> tarefas = new PriorityQueue<>();
        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");
        tarefas.add("Ler documentação");
        tarefas.add("Praticar código");
        
        for (String tarefa : tarefas) {
            System.out.println("Tarefa: " + tarefa);
        }
        System.out.println();
        
        // Exemplo 19: Foreach com Vector
        System.out.println("19. Foreach com Vector:");
        Vector<Double> notas = new Vector<>();
        notas.add(8.5);
        notas.add(9.0);
        notas.add(7.5);
        notas.add(8.0);
        
        double somaNotas = 0.0;
        for (double nota : notas) {
            somaNotas += nota;
        }
        
        double media = somaNotas / notas.size();
        System.out.println("Média das notas: " + media);
        System.out.println();
        
        // Exemplo 20: Foreach com Stack
        System.out.println("20. Foreach com Stack:");
        Stack<String> historico = new Stack<>();
        historico.push("Página 1");
        historico.push("Página 2");
        historico.push("Página 3");
        historico.push("Página 4");
        
        for (String pagina : historico) {
            System.out.println("Página visitada: " + pagina);
        }
        System.out.println();
        
        // Exemplo 21: Foreach com array de objetos
        System.out.println("21. Foreach com array de objetos:");
        Pessoa[] pessoas = {
            new Pessoa("João", 25),
            new Pessoa("Maria", 30),
            new Pessoa("Pedro", 35),
            new Pessoa("Ana", 28)
        };
        
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
        }
        System.out.println();
        
        // Exemplo 22: Foreach com List de List (lista aninhada)
        System.out.println("22. Foreach com List de List (lista aninhada):");
        List<List<String>> matrizString = Arrays.asList(
            Arrays.asList("A1", "A2", "A3"),
            Arrays.asList("B1", "B2", "B3"),
            Arrays.asList("C1", "C2", "C3")
        );
        
        for (List<String> linha : matrizString) {
            for (String elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Exemplo 23: Foreach com enum
        System.out.println("23. Foreach com enum:");
        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println("Dia: " + dia.getNome() + " (" + dia.getAbreviacao() + ")");
        }
        System.out.println();
        
        // Exemplo 24: Foreach com Collections.unmodifiableList
        System.out.println("24. Foreach com Collections.unmodifiableList:");
        List<String> coresImutaveis = Collections.unmodifiableList(Arrays.asList("Vermelho", "Verde", "Azul"));
        
        for (String cor : coresImutaveis) {
            System.out.println("Cor imutável: " + cor);
        }
        System.out.println();
        
        // Exemplo 25: Foreach com Arrays.asList
        System.out.println("25. Foreach com Arrays.asList:");
        List<Integer> numerosList = Arrays.asList(1, 2, 3, 4, 5);
        
        for (int numero : numerosList) {
            System.out.println("Número da lista: " + numero);
        }
        
        System.out.println("\n=== FIM DOS EXEMPLOS ===");
    }
    
    // Classe auxiliar para exemplo
    static class Produto {
        private String nome;
        private double preco;
        
        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
        
        public String getNome() { return nome; }
        public double getPreco() { return preco; }
    }
    
    // Classe auxiliar para exemplo
    static class Pessoa {
        private String nome;
        private int idade;
        
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
        
        public String getNome() { return nome; }
        public int getIdade() { return idade; }
    }
    
    // Enum auxiliar para exemplo
    enum DiaSemana {
        SEGUNDA("Segunda-feira", "Seg"),
        TERCA("Terça-feira", "Ter"),
        QUARTA("Quarta-feira", "Qua"),
        QUINTA("Quinta-feira", "Qui"),
        SEXTA("Sexta-feira", "Sex"),
        SABADO("Sábado", "Sáb"),
        DOMINGO("Domingo", "Dom");
        
        private final String nome;
        private final String abreviacao;
        
        DiaSemana(String nome, String abreviacao) {
            this.nome = nome;
            this.abreviacao = abreviacao;
        }
        
        public String getNome() { return nome; }
        public String getAbreviacao() { return abreviacao; }
    }
}
