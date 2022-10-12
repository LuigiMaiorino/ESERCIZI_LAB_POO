import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int tot_lattine=50 , tot_gettoni=0 , i , a=0 ,b=0;
        Scanner input = new Scanner(System.in);
        Scanner comand = new Scanner(System.in);
        VendingMachine x = new VendingMachine(tot_lattine, tot_gettoni);
        for (i = 0; i < 50; i++) {
            System.out.println("vuoi inserire gettone?");
            int s = input.nextInt();
            if (s == 1) {
                 a  = x.inserimentoGettone(tot_gettoni);
                 b = x.rimozioneLattina(tot_lattine);
                System.out.println("continuare inserimento? 1 per si 0 per no");
                int comando = comand.nextInt();
                if (comando == 1) {
                    System.out.println("TOTALE GETTONI" + a);
                    System.out.println("TOTALE LATTINE" + b);
                    continue;
                } else break;
            }

            if (s == 0) {
                System.out.println("TOTALE GETTONI"+a);
                System.out.println("TOTALE lattine"+b);
                break;
            }
        }

    }
}