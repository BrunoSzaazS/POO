package exercicio1;
public class Aluno
{
    private String nome, ra;
    private int faltas;
    private double media;
    
    //Construtores
    public Pessoa(String nome, ra)
    {
        if(!nome.isEmpty())
        {
            this.nome=nome;
        }
        if(!ra.isEmpty())
        {
            this.ra=ra;
        }
        this.faltas=0;
        this.media=0;
    }
    //setter
    public void setNome(String nome)
    {
        if(!nome.isEmpty())
        {
            this.nome=nome;
        }
    }
    public void setRa(String ra)
    {
        if(!ra.isEmpty())
        {
            this.ra=ra;
        }
    }
    
    //getters
    public String getNome()
    {
        return nome;
    }
    public String getRa()
    {
        return ra;
    }
    public int getFaltas()
    {
        return faltas;
    }
    public double getMedia()
    {
        return media;
    }
    

    //funções
    public void Faltou()
    {
        this.faltas += 2;
    }
    public void Justificou(int quantidade)
    {
        this.faltas -=quantidade;
    }
    public void Provas (double p1, double p2, double sub,)
    {
        if(p1<6 || p2<6)
        {
            if(p1<p2)
            {
                this.media=(p2+sub)/2;
            }
            else
            {
                thus.media=(p1+sub)/2
            }
        }
        else
        {
            this.media=(p1+p2)/2
        }
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
