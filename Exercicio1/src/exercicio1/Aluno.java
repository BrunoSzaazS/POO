package exercicio1;
public class Aluno
{
    private String nome, rg;
    private int faltas;
    private double media;
    
    //setter
    public void setNome(String nome)
    {
        if(!nome.isEmpty())
        {
            this.nome=nome;
        }
    }
    public void setRg(String rg)
    {
        if(!rg.isEmpty())
        {
            this.rg=rg;
        }
    }
    public void setFaltas(int faltas)
    {
        if(faltas>0)
        {
            this.faltas=faltas;
        }
    }
    public void setMedia(double media)
    {
        if(media>0)
        {
            this.media=media;
        }
    }
    
    //getters
    public String getNome()
    {
        return nome;
    }
    public String getRg()
    {
        return rg;
    }
    public int getFaltas()
    {
        return faltas;
    }
    public double getMedia()
    {
        return media;
    }
    public boolean Aprovado()
    {
        return media>=6 && faltas<20;
    }
    public void Print()
    {
        if(Aprovado())
        {
            System.out.println("Aprovado");
        }
        else
        {
            System.out.println("Reprovado");
        }
    }
}
