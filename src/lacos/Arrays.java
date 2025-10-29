package lacos;

public class Arrays {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS DE DECLARAÇÃO E USO DE ARRAYS ===\n");
        
        // Exemplo 1: Array de inteiros
        System.out.println("1. Array de inteiros:");
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Array: " + java.util.Arrays.toString(numeros));
        System.out.println("Tamanho: " + numeros.length);
        System.out.println("Primeiro elemento: " + numeros[0]);
        System.out.println("Último elemento: " + numeros[numeros.length - 1]);
        System.out.println();
        
        // Exemplo 2: Array de inteiros - declaração e inicialização separadas
        System.out.println("2. Array de inteiros - declaração e inicialização separadas:");
        int[] idades = new int[4];
        idades[0] = 25;
        idades[1] = 30;
        idades[2] = 35;
        idades[3] = 40;
        System.out.println("Array de idades: " + java.util.Arrays.toString(idades));
        System.out.println();
        
        // Exemplo 3: Array de inteiros com loop for
        System.out.println("3. Array de inteiros com loop for:");
        int[] notas = {85, 92, 78, 95, 88};
        int somaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            somaNotas += notas[i];
        }
        double media = (double) somaNotas / notas.length;
        System.out.println("Média das notas: " + String.format("%.2f", media));
        System.out.println();
        
        // Exemplo 4: Array de inteiros com foreach
        System.out.println("4. Array de inteiros com foreach:");
        int[] numerosPares = {2, 4, 6, 8, 10, 12, 14, 16};
        for (int numero : numerosPares) {
            System.out.print(numero + " ");
        }
        System.out.println();
        System.out.println();
        
        // Exemplo 5: Array de inteiros - busca de elemento
        System.out.println("5. Array de inteiros - busca de elemento:");
        int[] numerosBusca = {15, 23, 7, 42, 18, 9, 31};
        int elementoProcurado = 42;
        boolean encontrou = false;
        
        for (int i = 0; i < numerosBusca.length; i++) {
            if (numerosBusca[i] == elementoProcurado) {
                System.out.println("Elemento " + elementoProcurado + " encontrado na posição " + i);
                encontrou = true;
                break;
            }
        }
        
        if (!encontrou) {
            System.out.println("Elemento " + elementoProcurado + " não encontrado");
        }
        System.out.println();
        
        // Exemplo 6: Array de Strings
        System.out.println("6. Array de Strings:");
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego", "Elena"};
        System.out.println("Array de nomes: " + java.util.Arrays.toString(nomes));
        System.out.println("Total de nomes: " + nomes.length);
        System.out.println();
        
        // Exemplo 7: Array de Strings com loop for
        System.out.println("7. Array de Strings com loop for:");
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva", "Morango"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta " + (i + 1) + ": " + frutas[i]);
        }
        System.out.println();
        
        // Exemplo 8: Array de Strings com foreach
        System.out.println("8. Array de Strings com foreach:");
        String[] cores = {"Vermelho", "Verde", "Azul", "Amarelo", "Roxo"};
        for (String cor : cores) {
            System.out.println("Cor: " + cor);
        }
        System.out.println();
        
        // Exemplo 9: Array de Strings - contagem de caracteres
        System.out.println("9. Array de Strings - contagem de caracteres:");
        String[] palavras = {"Java", "Python", "C++", "JavaScript", "Ruby"};
        for (String palavra : palavras) {
            System.out.println("Palavra: " + palavra + " - Número de caracteres: " + palavra.length());
        }
        System.out.println();
        
        // Exemplo 10: Array de Strings - filtro por tamanho
        System.out.println("10. Array de Strings - filtro por tamanho:");
        String[] linguagens = {"C", "Java", "Python", "JavaScript", "Go", "Rust"};
        System.out.println("Linguagens com mais de 3 caracteres:");
        for (String linguagem : linguagens) {
            if (linguagem.length() > 3) {
                System.out.println("- " + linguagem);
            }
        }
        System.out.println();
        
        // Exemplo 11: Array de booleanos
        System.out.println("11. Array de booleanos:");
        boolean[] respostas = {true, false, true, true, false, true, false};
        System.out.println("Array de respostas: " + java.util.Arrays.toString(respostas));
        System.out.println("Total de respostas: " + respostas.length);
        System.out.println();
        
        // Exemplo 12: Array de booleanos - contagem de verdadeiros
        System.out.println("12. Array de booleanos - contagem de verdadeiros:");
        boolean[] status = {true, false, true, true, false, true, true, false};
        int verdadeiros = 0;
        int falsos = 0;
        
        for (boolean valor : status) {
            if (valor) {
                verdadeiros++;
            } else {
                falsos++;
            }
        }
        
        System.out.println("Total de verdadeiros: " + verdadeiros);
        System.out.println("Total de falsos: " + falsos);
        System.out.println();
        
        // Exemplo 13: Array de booleanos - verificação de padrão
        System.out.println("13. Array de booleanos - verificação de padrão:");
        boolean[] sequencia = {true, true, false, true, false, false};
        boolean temPadrao = false;
        
        for (int i = 0; i < sequencia.length - 1; i++) {
            if (sequencia[i] == true && sequencia[i + 1] == false) {
                System.out.println("Padrão true-false encontrado na posição " + i);
                temPadrao = true;
            }
        }
        
        if (!temPadrao) {
            System.out.println("Nenhum padrão true-false encontrado");
        }
        System.out.println();
        
        // Exemplo 14: Array de float
        System.out.println("14. Array de float:");
        float[] precos = {19.99f, 29.99f, 39.99f, 49.99f, 59.99f};
        System.out.println("Array de preços: " + java.util.Arrays.toString(precos));
        System.out.println("Total de produtos: " + precos.length);
        System.out.println();
        
        // Exemplo 15: Array de float - cálculos
        System.out.println("15. Array de float - cálculos:");
        float[] temperaturas = {23.5f, 25.8f, 22.1f, 26.3f, 24.7f};
        float somaTemp = 0.0f;
        float maiorTemp = temperaturas[0];
        float menorTemp = temperaturas[0];
        
        for (float temp : temperaturas) {
            somaTemp += temp;
            if (temp > maiorTemp) {
                maiorTemp = temp;
            }
            if (temp < menorTemp) {
                menorTemp = temp;
            }
        }
        
        float mediaTemp = somaTemp / temperaturas.length;
        System.out.println("Temperaturas: " + java.util.Arrays.toString(temperaturas));
        System.out.println("Média: " + String.format("%.1f°C", mediaTemp));
        System.out.println("Maior temperatura: " + String.format("%.1f°C", maiorTemp));
        System.out.println("Menor temperatura: " + String.format("%.1f°C", menorTemp));
        System.out.println();
        
        // Exemplo 16: Array de float - arredondamento
        System.out.println("16. Array de float - arredondamento:");
        float[] valores = {3.14f, 2.718f, 1.414f, 2.236f, 1.732f};
        System.out.println("Valores originais: " + java.util.Arrays.toString(valores));
        System.out.println("Valores arredondados:");
        
        for (float valor : valores) {
            int arredondado = Math.round(valor);
            System.out.println(valor + " -> " + arredondado);
        }
        System.out.println();
        
        // Exemplo 17: Array de float - conversão para inteiros
        System.out.println("17. Array de float - conversão para inteiros:");
        float[] medidas = {15.7f, 23.2f, 8.9f, 45.1f, 12.6f};
        int[] medidasInt = new int[medidas.length];
        
        for (int i = 0; i < medidas.length; i++) {
            medidasInt[i] = (int) medidas[i];
        }
        
        System.out.println("Medidas originais (float): " + java.util.Arrays.toString(medidas));
        System.out.println("Medidas convertidas (int): " + java.util.Arrays.toString(medidasInt));
        System.out.println();
        
        // Exemplo 18: Array de float - filtro por faixa
        System.out.println("18. Array de float - filtro por faixa:");
        float[] notasFloat = {7.5f, 8.2f, 6.8f, 9.1f, 7.9f, 8.7f, 6.5f, 9.5f};
        System.out.println("Notas entre 7.0 e 8.5:");
        
        for (float nota : notasFloat) {
            if (nota >= 7.0f && nota <= 8.5f) {
                System.out.println("- " + String.format("%.1f", nota));
            }
        }
        System.out.println();
        
        // Exemplo 19: Array de float - ordenação manual (bubble sort)
        System.out.println("19. Array de float - ordenação manual:");
        float[] numerosFloat = {5.2f, 3.8f, 7.1f, 2.9f, 6.4f};
        System.out.println("Antes da ordenação: " + java.util.Arrays.toString(numerosFloat));
        
        // Bubble sort simples
        for (int i = 0; i < numerosFloat.length - 1; i++) {
            for (int j = 0; j < numerosFloat.length - i - 1; j++) {
                if (numerosFloat[j] > numerosFloat[j + 1]) {
                    float temp = numerosFloat[j];
                    numerosFloat[j] = numerosFloat[j + 1];
                    numerosFloat[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Após ordenação: " + java.util.Arrays.toString(numerosFloat));
        System.out.println();
        
        // Exemplo 20: Array de float - estatísticas
        System.out.println("20. Array de float - estatísticas:");
        float[] dados = {12.5f, 18.3f, 15.7f, 22.1f, 19.8f, 16.4f, 21.2f};
        float soma = 0.0f;
        float max = dados[0];
        float min = dados[0];
        
        for (float valor : dados) {
            soma += valor;
            if (valor > max) max = valor;
            if (valor < min) min = valor;
        }
        
        float mediaDados = soma / dados.length;
        System.out.println("Dados: " + java.util.Arrays.toString(dados));
        System.out.println("Soma: " + String.format("%.1f", soma));
        System.out.println("Média: " + String.format("%.1f", mediaDados));
        System.out.println("Máximo: " + String.format("%.1f", max));
        System.out.println("Mínimo: " + String.format("%.1f", min));
        
        System.out.println("\n=== FIM DOS EXEMPLOS ===");
    }
}
