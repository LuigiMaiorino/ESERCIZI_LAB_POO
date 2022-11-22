public class Persona {
    String nome;
    String cnome;
    int age;
    public Persona(String nome, String cnome, int age)
    {
        this.nome=nome;
        this.cnome=cnome;
        this.age=age;
    }


    public void getNome(){
        System.out.println(nome);

    }
    public void getCnome()
    {
        System.out.println(cnome);
    }
    public void getAge()
    {
        System.out.println(age);
    }
}
