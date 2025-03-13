/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 0040962213007
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LivrosTecnicos L1 = new LivrosTecnicos("carlos","mais", "2",3);
        
        L1.Reservar();
        L1.Emprestar();
        L1.imprimir();
    }
    
}
