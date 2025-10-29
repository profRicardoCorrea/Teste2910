package lacos;

import java.util.Arrays;

public class MetodosEstaticos {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS DE MÉTODOS ESTÁTICOS ===\n");
        
        // Exemplo 1: Método estático básico
        System.out.println("1. Método estático básico:");
        saudacao();
        System.out.println();
        
        // Exemplo 2: Método estático com parâmetros
        System.out.println("2. Método estático com parâmetros:");
        saudacaoPersonalizada("João");
        saudacaoPersonalizada("Maria");
        System.out.println();
        
        // Exemplo 3: Método estático que retorna valor
        System.out.println("3. Método estático que retorna valor:");
        int resultado = somar(10, 20);
        System.out.println("Soma de 10 + 20 = " + resultado);
        
        double media = calcularMedia(8.5, 9.0, 7.5);
        System.out.println("Média das notas: " + String.format("%.2f", media));
        System.out.println();
        
        // Exemplo 4: Método estático com múltiplos parâmetros
        System.out.println("4. Método estático com múltiplos parâmetros:");
        int maximo = encontrarMaximo(15, 23, 7, 42, 18, 9, 31);
        System.out.println("Máximo entre os números: " + maximo);
        
        String maiorPalavra = encontrarMaiorString("Java", "Python", "C++", "JavaScript");
        System.out.println("Maior palavra: " + maiorPalavra);
        System.out.println();
        
        // Exemplo 5: Método estático com arrays
        System.out.println("5. Método estático com arrays:");
        int[] numeros = {5, 12, 8, 19, 3, 15};
        System.out.println("Array original: " + Arrays.toString(numeros));
        
        int soma = somarArray(numeros);
        System.out.println("Soma do array: " + soma);
        
        double mediaArray = calcularMediaArray(numeros);
        System.out.println("Média do array: " + String.format("%.2f", mediaArray));
        
        int[] ordenado = ordenarArray(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(ordenado));
        System.out.println();
        
        // Exemplo 6: Método estático com sobrecarga
        System.out.println("6. Método estático com sobrecarga:");
        System.out.println("Soma de 2 inteiros: " + somar(5, 3));
        System.out.println("Soma de 3 inteiros: " + somar(5, 3, 2));
        System.out.println("Soma de 2 doubles: " + somar(5.5, 3.2));
        System.out.println();
        
        // Exemplo 7: Método estático com validação
        System.out.println("7. Método estático com validação:");
        System.out.println("25 é primo? " + ehPrimo(25));
        System.out.println("17 é primo? " + ehPrimo(17));
        System.out.println("100 é primo? " + ehPrimo(100));
        System.out.println();
        
