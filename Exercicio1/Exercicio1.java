import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número Real");
        float numero1 = input.nextFloat();
        System.out.println("Digite o segundo número Real");
        float numero2 = input.nextFloat();

        System.out.printf("%s %s %s %s %s %s %s %s %s %s%n","1-Abs","2-Ceil","3-Cos","4-Exp","5-Floor","6-Log","7-Max","8-Min","9-Pow","10-Sqrt");

        int chave = input.nextInt();
        //System.out.printf("%d%n",chave);
        
        switch (chave) {
            case 1:
                System.out.println("abs número1 = " + Math.abs(numero1));
                System.out.println("abs número2 = " + Math.abs(numero2));
                break;
            
            case 2:
            System.out.println("Ceil número1 = " + Math.ceil(numero1));
            System.out.println("Ceil número2 = " + Math.ceil(numero2));
            break;

            case 3:
                System.out.println("cos número1 = " + Math.cos(numero1));
                System.out.println("cos número2 = " + Math.cos(numero2));
                break;

            case 4:
                System.out.println("exp número1 = " + Math.exp(numero1));
                System.out.println("exp número2 = " + Math.exp(numero2));
                break;
            
            case 5:
                System.out.println("exp número1 = " + Math.floor(numero1));
                System.out.println("exp número2 = " + Math.floor(numero2));
                break;
            
            case 6:
                System.out.println("exp número1 = " + Math.log(numero1));
                System.out.println("exp número2 = " + Math.log(numero2));
                break;
            
            case 7:
                System.out.println("max = " + Math.max(numero1, numero2));
                break;
            case 8:
                System.out.println("min = " + Math.min(numero1, numero2));
                break;
            case 9:
                System.out.println("pow = " + Math.pow(numero1, numero2));
                break;
            case 10:
                System.out.println("sqrt número1 = " + Math.sqrt(numero1));
                System.out.println("sqrt número2 = " + Math.sqrt(numero2));
                break;
            default:
                System.out.println("Entrada invalida");
                break;
        }

    }

}
