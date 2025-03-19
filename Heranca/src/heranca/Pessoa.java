/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

public class Pessoa 
{
    protected String nome,rg;
    Pessoa(String nome, String rg)
    {
        this.nome=nome;
        this.rg=rg;
    }
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
    
    //getters
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
        System.out.println("Nome: " + nome + "\n" + "Rg: " + rg);
    }
    
}

