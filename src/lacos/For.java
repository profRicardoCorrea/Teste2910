package lacos;

public class For {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS DE USO DO LOOP FOR ===\n");
        
        // Exemplo 1: Loop for básico
        System.out.println("1. Loop for básico:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
        System.out.println();
        
        // Exemplo 2: Loop for decrescente
        System.out.println("2. Loop for decrescente:");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Contagem regressiva: " + i);
        }
        System.out.println();
        
        // Exemplo 3: Loop for com incremento personalizado
        System.out.println("3. Loop for com incremento personalizado:");
        for (int i = 0; i <= 20; i += 2) {
            System.out.println("Número par: " + i);
        }
        System.out.println();
        
        // Exemplo 4: Soma de números
        System.out.println("4. Soma de números de 1 a 100:");
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("Soma total: " + soma);
        System.out.println();
        
        // Exemplo 5: Cálculo de fatorial
        System.out.println("5. Cálculo de fatorial:");
        int n = 6;
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + n + " = " + fatorial);
        System.out.println();
        
        // Exemplo 6: Verificação de números primos
        System.out.println("6. Verificação de números primos de 2 a 20:");
        for (int numero = 2; numero <= 20; numero++) {
            boolean ehPrimo = true;
            for (int divisor = 2; divisor <= numero / 2; divisor++) {
                if (numero % divisor == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println(numero + " é primo");
            }
        }
        System.out.println();
        
        // Exemplo 7: Tabuada
        System.out.println("7. Tabuada do 7:");
        int multiplicador = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplicador + " x " + i + " = " + (multiplicador * i));
        }
        System.out.println();
        
        // Exemplo 8: Padrões de asteriscos
        System.out.println("8. Padrão de asteriscos:");
        for (int linha = 1; linha <= 5; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Exemplo 9: Loop for com break
        System.out.println("9. Loop for com break:");
        for (int i = 1; i <= 20; i++) {
            if (i % 7 == 0) {
                System.out.println("Encontrado múltiplo de 7: " + i);
                break;
            }
        }
        System.out.println();
        
        // Exemplo 10: Loop for com continue
        System.out.println("10. Loop for com continue:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Pula números pares
            }
            System.out.println("Número ímpar: " + i);
        }
        System.out.println();
        
        // Exemplo 11: Loop for com múltiplas variáveis
        System.out.println("11. Loop for com múltiplas variáveis:");
        for (int i = 1, j = 10; i <= 5; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println();
        
        // Exemplo 12: Loop for sem corpo (só na condição)
        System.out.println("12. Loop for sem corpo:");
        int soma2 = 0;
        for (int i = 1; i <= 5; soma2 += i++);
        System.out.println("Soma: " + soma2);
        System.out.println();
        
        // Exemplo 13: Loop for com arrays
        System.out.println("13. Loop for com arrays:");
        int[] numeros = {10, 20, 30, 40, 50};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }
        System.out.println();
        
        // Exemplo 14: Loop for-each (enhanced for)
        System.out.println("14. Loop for-each:");
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva"};
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }
        System.out.println();
        
        // Exemplo 15: Loop for aninhado - matriz
        System.out.println("15. Loop for aninhado - matriz:");
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Exemplo 16: Loop for com condição complexa
        System.out.println("16. Loop for com condição complexa:");
        for (int i = 1; i <= 20 && i % 3 != 0; i++) {
            System.out.println("Número não divisível por 3: " + i);
        }
        System.out.println();
        
        // Exemplo 17: Loop for com variável declarada fora
        System.out.println("17. Loop for com variável declarada fora:");
        int contador;
        for (contador = 0; contador < 5; contador++) {
            System.out.println("Contador: " + contador);
        }
        System.out.println("Valor final do contador: " + contador);
        System.out.println();
        
        // Exemplo 18: Loop for com String
        System.out.println("18. Loop for com String:");
        String texto = "Java";
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            System.out.println("Caractere " + i + ": " + caractere);
        }
        System.out.println();
        
        // Exemplo 19: Loop for com List (simulado)
        System.out.println("19. Loop for com List (simulado):");
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego"};
        for (int i = 0; i < nomes.length; i++) {
            String nome = nomes[i];
            System.out.println("Nome " + (i + 1) + ": " + nome);
        }
        System.out.println();
        
        // Exemplo 20: Loop for com Map (simulado)
        System.out.println("20. Loop for com Map (simulado):");
        String[] chaves = {"Nome", "Idade", "Cidade"};
        String[] valores = {"João", "25", "São Paulo"};
        
        for (int i = 0; i < chaves.length; i++) {
            System.out.println(chaves[i] + ": " + valores[i]);
        }
        System.out.println();
        
        // Exemplo 21: Loop for com operações matemáticas
        System.out.println("21. Loop for com operações matemáticas:");
        for (int i = 1; i <= 5; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + "² = " + quadrado + ", " + i + "³ = " + cubo);
        }
        System.out.println();
        
        // Exemplo 22: Loop for com StringBuilder
        System.out.println("22. Loop for com StringBuilder:");
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            resultado.append(i).append(" ");
        }
        System.out.println("Resultado: " + resultado.toString());
        System.out.println();
        
        // Exemplo 23: Loop for com validação
        System.out.println("23. Loop for com validação:");
        int[] notas = {85, 92, 78, 95, 88};
        int somaNotas = 0;
        int notasValidas = 0;
        
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0 && notas[i] <= 100) {
                somaNotas += notas[i];
                notasValidas++;
            }
        }
        
        if (notasValidas > 0) {
            double media = (double) somaNotas / notasValidas;
            System.out.println("Média das notas válidas: " + media);
        }
        System.out.println();
        
        // Exemplo 24: Loop for com múltiplos break points
        System.out.println("24. Loop for com múltiplos break points:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Múltiplo de 3 e 5: " + i);
                break;
            }
        }
        System.out.println();
        
        // Exemplo 25: Loop for com label
        System.out.println("25. Loop for com label:");
        externo: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Saindo do loop externo em i=" + i + ", j=" + j);
                    break externo;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        
        System.out.println("\n=== FIM DOS EXEMPLOS ===");
    }
}
