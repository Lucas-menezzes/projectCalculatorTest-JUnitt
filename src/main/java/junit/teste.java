package junit;

public class teste {
    public static void main(String[] args) {
        // Criando uma instância da classe Calculator
        Calculator calculator = new Calculator();

        // Chamando o método multiply e armazenando o resultado em uma variável
        int result = calculator.mutiply(5, 3);

        // Imprimindo o resultado
        System.out.println("Resultado da multiplicação: " + result);
    }
}
