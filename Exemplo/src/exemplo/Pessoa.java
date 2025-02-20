package exemplo;
public class Pessoa
{
    private String nome, cpf;
    public void setNome(String valNome)
    {
        if(!valNome.isEmpty())
        {
            this.nome=valNome;
        }
    }
    public String getNome()
    {
        return this.nome;
    }
    public void setCpf(String valCpf)
    {
        if(!valCpf.isEmpty())
        {
            this.cpf=valCpf;
        }
    }
    public String getCpf()
    {
        return this.cpf;
    }
    public void Print()
    {
        System.out.println("Nome: " + nome + "\n" + "cpf: " + cpf);
    }
    
}
