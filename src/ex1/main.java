package ex1;

/**
 * Classe principal dos exercícios da Aula 1 de Métodos.
 */
public class main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("exercício calculadora");
        calculadora.soma(3, 6);
        calculadora.subtracao(9, 1.8);
        calculadora.multiplicacao(7, 8);
        calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("exercício mensagem");
        mensagem.obtermensagem(9);
        mensagem.obtermensagem(14);
        mensagem.obtermensagem(1);

        // Empréstimo
        System.out.println("exercício empréstimo");
        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, 5);

    }
}