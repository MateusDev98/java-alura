import java.util.Scanner;

public class AnotherLoops {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float reviewSum = 0;
        float reviewNote = 0;
        int totalReviewNotes = 0;

        while(reviewNote != -1) {
            System.out.println("Digite a nota que você da ao filme ou -1 para encerrar: ");
            reviewNote = read.nextFloat();
            if (reviewNote != -1) {
                reviewSum += reviewNote;
                totalReviewNotes++;
            }
        }

        float averageReview = reviewSum / totalReviewNotes;

        String message = """
                  A média de avaliações a esse filme foi %f!
                  """.formatted( averageReview);

        System.out.println(message);
    }
}
