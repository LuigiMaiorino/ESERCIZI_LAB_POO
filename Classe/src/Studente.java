public class Studente {
    public Studente (double a , double b , double c)
    {
        double a1 = a;
            double b1 = b;
                double c1=c;
    }
    public void media (double a1 , double b1 , double c1)
    {
        double tot=0 , avg =0;
            tot = a1+b1+c1;
                avg = tot / 3;
                System.out.print("media dei voti:"+avg);

    }
}
