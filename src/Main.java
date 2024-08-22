import java.util.Random;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int din = 0, num = 0, ejec = 0, op = 0;
        System.out.println("Apuesta y gana");
        System.out.println("Ingrese la cantidad de dinero con la que desea jugar");
        din = sc.nextInt();

        while (ejec == 0){
            num = ran.nextInt(1,4);
            System.out.println("Numero random: " + num);
            switch (num){
                case 1:
                    din = din * 2;
                    System.out.println("Gano, su dinero se multiplico por dos!");
                    System.out.println("Ahora tiene: $" + din);
                    System.out.println("Desea seguir jugando?, Si se retira obtendra la cantidad acumulada");
                    System.out.println("1. Si\n2. No");
                    op = sc.nextInt();
                    if(op == 1){
                        ejec = 0;
                    } else if (op == 2){
                        ejec = 1;
                    }
                    System.out.println("");
                    break;
                case 2:
                    din = din / 2;
                    System.out.println("Perdio, su dinero se dividira a la mitad.");
                    System.out.println("Ahora tiene: $" + din);
                    System.out.println("Desea seguir jugando?, Si se retira obtendra la cantidad acumulada");
                    System.out.println("1. Si\n2. No");
                    op = sc.nextInt();
                    if(op == 1){
                        ejec = 0;
                    } else if (op == 2){
                        ejec = 1;
                    }
                    System.out.println("");
                    break;
                case 3:
                    din = 0;
                    System.out.println("Perdio todo el dinero.");
                    System.out.println("El juego ha terminado.");
                    ejec = 1;
                    break;
            }
        }
    }
}