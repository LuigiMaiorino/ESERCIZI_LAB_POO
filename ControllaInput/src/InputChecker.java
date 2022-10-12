import java.util.Scanner;
public class InputChecker{
        String parola;
    public InputChecker(String parola) {
        this.parola=parola;
    }

    public void controllo(String parola) {
        if (parola.equals("si") || parola.equals("s")) {
            System.out.println("input corretto per il si");}
               else if (parola.equals("no") || parola.equals("n")){
                System.out.println("input corretto per il no");}
            else
                System.out.println("input non corretto");


        }
    }


