package Construtores;
public class Pessoa
{
    private String nome, rg;
    
    //Construtores
    public Pessoa(String nome, rg)
    {
        if(!nome.isEmpty())
        {
            this.nome=nome;
        }
        if(!rg.isEmpty())
        {
            this.rg=rg;
        }
    }

    //Setters
    public void setNome(String nome)
    {
        this.nome=nome
    }
    public void setRg(String rg)
    {
        this.rg=rg
    }
    //Getters
    public String getNome()
    {
        return nome;
    }
    public String getRg()
    {
        return rg;
    }
    public void Print()
    {
        System.out.println("rg: "+ rg +"/n" + "nome: "+ nome);
    }
}