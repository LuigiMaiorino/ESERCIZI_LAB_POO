import java.util.Scanner;
public class Car {
    int km , resa , litri , litri1;
        public Car (int km , int resa , int litri)
        {
            this.km = km;
            this.resa=resa;
            this.litri = litri;
            this.litri1 = litri1;
        }
        public int drive(int km , int resa , int litri)
        {
            int i=0 , count=0;
                for(i=0;i<=km;i++)
                {
                    count++;
                        if(count == resa){
                            litri--;
                                    count=0;
                        }
                }
           return litri;
        }
            public void getGas(int litri1)
            {
             System.out.println("Litri nel carburante attualmente"+litri1);
            }
            public void addGas (int litri1 , int litri)
            {
                int quantita =0;
                Scanner in = new Scanner(System.in);
                    System.out.println("quanti litri vuoi inserire il max serbatoio è 20 attualmente ne hai"+litri1);
                        quantita = in.nextInt();
                            litri1+= quantita;



            }
}

