package exercicio1;
public class Exercicio1
{
    public static void main(String[] args)
    {
        Aluno a = new Aluno("carlos", "123456789");
        a.Faltou();
        a.Justificou(3);
        a.Provas(5,6,0);
        a.Print();
    }
}
