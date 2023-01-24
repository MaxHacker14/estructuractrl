import java.util.Scanner;

public class Prac666 {
        public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Piedra(0), papel(1) o tijeras(2)? ");
            int jug = entrada.nextInt();
        System.out.println("Genera al azar piedra, papel o tijeras:");
            int mano = (int)(Math.random()*3); 

        switch(mano) {
            case 0:
                System.out.println("piedra");
                    if (jug == 1 && mano == 0){ 
                        System.out.println("Has ganado");
                    } else if (jug == 2 && mano == 0){
                        System.out.println("Has perdido");
                    }  else if (jug == mano){
                        System.out.println("Empate"); }
                break;
            case 1:
                System.out.println("papel");
                if (jug == 2 && mano == 1){
                    System.out.println("Has ganado");
                } else if (jug == 0 && mano == 1){
                    System.out.println("Has perdido"); 
                } else if (jug == mano){
                    System.out.println("Empate"); }
                break;
            case 2:
                System.out.println("tijeras");
                if (jug == 0 && mano == 2){
                    System.out.println("Has ganado");
                } else if (jug == 1 && mano == 2){
                    System.out.println("Has perdido");
                } else if (jug == mano){
                    System.out.println("Empate"); }
                break;
            default :      
        }
    }
}

    
