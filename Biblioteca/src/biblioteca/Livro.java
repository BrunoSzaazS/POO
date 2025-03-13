/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 0040962213007
 */
public class Livro
{
    protected int numeroCopias;
    protected int copiasDisponiveis;
    protected String titulo;
    protected String volume;
    public Livro(String titulo,String volume,int numeroCopias)
    {
        this.titulo = titulo;
        this.volume = volume;
        this.numeroCopias=numeroCopias;
        copiasDisponiveis=numeroCopias;
    }
    //SETTERS
    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }
    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setVolume(String volume) {
        this.volume = volume;
    }
    //GETTERS

    public int getNumeroCopias() {
        return numeroCopias;
    }
    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getVolume() {
        return volume;
    }
    //FUNÇÕES
    protected void imprimir()
    {
        System.out.println("Titulo: " + titulo + "\n" + "Numero do volume: " + volume + "\n" + " Numero de cópias total: " + numeroCopias + "\n" + "Copias disponiveis: " + copiasDisponiveis);
    }
    protected boolean disponivel()
    {
        boolean resultado = copiasDisponiveis>0;
        return resultado;
    }
    protected boolean consultar()
    {
        if(disponivel())
        {
            copiasDisponiveis--;
            return true;
        }
        else
        {
            return false;
        }
    }
    protected boolean retornar()
    {
        if(copiasDisponiveis==numeroCopias)
        {
            return false;
        }
        else
        {
            copiasDisponiveis++;
            return true;
        }
    }
}
