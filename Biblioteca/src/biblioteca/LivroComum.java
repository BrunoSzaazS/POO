/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 0040962213007
 */
public class LivroComum extends Livro
{ 
    protected String autor;
    public LivroComum(String autor, String titulo, String volume, int numeroCopias)
    {
        super(titulo,volume,numeroCopias);
        this.autor=autor;
    }
    protected boolean Emprestar()
    {
        return super.consultar();
    }
    protected boolean Devolver()
    {
        return super.retornar();
    }
}
