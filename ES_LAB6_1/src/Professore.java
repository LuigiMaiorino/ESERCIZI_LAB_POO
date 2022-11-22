import java.awt.*;

public class Professore extends Persona {
    String specialistica;
    int stipendio;

    public Professore(String nome,String cnome,int age,String specialistica, int stipendio){
        super(nome,cnome,age);
        this.stipendio=stipendio;
        this.specialistica=specialistica;
    }
    public void getStipendio()
    {
        System.out.println(stipendio);
    }
    public void getSpecialistica()
    {
        System.out.println(specialistica);
    }

}
