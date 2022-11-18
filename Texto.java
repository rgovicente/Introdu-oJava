public class Texto {
    public static void main(String[] args) {
        String[] texto = new String[3];

        texto[0] = "João";
        texto[1] = "Maria";
        texto[2] = "Fatima";

        String stringConcatenada = "";

        stringConcatenada += texto[0];
        stringConcatenada += texto[1];
        stringConcatenada += texto[2];

        System.out.println(stringConcatenada);
        }
    }
