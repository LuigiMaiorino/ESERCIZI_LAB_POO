import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                String parola;
                Scanner in = new Scanner(System.in);
                System.out.println("inserisci parola");
               parola = in.nextLine();
                InputChecker a = new InputChecker(parola);
                        a.controllo(parola);


        }
}