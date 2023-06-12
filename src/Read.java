import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String movie = read.nextLine();

        System.out.println("Digite o ano de lançamento do filme: ");
        int releaseYear = read.nextInt();

        System.out.println("Digite a nota que você da ao filme: ");
        float reviewNote = read.nextFloat();

        String message = """
                  Seu filme favorito é %s, ele foi lançado no ano de %d e a nota que você atribuiu a esse filme foi %f!
                  """.formatted(movie, releaseYear, reviewNote);

        System.out.println(message);
    }
}
