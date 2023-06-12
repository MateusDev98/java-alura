public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 2022;
        boolean includedInPlan = false;
        float reviewNote = 8.1f;
        String typePlan = "plus";

        if (releaseYear >= 2022) {
            System.out.println("O filme é um lançamento");
        } else {
            System.out.println("O filme é antigo");
        }

        if (includedInPlan || typePlan.equals("plus")) {
            System.out.println("Você tem acesso ao recurso");
        } else {
            System.out.println("Você não tem acesso ao recurso");
        }

    }
}
