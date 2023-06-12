public class Main {

    public static void main(String[] args) {
        System.out.println("Este é o Screen Match");
        System.out.println("Filme: Interestelar");

        int releaseYear = 2022;
        System.out.println("Ano de lançamento: " + releaseYear);

        boolean includedInPlan = false;
        float reviewNote = 8.1f;

        double average = (reviewNote + (double) 5) / 2;
        // Nota: O (double) 5 é um exemplo de casting, que é quando você explicitamente converte um tipo de dado em outro. Neste caso, você está convertendo o inteiro 5 em um double. Isso significa que a operação 5 / 2 será uma divisão de ponto flutuante, não uma divisão de inteiros, e o resultado será 2.5, não 2.

        System.out.println(average);

        String synopsis;
        // synopsis = "Filme de ficção";
        // Text Blocks
        synopsis = """
                Interestelar
                Filme de ficção
                Ano de lançamento:""" + releaseYear;

        System.out.println(synopsis);

        String name = "João";
        int lessons = 4;

        String message = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(name, lessons);

        System.out.println(message);

        /* Uma das maneiras mais comuns de se formatar textos em Java é utilizando o método format(), da classe String. Esse método permite formatar um texto utilizando diversos placeholders, que são representados pelo caractere % seguido de uma letra que indica o tipo de dado que será inserido no placeholder. Por exemplo, %s indica que uma String será inserida no placeholder, %d indica um valor inteiro e %f indica um valor decimal. Vamos ver um exemplo: */

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.printf("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais%n", nome, idade, valor);

        int classification = (int) average / 2;
        System.out.printf("A classificação do filme é: %d", classification);

    }
}