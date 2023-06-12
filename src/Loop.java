import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float reviewSum = 0;
        float reviewNote = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota que você da ao filme: ");
            reviewNote = read.nextFloat();
            reviewSum += reviewNote;
        }

        float averageReview = reviewSum / 3;

        String message = """
                  A média de avaliações a esse filme foi %f!
                  """.formatted( averageReview);

        System.out.println(message);
    }
}
