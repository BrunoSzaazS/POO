/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;


public class LivrosTecnicos extends LivroComum
{
    boolean reservado=false;
    public LivrosTecnicos(String autor ,String titulo, String volume, int numeroCopias)
    {
        super(autor,titulo,volume,numeroCopias);
    }
    protected void Reservar()
    {
        reservado=true;
    }
    protected void Liberar()
    {
        reservado=false;
    }
    @Override
    protected boolean Emprestar()
    {
        if(!reservado)
            return super.Emprestar();
        return false;
        
    }
    @Override
    protected boolean Devolver()
    {
        if(!reservado)
            return  super.Devolver();
        return false;
    }
    @Override
    protected void imprimir()
    {
        System.out.println("Nome do autor: " + autor);
        super.imprimir();
    }
}
