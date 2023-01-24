import java.util.Scanner;

public class AmericaN {
    
    public static void main (String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nota: ");
        int nota = entrada.nextInt();


        if (nota >= 0 && nota < 59){
            System.out.println("F \t\t");
        } else if (nota >= 60 && nota < 69){
            System.out.println("D \t\t");
        } else if (nota >=70 && nota < 79){
            System.out.println("C \t\t");
        } else if (nota >=80 && nota < 89){
            System.out.println("B \t\t");
        } else if (nota >= 90 && nota <= 100){
            System.out.println("A \t\t");
        } else if (nota < 0 || nota > 100){
            System.out.println("Error, la nota " + nota + " no es valida. \t\t" );
        }
        
    }
}   

