package lacos;

public class ForComFalhas {
    
    public static void main(String[] args) {
        System.out.println("=== LOOPS FOR COM FALHAS - IDENTIFIQUE E CORRIJA ===\n");
        
        // FALHA 1: Loop infinito - condição incorreta
        System.out.println("1. Loop infinito (condição incorreta):");
        for (int i = 0; i < 5; i--) { // FALHA: deveria ser i++
            System.out.println("Valor: " + i);
        }
        System.out.println();
        
        // FALHA 2: Variável de controle não declarada
        System.out.println("2. Variável de controle não declarada:");
        for (i = 0; i < 3; i++) { // FALHA: int está faltando
            System.out.println("Contador: " + i);
        }
        System.out.println();
        
        // FALHA 3: Loop com break mal posicionado
        System.out.println("3. Break mal posicionado:");
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                break; // FALHA: deveria ser continue para pular apenas o 5
            }
            System.out.println("Número: " + j);
        }
        System.out.println();
        
        // FALHA 4: Loop com continue sem incremento
        System.out.println("4. Continue sem incremento:");
        for (int k = 1; k <= 5; k++) {
            if (k % 2 == 0) {
                continue; // FALHA: continue sem incremento pode causar problemas
            }
            System.out.println("Ímpar: " + k);
        }
        System.out.println();
        
        // FALHA 5: Loop com array - índice incorreto
        System.out.println("5. Índice de array incorreto:");
        int[] numeros = {10, 20, 30, 40, 50};
        for (int i = 0; i <= numeros.length; i++) { // FALHA: deveria ser < numeros.length
            System.out.println("Elemento: " + numeros[i]);
        }
        System.out.println();
        
        // FALHA 6: Loop com String - método incorreto
        System.out.println("6. Método de String incorreto:");
        String texto = "Java";
        for (int i = 0; i < texto.length(); i++) {
            System.out.println("Caractere: " + texto.charAt(i + 1)); // FALHA: deveria ser i
        }
        System.out.println();
        
        // FALHA 7: Loop com múltiplas variáveis - ordem incorreta
        System.out.println("7. Ordem incorreta de múltiplas variáveis:");
        for (int i = 0, j = 10; i < 5; i++, j--) {
            System.out.println("i=" + i + ", j=" + j);
        }
        System.out.println();
        
        // FALHA 8: Loop sem corpo - ponto e vírgula incorreto
        System.out.println("8. Ponto e vírgula incorreto:");
        int soma = 0;
        for (int i = 1; i <= 5; i++); // FALHA: ponto e vírgula extra
        {
            soma += i; // FALHA: i não está no escopo
        }
        System.out.println("Soma: " + soma);
        System.out.println();
        
        // FALHA 9: Loop com condição sempre verdadeira
        System.out.println("9. Condição sempre verdadeira:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor: " + i);
            if (i == 3) {
                i = 0; // FALHA: reinicia o loop infinitamente
            }
        }
        System.out.println();
        
        // FALHA 10: Loop com variável externa modificada incorretamente
        System.out.println("10. Variável externa modificada incorretamente:");
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            contador = i; // FALHA: sobrescreve o contador
            System.out.println("Contador: " + contador);
        }
        System.out.println();
        
        // FALHA 11: Loop com divisão por zero
        System.out.println("11. Divisão por zero:");
        for (int i = 5; i >= 0; i--) {
            System.out.println("Resultado: " + (10 / i)); // FALHA: divisão por zero quando i = 0
        }
        System.out.println();
        
        // FALHA 12: Loop com overflow
        System.out.println("12. Overflow de variável:");
        for (int i = 1; i > 0; i *= 2) { // FALHA: pode causar overflow
            System.out.println("Número: " + i);
        }
        System.out.println();
        
        // FALHA 13: Loop com array vazio
        System.out.println("13. Array vazio:");
        int[] arrayVazio = {};
        for (int i = 0; i < arrayVazio.length; i++) {
            System.out.println("Elemento: " + arrayVazio[i]); // FALHA: array está vazio
        }
        System.out.println();
        
        // FALHA 14: Loop com String nula
        System.out.println("14. String nula:");
        String strNula = null;
        for (int i = 0; i < strNula.length(); i++) { // FALHA: NullPointerException
            System.out.println("Caractere: " + strNula.charAt(i));
        }
        System.out.println();
        
        // FALHA 15: Loop com condição de parada incorreta
        System.out.println("15. Condição de parada incorreta:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                i = 10; // FALHA: força o fim do loop prematuramente
            }
            System.out.println("Valor: " + i);
        }
        System.out.println();
        
        System.out.println("=== IDENTIFIQUE TODAS AS FALHAS E CORRIJA-AS ===");
    }
}

