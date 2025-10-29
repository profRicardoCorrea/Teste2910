package lacos;

public class DoWhile {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS DE USO DO LOOP DO-WHILE ===\n");
        
        // Exemplo 1: Menu de opções
        System.out.println("1. Menu de opções:");
        int opcao = 0;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Sair");
            System.out.println("Opção escolhida: " + opcao);
            
            // Simulando seleção de opção
            if (opcao == 0) {
                opcao = 2; // Simula escolha da opção 2
            } else if (opcao == 2) {
                opcao = 3; // Simula escolha da opção 3 (sair)
            }
            
        } while (opcao != 3);
        System.out.println("Programa finalizado!\n");
        
        // Exemplo 2: Validação de entrada com do-while
        System.out.println("2. Validação de entrada:");
        int numero = -5;
        do {
            System.out.println("Digite um número positivo (atual: " + numero + ")");
            // Simulando nova entrada
            if (numero < 0) {
                numero = 15; // Simula entrada válida
            }
        } while (numero < 0);
        System.out.println("Número válido aceito: " + numero + "\n");
        
        // Exemplo 3: Cálculo de fatorial
        System.out.println("3. Cálculo de fatorial:");
        int n = 5;
        int fatorial = 1;
        int i = n;
        
        do {
            fatorial *= i;
            i--;
        } while (i > 0);
        
        System.out.println("Fatorial de " + n + " = " + fatorial + "\n");
        
        // Exemplo 4: Jogo de adivinhação
        System.out.println("4. Jogo de adivinhação:");
        int numeroSecreto = 7;
        int tentativa = 0;
        int palpite = 0;
        
        do {
            tentativa++;
            System.out.println("Tentativa " + tentativa + ": Digite um número entre 1 e 10");
            
            // Simulando diferentes palpites
            if (tentativa == 1) {
                palpite = 3;
            } else if (tentativa == 2) {
                palpite = 9;
            } else {
                palpite = 7; // Palpite correto
            }
            
            System.out.println("Palpite: " + palpite);
            
            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente um número maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativa + " tentativas!");
            }
            
        } while (palpite != numeroSecreto && tentativa < 5);
        
        if (palpite != numeroSecreto) {
            System.out.println("Game Over! O número era " + numeroSecreto);
        }
        System.out.println();
        
        // Exemplo 5: Conversão de decimal para binário
        System.out.println("5. Conversão decimal para binário:");
        int decimal = 25;
        String binario = "";
        int temp = decimal;
        
        do {
            binario = (temp % 2) + binario;
            temp = temp / 2;
        } while (temp > 0);
        
        System.out.println(decimal + " em binário = " + binario + "\n");
        
        // Exemplo 6: Soma de dígitos
        System.out.println("6. Soma dos dígitos de um número:");
        int numeroParaSomar = 12345;
        int somaDigitos = 0;
        int numeroTemp = numeroParaSomar;
        
        do {
            somaDigitos += numeroTemp % 10;
            numeroTemp = numeroTemp / 10;
        } while (numeroTemp > 0);
        
        System.out.println("Soma dos dígitos de " + numeroParaSomar + " = " + somaDigitos + "\n");
        
        // Exemplo 7: Verificação de palíndromo
        System.out.println("7. Verificação de palíndromo:");
        int numeroPalindromo = 12321;
        int numeroOriginal = numeroPalindromo;
        int numeroInvertido = 0;
        
        do {
            numeroInvertido = numeroInvertido * 10 + (numeroPalindromo % 10);
            numeroPalindromo = numeroPalindromo / 10;
        } while (numeroPalindromo > 0);
        
        if (numeroOriginal == numeroInvertido) {
            System.out.println(numeroOriginal + " é um palíndromo!");
        } else {
            System.out.println(numeroOriginal + " não é um palíndromo.");
        }
        System.out.println();
        
        // Exemplo 8: Geração de números aleatórios até condição
        System.out.println("8. Geração de números até encontrar par:");
        int numeroGerado = 0;
        int contador = 0;
        
        do {
            // Simulando geração de número aleatório
            numeroGerado = (int)(Math.random() * 10) + 1;
            contador++;
            System.out.println("Tentativa " + contador + ": " + numeroGerado);
        } while (numeroGerado % 2 != 0 && contador < 10);
        
        if (numeroGerado % 2 == 0) {
            System.out.println("Número par encontrado: " + numeroGerado);
        } else {
            System.out.println("Não foi possível encontrar número par em " + contador + " tentativas.");
        }
        System.out.println();
        
        // Exemplo 9: Loop com múltiplas condições
        System.out.println("9. Loop com múltiplas condições:");
        int valor = 100;
        int divisor = 2;
        
        do {
            if (valor % divisor == 0) {
                System.out.println(valor + " é divisível por " + divisor);
                break;
            }
            divisor++;
        } while (divisor <= valor / 2 && valor > 1);
        
        if (divisor > valor / 2 && valor > 1) {
            System.out.println(valor + " é um número primo.");
        }
        System.out.println();
        
        // Exemplo 10: Processamento de dados com validação
        System.out.println("10. Processamento de dados com validação:");
        int[] dados = {5, -3, 8, -1, 12, 0, -7};
        int indice = 0;
        int somaPositivos = 0;
        
        do {
            if (dados[indice] > 0) {
                somaPositivos += dados[indice];
                System.out.println("Processando: " + dados[indice] + " (positivo)");
            } else {
                System.out.println("Ignorando: " + dados[indice] + " (não positivo)");
            }
            indice++;
        } while (indice < dados.length);
        
        System.out.println("Soma dos números positivos: " + somaPositivos);
        System.out.println();
        
        // Exemplo 11: Loop do-while com continue
        System.out.println("11. Loop do-while com continue:");
        int contadorContinue = 0;
        
        do {
            contadorContinue++;
            
            if (contadorContinue % 2 == 0) {
                System.out.println("Pulando número par: " + contadorContinue);
                continue;
            }
            
            System.out.println("Processando número ímpar: " + contadorContinue);
            
        } while (contadorContinue < 10);
        System.out.println();
        
        // Exemplo 12: Simulação de sistema de login
        System.out.println("12. Sistema de login:");
        String usuarioCorreto = "admin";
        String senhaCorreta = "123456";
        String usuario = "";
        String senha = "";
        int tentativasLogin = 0;
        
        do {
            tentativasLogin++;
            System.out.println("Tentativa " + tentativasLogin + " de login");
            
            // Simulando entrada de dados
            if (tentativasLogin == 1) {
                usuario = "user";
                senha = "abc";
            } else if (tentativasLogin == 2) {
                usuario = "admin";
                senha = "wrong";
            } else {
                usuario = "admin";
                senha = "123456";
            }
            
            System.out.println("Usuário: " + usuario + ", Senha: " + senha);
            
            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login realizado com sucesso!");
                break;
            } else {
                System.out.println("Credenciais inválidas!");
            }
            
        } while (tentativasLogin < 3);
        
        if (tentativasLogin >= 3) {
            System.out.println("Número máximo de tentativas excedido. Conta bloqueada.");
        }
        
        System.out.println("\n=== FIM DOS EXEMPLOS ===");
    }
}
