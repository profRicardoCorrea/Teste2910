package lacos;

public class WhileComFalhas {
    
    public static void main(String[] args) {
        System.out.println("=== LOOPS WHILE COM FALHAS - IDENTIFIQUE E CORRIJA ===\n");
        
        // FALHA 1: Loop infinito - variável nunca é incrementada
        System.out.println("1. Loop infinito (variável não incrementada):");
        int contador1 = 1;
        while (contador1 <= 5) {
            System.out.println("Contador: " + contador1);
            // FALHA: contador1++; está faltando
        }
        System.out.println();
        
        // FALHA 2: Condição incorreta - loop nunca executa
        System.out.println("2. Loop que nunca executa (condição incorreta):");
        int numero = 10;
        while (numero > 20) { // FALHA: deveria ser numero < 20
            System.out.println("Número: " + numero);
            numero++;
        }
        System.out.println();
        
        // FALHA 3: Variável não inicializada
        System.out.println("3. Variável não inicializada:");
        int valor; // FALHA: não foi inicializada
        while (valor > 0) {
            System.out.println("Valor: " + valor);
            valor--;
        }
        System.out.println();
        
        // FALHA 4: Loop com break mal posicionado
        System.out.println("4. Break mal posicionado:");
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                break; // FALHA: break está no lugar errado, deveria ser continue
            }
            System.out.println("Número: " + i);
            i++;
        }
        System.out.println();
        
        // FALHA 5: Condição de parada incorreta
        System.out.println("5. Condição de parada incorreta:");
        int soma = 0;
        int j = 1;
        while (j <= 5) {
            soma += j;
            j++;
        }
        System.out.println("Soma: " + soma); // FALHA: deveria ser 15, mas será 0
        System.out.println();
        
        // FALHA 6: Loop com continue mal usado
        System.out.println("6. Continue mal usado:");
        int k = 1;
        while (k <= 5) {
            if (k % 2 == 0) {
                continue; // FALHA: continue sem incremento causa loop infinito
            }
            System.out.println("Ímpar: " + k);
            k++;
        }
        System.out.println();
        
        // FALHA 7: Variável de controle modificada incorretamente
        System.out.println("7. Variável de controle modificada incorretamente:");
        int n = 1;
        while (n <= 10) {
            System.out.println("N: " + n);
            n = n + 2; // FALHA: incremento incorreto, deveria ser n++
        }
        System.out.println();
        
        // FALHA 8: Loop com condição sempre verdadeira
        System.out.println("8. Condição sempre verdadeira:");
        boolean condicao = true;
        int contador2 = 0;
        while (condicao) {
            System.out.println("Contador: " + contador2);
            contador2++;
            if (contador2 > 5) {
                condicao = false; // FALHA: condição nunca muda
            }
        }
        System.out.println();
        
        // FALHA 9: Loop com array - índice incorreto
        System.out.println("9. Índice de array incorreto:");
        int[] numeros = {1, 2, 3, 4, 5};
        int indice = 0;
        while (indice < numeros.length) {
            System.out.println("Elemento: " + numeros[indice + 1]); // FALHA: deveria ser numeros[indice]
            indice++;
        }
        System.out.println();
        
        // FALHA 10: Loop com String - método incorreto
        System.out.println("10. Método de String incorreto:");
        String texto = "Java";
        int pos = 0;
        while (pos < texto.length()) {
            System.out.println("Caractere: " + texto.charAt(pos + 1)); // FALHA: deveria ser texto.charAt(pos)
            pos++;
        }
        System.out.println();
        
        // FALHA 11: Loop com divisão por zero
        System.out.println("11. Divisão por zero:");
        int dividendo = 100;
        int divisor = 2;
        while (divisor > 0) {
            System.out.println("Resultado: " + (dividendo / divisor));
            divisor = divisor - 2; // FALHA: pode chegar a 0 ou negativo
        }
        System.out.println();
        
        // FALHA 12: Loop com overflow
        System.out.println("12. Overflow de variável:");
        int numeroGrande = 1;
        while (numeroGrande > 0) {
            System.out.println("Número: " + numeroGrande);
            numeroGrande = numeroGrande * 2; // FALHA: pode causar overflow
        }
        System.out.println();
        
        System.out.println("=== IDENTIFIQUE TODAS AS FALHAS E CORRIJA-AS ===");
    }
}

