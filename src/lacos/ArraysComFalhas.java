package lacos;

public class ArraysComFalhas {
    
    public static void main(String[] args) {
        System.out.println("=== ARRAYS COM FALHAS - IDENTIFIQUE E CORRIJA ===\n");
        
        // FALHA 1: Array declarado mas não inicializado
        System.out.println("1. Array não inicializado:");
        int[] numeros; // FALHA: array declarado mas não inicializado
        System.out.println("Tamanho: " + numeros.length); // FALHA: NullPointerException
        System.out.println();
        
        // FALHA 2: Acesso a índice inexistente
        System.out.println("2. Acesso a índice inexistente:");
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Elemento: " + array1[5]); // FALHA: índice 5 não existe (ArrayIndexOutOfBoundsException)
        System.out.println();
        
        // FALHA 3: Array com tamanho negativo
        System.out.println("3. Array com tamanho negativo:");
        int tamanho = -5;
        int[] array2 = new int[tamanho]; // FALHA: NegativeArraySizeException
        System.out.println("Tamanho: " + array2.length);
        System.out.println();
        
        // FALHA 4: Loop com índice incorreto
        System.out.println("4. Loop com índice incorreto:");
        String[] frutas = {"Maçã", "Banana", "Laranja"};
        for (int i = 0; i <= frutas.length; i++) { // FALHA: deveria ser < frutas.length
            System.out.println("Fruta: " + frutas[i]);
        }
        System.out.println();
        
        // FALHA 5: Array de tipos mistos
        System.out.println("5. Array de tipos mistos:");
        Object[] arrayMisto = {1, "texto", true, 3.14}; // FALHA: tipos mistos podem causar problemas
        for (int i = 0; i < arrayMisto.length; i++) {
            int valor = (Integer) arrayMisto[i]; // FALHA: ClassCastException e erro de digitação
            System.out.println("Valor: " + valor);
        }
        System.out.println();
        
        // FALHA 6: Array multidimensional incorreto
        System.out.println("6. Array multidimensional incorreto:");
        int[][] matriz = new int[3][]; // FALHA: segunda dimensão não foi inicializada
        matriz[0][0] = 1; // FALHA: NullPointerException
        System.out.println();
        
        // FALHA 7: Cópia incorreta de array
        System.out.println("7. Cópia incorreta de array:");
        int[] original = {1, 2, 3, 4, 5};
        int[] copia = original; // FALHA: referência, não cópia
        copia[0] = 999;
        System.out.println("Original: " + original[0]); // FALHA: será 999, não 1
        System.out.println();
        
        // FALHA 8: Array com tamanho zero
        System.out.println("8. Array com tamanho zero:");
        int[] arrayVazio = new int[0];
        System.out.println("Primeiro elemento: " + arrayVazio[0]); // FALHA: ArrayIndexOutOfBoundsException
        System.out.println();
        
        // FALHA 9: Loop foreach modificando array
        System.out.println("9. Loop foreach modificando array:");
        int[] numeros2 = {1, 2, 3, 4, 5};
        for (int num : numeros2) {
            num = num * 2; // FALHA: não modifica o array original
        }
        System.out.println("Primeiro elemento: " + numeros2[0]); // FALHA: será 1, não 2
        System.out.println();
        
        // FALHA 10: Array com elementos não inicializados
        System.out.println("10. Array com elementos não inicializados:");
        boolean[] flags = new boolean[5];
        for (int i = 0; i < flags.length; i++) {
            if (flags[i]) { // FALHA: elementos boolean são false por padrão
                System.out.println("Flag " + i + " é verdadeira");
            }
        }
        System.out.println();
        
        // FALHA 11: Array com String nula
        System.out.println("11. Array com String nula:");
        String[] nomes = {"Ana", null, "Carlos", "Diana"};
        for (String nome : nomes) {
            System.out.println("Nome: " + nome.toUpperCase()); // FALHA: NullPointerException
        }
        System.out.println();
        
        // FALHA 12: Array com divisão por zero
        System.out.println("12. Array com divisão por zero:");
        int[] divisores = {2, 1, 0, 3, 4};
        for (int divisor : divisores) {
            System.out.println("Resultado: " + (10 / divisor)); // FALHA: ArithmeticException
        }
        System.out.println();
        
        // FALHA 13: Array com overflow
        System.out.println("13. Array com overflow:");
        int[] valores = {Integer.MAX_VALUE, 1, 2, 3};
        for (int i = 0; i < valores.length - 1; i++) {
            valores[i + 1] = valores[i] + valores[i + 1]; // FALHA: pode causar overflow
        }
        System.out.println();
        
        // FALHA 14: Array com comparação incorreta
        System.out.println("14. Array com comparação incorreta:");
        String[] palavras = {"Java", "Python", "C++"};
        String busca = "java";
        boolean encontrou = false;
        for (String palavra : palavras) {
            if (palavra == busca) { // FALHA: deveria ser palavra.equals(busca)
                encontrou = true;
                break;
            }
        }
        System.out.println("Encontrou: " + encontrou);
        System.out.println();
        
        // FALHA 15: Array com ordenação incorreta
        System.out.println("15. Array com ordenação incorreta:");
        int[] numeros3 = {5, 2, 8, 1, 9};
        // Bubble sort com erro
        for (int i = 0; i < numeros3.length; i++) {
            for (int j = 0; j < numeros3.length - i; j++) { // FALHA: deveria ser j < numeros3.length - i - 1
                if (numeros3[j] > numeros3[j + 1]) {
                    int temp = numeros3[j];
                    numeros3[j] = numeros3[j + 1];
                    numeros3[j + 1] = temp;
                }
            }
        }
        System.out.println("Array ordenado: " + java.util.Arrays.toString(numeros3));
        System.out.println();
        
        // FALHA 16: Array com concatenação incorreta
        System.out.println("16. Array com concatenação incorreta:");
        String[] partes = {"Hello", " ", "World"};
        String resultado = "";
        for (int i = 0; i < partes.length; i++) {
            resultado = resultado + partes[i]; // FALHA: concatenação ineficiente
        }
        System.out.println("Resultado: " + resultado);
        System.out.println();
        
        // FALHA 17: Array com busca binária incorreta
        System.out.println("17. Array com busca binária incorreta:");
        int[] ordenados = {1, 3, 5, 7, 9, 11, 13};
        int elemento = 7;
        int inicio = 0;
        int fim = ordenados.length;
        while (inicio < fim) {
            int meio = (inicio + fim) / 2;
            if (ordenados[meio] == elemento) {
                System.out.println("Encontrado na posição: " + meio);
                break;
            } else if (ordenados[meio] < elemento) {
                inicio = meio; // FALHA: deveria ser meio + 1
            } else {
                fim = meio; // FALHA: deveria ser meio
            }
        }
        System.out.println();
        
        // FALHA 18: Array com filtro incorreto
        System.out.println("18. Array com filtro incorreto:");
        int[] dados = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] pares = new int[dados.length];
        int indicePares = 0;
        for (int i = 0; i < dados.length; i++) {
            if (dados[i] % 2 == 0) {
                pares[indicePares] = dados[i];
                indicePares++; // FALHA: incremento correto, mas array pode ter elementos 0
            }
        }
        System.out.println("Números pares: " + java.util.Arrays.toString(pares));
        System.out.println();
        
        // FALHA 19: Array com média incorreta
        System.out.println("19. Array com média incorreta:");
        double[] notas = {8.5, 9.0, 7.5, 8.0, 9.5};
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length; // FALHA: divisão por inteiro pode perder precisão
        System.out.println("Média: " + media);
        System.out.println();
        
        // FALHA 20: Array com validação incorreta
        System.out.println("20. Array com validação incorreta:");
        int[] idades = {25, 30, -5, 35, 150, 40}; // FALHA: idades inválidas
        for (int idade : idades) {
            if (idade >= 0 && idade <= 120) {
                System.out.println("Idade válida: " + idade);
            } else {
                System.out.println("Idade inválida: " + idade);
            }
        }
        System.out.println();
        
        System.out.println("=== IDENTIFIQUE TODAS AS FALHAS E CORRIJA-AS ===");
    }
}

