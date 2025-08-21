public class JavaProject {
// Condições aula 09
    //Calculadora
    public static void main(String[] args) {
    String operacao = args[0];
    int num1 = Integer.parseInt(args[1]);
    int num2 = Integer.parseInt(args[2]);

    switch (operacao.toUpperCase()){
        case "SOMA":
            System.out.println("Resultado: " + (num1 + num2));
            break;
        default:
            System.out.println("Operação inválida. Use: Soma, Subtracao, Multiplicacao, Divisao.");
    }
        }


    }
