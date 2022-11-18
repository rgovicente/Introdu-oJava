public class Fatorial {
    public static void main(String[] args) {


//      verifica se o numero é maior que zero e se menor que 100
//      caso não seja, exibir na tela uma mensagem dizendo que o numero deve ser
//      entre 1 e 100
//      caso seja, retornar o fatorial do numero
//      fatorial de 5 = 5*4*3*2*1 = 120
        int numero;
        numero = 200;
        int resultado ;
        resultado = 1;



        if (numero > 200) {
            System.out.println("Escreva um numero entre 0 e 100");
        } else
            for (int fatorial = 1 ; fatorial <= numero ; fatorial ++) {

                resultado = resultado * fatorial;
                System.out.println(resultado);
            }
        System.out.println("Resultado" + resultado);

    }
}
