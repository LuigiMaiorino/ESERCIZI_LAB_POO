import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            int km=0 , resa=5 , litri=0 , litri1=0;
                    Scanner in = new Scanner(System.in);
                        Scanner in1 = new Scanner(System.in);
                            System.out.println("quanti km vuoi percorrere?");
                                km = in.nextInt();
                                    System.out.println("quanti litri puoi mettere max in macchina?");
                                        litri = in1.nextInt();
                                            Car a = new Car(km,resa,litri);
                                              litri1 = a.drive(km,resa,litri);
                                                a.getGas(litri1);
                                                a.addGas(litri1,litri);
                                                    a.getGas(litri1);
    }
}