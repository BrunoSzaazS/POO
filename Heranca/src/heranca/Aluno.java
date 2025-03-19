/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author 0040962213007
 */
public class Aluno extends Pessoa
{
    private String curso,ra;
    public Aluno( String nome, String rg,String curso,String ra)
    {
        super(nome,rg);
        this.curso=curso;
        this.ra=ra;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @return the ra
     */
    public String getRa() {
        return ra;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(String ra) {
        this.ra = ra;
    }
    
    @Override
    public void Print()
    {
        super.Print();
        System.out.println("\n" + "Curso: " + curso + "\n" + "Ra: "+ ra);
    }
}
