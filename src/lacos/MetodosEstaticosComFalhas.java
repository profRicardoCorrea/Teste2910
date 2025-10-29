package lacos;

public class MetodosEstaticosComFalhas {
    
    public static void main(String[] args) {
        System.out.println("=== MÉTODOS ESTÁTICOS COM FALHAS - IDENTIFIQUE E CORRIJA ===\n");
        
        // FALHA 1: Método estático com retorno incorreto
        System.out.println("1. Método com retorno incorreto:");
        int resultado = somar(5, 3);
        System.out.println("Soma: " + resultado);
        System.out.println();
        
        // FALHA 2: Método estático com parâmetro não usado
        System.out.println("2. Parâmetro não usado:");
        saudacao("João");
        System.out.println();
        
        // FALHA 3: Método estático com divisão por zero
        System.out.println("3. Divisão por zero:");
        double media = calcularMedia(10, 20, 0); // FALHA: terceiro parâmetro é 0
        System.out.println("Média: " + media);
        System.out.println();
        
        // FALHA 4: Método estático com array não inicializado
        System.out.println("4. Array não inicializado:");
        int[] numeros = {1, 2, 3, 4, 5};
        int soma = somarArray(numeros);
        System.out.println("Soma: " + soma);
        System.out.println();
        
        // FALHA 5: Método estático com String nula
        System.out.println("5. String nula:");
        String texto = null;
        int vogais = contarVogais(texto);
        System.out.println("Vogais: " + vogais);
        System.out.println();
        
        // FALHA 6: Método estático com loop infinito
        System.out.println("6. Loop infinito:");
        int fatorial = calcularFatorial(5);
        System.out.println("Fatorial: " + fatorial);
        System.out.println();
        
        // FALHA 7: Método estático com índice incorreto
        System.out.println("7. Índice incorreto:");
        int[] array = {10, 20, 30, 40, 50};
        int elemento = obterElemento(array, 5); // FALHA: índice 5 não existe
        System.out.println("Elemento: " + elemento);
        System.out.println();
        
        // FALHA 8: Método estático com conversão incorreta
        System.out.println("8. Conversão incorreta:");
        String numeroStr = "abc";
        int numero = converterParaInt(numeroStr);
        System.out.println("Número: " + numero);
        System.out.println();
        
        // FALHA 9: Método estático com recursão sem caso base
        System.out.println("9. Recursão sem caso base:");
        int fibonacci = calcularFibonacci(10);
        System.out.println("Fibonacci: " + fibonacci);
        System.out.println();
        
        // FALHA 10: Método estático com validação incorreta
        System.out.println("10. Validação incorreta:");
        boolean ehValido = validarIdade(-5);
        System.out.println("Idade válida: " + ehValido);
        System.out.println();
        
        // FALHA 11: Método estático com overflow
        System.out.println("11. Overflow:");
        long resultado2 = calcularPotencia(2, 100);
        System.out.println("Potência: " + resultado2);
        System.out.println();
        
        // FALHA 12: Método estático com comparação incorreta
        System.out.println("12. Comparação incorreta:");
        String str1 = "Java";
        String str2 = "java";
        boolean saoIguais = compararStrings(str1, str2);
        System.out.println("São iguais: " + saoIguais);
        System.out.println();
        
        // FALHA 13: Método estático com array vazio
        System.out.println("13. Array vazio:");
        int[] arrayVazio = {};
        int maximo = encontrarMaximo(arrayVazio);
        System.out.println("Máximo: " + maximo);
        System.out.println();
        
        // FALHA 14: Método estático com formatação incorreta
        System.out.println("14. Formatação incorreta:");
        String moeda = formatarMoeda(-123.45);
        System.out.println("Moeda: " + moeda);
        System.out.println();
        
        // FALHA 15: Método estático com loop com break mal posicionado
        System.out.println("15. Break mal posicionado:");
        int[] numeros2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int primeiroPar = encontrarPrimeiroPar(numeros2);
        System.out.println("Primeiro par: " + primeiroPar);
        System.out.println();
        
        System.out.println("=== IDENTIFIQUE TODAS AS FALHAS E CORRIJA-AS ===");
    }
    
    // FALHA 1: Método que deveria retornar int mas retorna void
    public static void somar(int a, int b) {
        int resultado = a + b;
        System.out.println("Soma: " + resultado);
        // FALHA: deveria retornar resultado
    }
    
    // FALHA 2: Parâmetro não usado
    public static void saudacao(String nome) {
        System.out.println("Olá! Bem-vindo!"); // FALHA: parâmetro nome não é usado
    }
    
    // FALHA 3: Divisão por zero
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / n3; // FALHA: divisão por n3 pode ser 0
    }
    
    // FALHA 4: Array não inicializado
    public static int somarArray(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return soma;
    }
    
    // FALHA 5: String nula
    public static int contarVogais(String texto) {
        int vogais = 0;
        String vogaisStr = "aeiouAEIOU";
        
        for (int i = 0; i < texto.length(); i++) { // FALHA: texto pode ser null
            char c = texto.charAt(i);
            if (vogaisStr.indexOf(c) != -1) {
                vogais++;
            }
        }
        return vogais;
    }
    
    // FALHA 6: Loop infinito
    public static int calcularFatorial(int n) {
        int resultado = 1;
        int i = 1;
        while (i <= n) {
            resultado *= i;
            // FALHA: i nunca é incrementado
        }
        return resultado;
    }
    
    // FALHA 7: Índice incorreto
    public static int obterElemento(int[] array, int indice) {
        return array[indice]; // FALHA: não verifica se índice é válido
    }
    
    // FALHA 8: Conversão incorreta
    public static int converterParaInt(String str) {
        return Integer.parseInt(str); // FALHA: pode lançar NumberFormatException
    }
    
    // FALHA 9: Recursão sem caso base
    public static int calcularFibonacci(int n) {
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2); // FALHA: sem caso base
    }
    
    // FALHA 10: Validação incorreta
    public static boolean validarIdade(int idade) {
        return idade > 0; // FALHA: deveria verificar também idade <= 120
    }
    
    // FALHA 11: Overflow
    public static long calcularPotencia(int base, int expoente) {
        long resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base; // FALHA: pode causar overflow
        }
        return resultado;
    }
    
    // FALHA 12: Comparação incorreta
    public static boolean compararStrings(String str1, String str2) {
        return str1 == str2; // FALHA: deveria usar equals()
    }
    
    // FALHA 13: Array vazio
    public static int encontrarMaximo(int[] array) {
        int max = array[0]; // FALHA: array pode estar vazio
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    // FALHA 14: Formatação incorreta
    public static String formatarMoeda(double valor) {
        return String.format("R$ %.2f", valor); // FALHA: não trata valores negativos
    }
    
    // FALHA 15: Break mal posicionado
    public static int encontrarPrimeiroPar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                break; // FALHA: break sai do loop, deveria retornar o valor
            }
        }
        return -1; // FALHA: sempre retorna -1
    }
}

