package estacionamento;
public abstract class Carro 
{
    int idCarro, placa;
    String anoFabricacao, modelo, vendedor;
    double valorVenda;
    boolean disponivel;
    
    public Carro()
    {
        vendedor = "";
        disponivel=true;
    }
    public boolean disonivel()
    {
       return disponivel;
    }

    public abstract boolean venderCarro(double valor);
    public abstract boolean oferta(String vendedor, double valorVenda);
    public void imprimeDados()
    {
      System.out.println("ID: "+ idCarro + "\n Placa: " + placa + "\n Ano de fabricação: " + anoFabricacao + "\n modelo: " + modelo);
      
    }
}