        // Exemplo 8: Método estático com String
        System.out.println("8. Método estático com String:");
        String texto = "Java Programming";
        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + inverterString(texto));
        System.out.println("Número de vogais: " + contarVogais(texto));
        System.out.println("É palíndromo? " + ehPalindromo("ana"));
        System.out.println("É palíndromo? " + ehPalindromo("java"));
        System.out.println();
        
        // Exemplo 9: Método estático matemático
        System.out.println("9. Método estático matemático:");
        System.out.println("Fatorial de 5: " + fatorial(5));
        System.out.println("Fatorial de 0: " + fatorial(0));
        System.out.println("Potência 2^8: " + potencia(2, 8));
        System.out.println("Raiz quadrada de 16: " + raizQuadrada(16));
        System.out.println();
        
        // Exemplo 10: Método estático utilitário
        System.out.println("10. Método estático utilitário:");
        System.out.println("Formatação de moeda: " + formatarMoeda(1234.56));
        System.out.println("Formatação de porcentagem: " + formatarPorcentagem(0.75));
        System.out.println("Formatação de data: " + formatarData(25, 12, 2024));
        System.out.println();
        
        // Exemplo 11: Método estático com recursão
        System.out.println("11. Método estático com recursão:");
        System.out.println("Fibonacci(8): " + fibonacci(8));
        System.out.println("Soma recursiva até 5: " + somarRecursivo(5));
        System.out.println();
        
        // Exemplo 12: Método estático com enum
        System.out.println("12. Método estático com enum:");
        System.out.println("Dia da semana: " + obterDiaSemana(1));
        System.out.println("Estação do ano: " + obterEstacao(3));
        System.out.println();
        
        // Exemplo 13: Método estático com validação de entrada
        System.out.println("13. Método estático com validação de entrada:");
        System.out.println("Idade válida (25): " + validarIdade(25));
        System.out.println("Idade válida (-5): " + validarIdade(-5));
        System.out.println("Idade válida (150): " + validarIdade(150));
        System.out.println();
        
        // Exemplo 14: Método estático com conversão
        System.out.println("14. Método estático com conversão:");
        System.out.println("Celsius para Fahrenheit (25°C): " + celsiusParaFahrenheit(25) + "°F");
        System.out.println("Fahrenheit para Celsius (77°F): " + fahrenheitParaCelsius(77) + "°C");
        System.out.println("Metros para pés (10m): " + metrosParaPes(10) + " pés");
        System.out.println();
        
        // Exemplo 15: Método estático com geração de dados
        System.out.println("15. Método estático com geração de dados:");
        int[] numerosAleatorios = gerarNumerosAleatorios(5, 1, 100);
        System.out.println("Números aleatórios: " + Arrays.toString(numerosAleatorios));
        
        String senha = gerarSenha(8);
        System.out.println("Senha gerada: " + senha);
        System.out.println();
        
        // Exemplo 16: Método estático com análise de texto
        System.out.println("16. Método estático com análise de texto:");
        String frase = "Java é uma linguagem de programação orientada a objetos";
        System.out.println("Frase: " + frase);
        System.out.println("Número de palavras: " + contarPalavras(frase));
        System.out.println("Palavra mais longa: " + palavraMaisLonga(frase));
        System.out.println();
        
        // Exemplo 17: Método estático com cálculos estatísticos
        System.out.println("17. Método estático com cálculos estatísticos:");
        double[] dados = {12.5, 18.3, 15.7, 22.1, 19.8, 16.4, 21.2};
        System.out.println("Dados: " + Arrays.toString(dados));
        System.out.println("Média: " + String.format("%.2f", calcularMediaArray(dados)));
        System.out.println("Desvio padrão: " + String.format("%.2f", calcularDesvioPadrao(dados)));
        System.out.println();
        
        // Exemplo 18: Método estático com formatação
        System.out.println("18. Método estático com formatação:");
        System.out.println("Número formatado: " + formatarNumero(1234567.89));
        System.out.println("Telefone formatado: " + formatarTelefone("11987654321"));
        System.out.println("CPF formatado: " + formatarCPF("12345678901"));
        System.out.println();
        
        // Exemplo 19: Método estático com verificação de tipos
        System.out.println("19. Método estático com verificação de tipos:");
        System.out.println("'123' é número? " + ehNumero("123"));
        System.out.println("'abc' é número? " + ehNumero("abc"));
        System.out.println("'teste@email.com' é email? " + ehEmail("teste@email.com"));
        System.out.println("'email_invalido' é email? " + ehEmail("email_invalido"));
        System.out.println();
        
        // Exemplo 20: Método estático com operações de coleção
        System.out.println("20. Método estático com operações de coleção:");
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva", "Maçã", "Banana"};
        System.out.println("Array original: " + Arrays.toString(frutas));
        
        String[] frutasUnicas = removerDuplicatas(frutas);
        System.out.println("Array sem duplicatas: " + Arrays.toString(frutasUnicas));
        
        String[] frutasOrdenadas = ordenarStrings(frutas);
        System.out.println("Array ordenado: " + Arrays.toString(frutasOrdenadas));
        
        System.out.println("\n=== FIM DOS EXEMPLOS ===");
    }
    
    // Método estático básico sem parâmetros e sem retorno
    public static void saudacao() {
        System.out.println("Olá! Bem-vindo ao programa de métodos estáticos!");
    }
    
    // Método estático com parâmetro String
    public static void saudacaoPersonalizada(String nome) {
        System.out.println("Olá " + nome + "! Seja bem-vindo!");
    }
    
    // Método estático que retorna int
    public static int somar(int a, int b) {
        return a + b;
    }
    
    // Sobrecarga do método somar com 3 parâmetros
    public static int somar(int a, int b, int c) {
        return a + b + c;
    }
    
    // Sobrecarga do método somar com doubles
    public static double somar(double a, double b) {
        return a + b;
    }
    
    // Método estático que calcula média
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }
    
    // Método estático com varargs para encontrar máximo
    public static int encontrarMaximo(int... numeros) {
        if (numeros.length == 0) return 0;
        
        int max = numeros[0];
        for (int num : numeros) {
            if (num > max) max = num;
        }
        return max;
    }
    
    // Método estático com varargs para encontrar maior string
    public static String encontrarMaiorString(String... strings) {
        if (strings.length == 0) return "";
        
        String maior = strings[0];
        for (String str : strings) {
            if (str.length() > maior.length()) {
                maior = str;
            }
        }
        return maior;
    }
    
    // Método estático que soma array
    public static int somarArray(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return soma;
    }
    
    // Método estático que calcula média de array
    public static double calcularMediaArray(int[] array) {
        if (array.length == 0) return 0.0;
        return (double) somarArray(array) / array.length;
    }
    
    // Sobrecarga para array de doubles
    public static double calcularMediaArray(double[] array) {
        if (array.length == 0) return 0.0;
        
        double soma = 0.0;
        for (double num : array) {
            soma += num;
        }
        return soma / array.length;
    }
    
    // Método estático que ordena array
    public static int[] ordenarArray(int[] array) {
        int[] copia = Arrays.copyOf(array, array.length);
        Arrays.sort(copia);
        return copia;
    }
    
    // Método estático que verifica se número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        if (numero <= 3) return true;
        if (numero % 2 == 0 || numero % 3 == 0) return false;
        
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) return false;
        }
        return true;
    }
    
    // Método estático que inverte string
    public static String inverterString(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
    
    // Método estático que conta vogais
    public static int contarVogais(String texto) {
        int vogais = 0;
        String vogaisStr = "aeiouAEIOU";
        
        for (char c : texto.toCharArray()) {
            if (vogaisStr.indexOf(c) != -1) {
                vogais++;
            }
        }
        return vogais;
    }
    
    // Método estático que verifica palíndromo
    public static boolean ehPalindromo(String texto) {
        String limpo = texto.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return limpo.equals(inverterString(limpo));
    }
    
    // Método estático que calcula fatorial
    public static long fatorial(int n) {
        if (n < 0) return -1;
        if (n <= 1) return 1;
        
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    // Método estático que calcula potência
    public static double potencia(double base, int expoente) {
        if (expoente == 0) return 1;
        if (expoente < 0) return 1.0 / potencia(base, -expoente);
        
        double resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    
    // Método estático que calcula raiz quadrada
    public static double raizQuadrada(double numero) {
        if (numero < 0) return Double.NaN;
        if (numero == 0) return 0;
        
        double x = numero;
        double y = (x + numero / x) / 2;
        
        while (Math.abs(x - y) > 0.000001) {
            x = y;
            y = (x + numero / x) / 2;
        }
        return x;
    }
    
    // Método estático que formata moeda
    public static String formatarMoeda(double valor) {
        return String.format("R$ %.2f", valor);
    }
    
    // Método estático que formata porcentagem
    public static String formatarPorcentagem(double valor) {
        return String.format("%.1f%%", valor * 100);
    }
    
    // Método estático que formata data
    public static String formatarData(int dia, int mes, int ano) {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
    
    // Método estático recursivo para Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    // Método estático recursivo para soma
    public static int somarRecursivo(int n) {
        if (n <= 0) return 0;
        return n + somarRecursivo(n - 1);
    }
    
    // Método estático que retorna dia da semana
    public static String obterDiaSemana(int dia) {
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        if (dia >= 1 && dia <= 7) {
            return dias[dia - 1];
        }
        return "Dia inválido";
    }
    
    // Método estático que retorna estação
    public static String obterEstacao(int mes) {
        if (mes >= 3 && mes <= 5) return "Primavera";
        if (mes >= 6 && mes <= 8) return "Verão";
        if (mes >= 9 && mes <= 11) return "Outono";
        if (mes == 12 || mes == 1 || mes == 2) return "Inverno";
        return "Mês inválido";
    }
    
    // Método estático que valida idade
    public static boolean validarIdade(int idade) {
        return idade >= 0 && idade <= 120;
    }
    
    // Método estático que converte Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    // Método estático que converte Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    // Método estático que converte metros para pés
    public static double metrosParaPes(double metros) {
        return metros * 3.28084;
    }
    
    // Método estático que gera números aleatórios
    public static int[] gerarNumerosAleatorios(int quantidade, int min, int max) {
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return numeros;
    }
    
    // Método estático que gera senha
    public static String gerarSenha(int tamanho) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        StringBuilder senha = new StringBuilder();
        
        for (int i = 0; i < tamanho; i++) {
            int indice = (int) (Math.random() * caracteres.length());
            senha.append(caracteres.charAt(indice));
        }
        return senha.toString();
    }
    
    // Método estático que conta palavras
    public static int contarPalavras(String texto) {
        if (texto == null || texto.trim().isEmpty()) return 0;
        return texto.trim().split("\\s+").length;
    }
    
    // Método estático que encontra palavra mais longa
    public static String palavraMaisLonga(String texto) {
        if (texto == null || texto.trim().isEmpty()) return "";
        
        String[] palavras = texto.trim().split("\\s+");
        String maisLonga = palavras[0];
        
        for (String palavra : palavras) {
            if (palavra.length() > maisLonga.length()) {
                maisLonga = palavra;
            }
        }
        return maisLonga;
    }
    
    // Método estático que calcula desvio padrão
    public static double calcularDesvioPadrao(double[] dados) {
        if (dados.length <= 1) return 0.0;
        
        double media = calcularMediaArray(dados);
        double somaQuadrados = 0.0;
        
        for (double valor : dados) {
            somaQuadrados += Math.pow(valor - media, 2);
        }
        
        return Math.sqrt(somaQuadrados / (dados.length - 1));
    }
    
    // Método estático que formata número
    public static String formatarNumero(double numero) {
        return String.format("%,.2f", numero);
    }
    
    // Método estático que formata telefone
    public static String formatarTelefone(String telefone) {
        if (telefone.length() == 11) {
            return String.format("(%s) %s-%s", 
                telefone.substring(0, 2),
                telefone.substring(2, 7),
                telefone.substring(7));
        }
        return telefone;
    }
    
    // Método estático que formata CPF
    public static String formatarCPF(String cpf) {
        if (cpf.length() == 11) {
            return String.format("%s.%s.%s-%s",
                cpf.substring(0, 3),
                cpf.substring(3, 6),
                cpf.substring(6, 9),
                cpf.substring(9));
        }
        return cpf;
    }
    
    // Método estático que verifica se string é número
    public static boolean ehNumero(String texto) {
        try {
            Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    // Método estático que verifica se string é email
    public static boolean ehEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
    
    // Método estático que remove duplicatas de array
    public static String[] removerDuplicatas(String[] array) {
        if (array.length <= 1) return array;
        
        java.util.Set<String> conjunto = new java.util.LinkedHashSet<>();
        for (String item : array) {
            conjunto.add(item);
        }
        
        return conjunto.toArray(new String[0]);
    }
    
    // Método estático que ordena array de strings
    public static String[] ordenarStrings(String[] array) {
        String[] copia = Arrays.copyOf(array, array.length);
        Arrays.sort(copia);
        return copia;
    }
}

