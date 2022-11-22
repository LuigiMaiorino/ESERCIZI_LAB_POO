import java.util.Enumeration;
import java.util.Scanner;

public class Studente extends Persona {

    int num_assenze;

    public Studente(String nome, String cnome, int age, int num_assenze) {
        super(nome, cnome, age);
        this.num_assenze = num_assenze;

    }

    public int Increment(int num_assenze) {
        Scanner in = new Scanner(System.in);
        int comand;
        System.out.println("Vuoi aggiungere un'assenza?");
        System.out.println("inserire 1 per si 0 per no");
            comand = in.nextInt();

        if (comand == 1) {
            num_assenze++;
            this.num_assenze=num_assenze;
        }
        if (comand == 0) {
            num_assenze--;
            this.num_assenze=num_assenze;
        }

return num_assenze;
    }
    public void getNumAssenze(int num_assenze)
    {
        System.out.println(num_assenze);
    }
}

