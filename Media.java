public class Media {
//criar o main
// calcular a media de 3 notas (média sinples)
//exibir se o aluno foi aprovado, reprovado
// ou se está em recuperação
    public static void main(String[] args) {
        double nota1 = 8;
        double nota2 = 4;
        double nota3 = 5;

        double media = (nota1 + nota2 + nota3) / 3;


        // se media maior ou igual a 7
        //fazer x senao fazer y
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media > 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}







