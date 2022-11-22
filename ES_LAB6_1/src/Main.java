public class Main {
    public static void main(String[] args) {
        Studente a = new Studente("luigi","maiorino" ,24,12);
        Professore b = new Professore("mario","rossi",54,"lettere",1200);
        int num;
        System.out.println(a.nome);
        System.out.println(a.cnome);
        a.getNome();
        a.Increment(a.num_assenze);
        a.getNumAssenze(a.num_assenze);

        b.getSpecialistica();
    }
}