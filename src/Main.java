
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] nomesJogadores = new String[10];
        Scanner sc = new Scanner(System.in);


        //inicialização; condição; incremento
        // ++ -> vai somar +1 i = i + 1
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o nome do player " + i);
            nomesJogadores[i] = sc.next();

        }

        // Pedir o nome do time A
        // Pedir os nomes do time A
        // Pedir o nome do time B
        // Pedir os nomes do time B (5 nomes)
        System.out.println("Informe o time A: ");
        String nomeTimeA = sc.next();
        String[] nomesPlayersTimeA = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o player " + i);
            nomesPlayersTimeA[i] = sc.next();

            System.out.println("Informe o time A: ");
            String nomeTimeB = sc.next();
            String[] nomesPlayersTimeB = new String[5];

            for (int a = 0; i < 5; i++) {
                System.out.println("Informe o player " + i);
                nomesPlayersTimeB[i] = sc.next();
            }

        }


    }
}

