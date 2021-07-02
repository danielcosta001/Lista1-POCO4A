import java.util.Scanner;

public class Principal{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um número inteiro entre 1 e 10\n");
        int entrada = input.nextInt();

        Descobrir objeto = new Descobrir();
        
        while(! objeto.avaliar(entrada).equals("Iguais")){

            System.out.println("\nDigite o número: ");
            entrada = input.nextInt();
        }
    }
}