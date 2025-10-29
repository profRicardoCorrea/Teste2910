package lacos;

public class While {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS DE USO DO LOOP WHILE ===\n");
        
        // Exemplo 1: Contador básico
        System.out.println("1. Contador básico:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        
        // Exemplo 2: Soma de números
        System.out.println("\n2. Soma de números de 1 a 10:");
        int numero = 1;
        int soma = 0;
        while (numero <= 10) {
            soma += numero;
            numero++;
        }
        System.out.println("Soma total: " + soma);
        
        // Exemplo 3: Verificação de senha
        System.out.println("\n3. Verificação de senha (simulado):");
        String senhaCorreta = "12345";
        String senhaDigitada = "00000";
        int tentativas = 0;
        
        while (!senhaDigitada.equals(senhaCorreta) && tentativas < 3) {
            tentativas++;
            System.out.println("Tentativa " + tentativas + ": Senha incorreta");
            // Simulando nova tentativa
            if (tentativas == 2) {
                senhaDigitada = "12345"; // Senha correta na última tentativa
            }
        }
        
        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha correta! Acesso permitido.");
        } else {
            System.out.println("Número máximo de tentativas excedido.");
        }
        
        // Exemplo 4: Cálculo de potência
        System.out.println("\n4. Cálculo de potência:");
        int base = 2;
        int expoente = 5;
        int resultado = 1;
        int i = 0;
        
        while (i < expoente) {
            resultado *= base;
            i++;
        }
        System.out.println(base + " elevado a " + expoente + " = " + resultado);
        
        // Exemplo 5: Inversão de número
        System.out.println("\n5. Inversão de número:");
        int numeroOriginal = 12345;
        int numeroInvertido = 0;
        int temp = numeroOriginal;
        
        while (temp > 0) {
            int digito = temp % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            temp = temp / 10;
        }
        System.out.println("Número original: " + numeroOriginal);
        System.out.println("Número invertido: " + numeroInvertido);
        
        // Exemplo 6: Verificação de número primo
        System.out.println("\n6. Verificação de número primo:");
        int numeroTeste = 17;
        boolean ehPrimo = true;
        int divisor = 2;
        
        while (divisor <= numeroTeste / 2) {
            if (numeroTeste % divisor == 0) {
                ehPrimo = false;
                break;
            }
            divisor++;
        }
        
        if (ehPrimo && numeroTeste > 1) {
            System.out.println(numeroTeste + " é um número primo.");
        } else {
            System.out.println(numeroTeste + " não é um número primo.");
        }
        
        // Exemplo 7: Série de Fibonacci
        System.out.println("\n7. Série de Fibonacci (primeiros 10 termos):");
        int primeiro = 0;
        int segundo = 1;
        int termo = 0;
        int posicao = 1;
        
        while (posicao <= 10) {
            if (posicao == 1) {
                System.out.print(primeiro);
            } else if (posicao == 2) {
                System.out.print(", " + segundo);
            } else {
                termo = primeiro + segundo;
                System.out.print(", " + termo);
                primeiro = segundo;
                segundo = termo;
            }
            posicao++;
        }
        System.out.println();
        
        // Exemplo 8: Loop com condição de parada
        System.out.println("\n8. Loop com condição de parada:");
        int valor = 100;
        while (valor > 0) {
            if (valor % 7 == 0) {
                System.out.println("Encontrado múltiplo de 7: " + valor);
                break; // Para o loop quando encontrar o primeiro múltiplo de 7
            }
            valor--;
        }
        
        // Exemplo 9: Validação de entrada
        System.out.println("\n9. Validação de entrada (simulado):");
        int entrada = -5;
        int tentativasValidacao = 0;
        
        while (entrada < 0 && tentativasValidacao < 3) {
            tentativasValidacao++;
            System.out.println("Tentativa " + tentativasValidacao + ": Valor inválido (" + entrada + ")");
            // Simulando nova entrada
            if (tentativasValidacao == 2) {
                entrada = 10; // Valor válido na última tentativa
            }
        }
        
        if (entrada >= 0) {
            System.out.println("Valor válido aceito: " + entrada);
        } else {
            System.out.println("Valor inválido após todas as tentativas.");
        }
        
        // Exemplo 10: Loop infinito controlado
        System.out.println("\n10. Loop infinito controlado:");
        int contadorInfinito = 0;
        while (true) {
            contadorInfinito++;
            if (contadorInfinito > 5) {
                System.out.println("Loop interrompido após " + contadorInfinito + " iterações.");
                break;
            }
            System.out.println("Iteração " + contadorInfinito);
        }
        
        System.out.println("\n=== FIM DOS EXEMPLOS ===");
    }
}
