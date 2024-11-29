public class Imovel {
    private String nome;
    private String nomeCliente;
    double Valoraluguel;
    double SalarioCliente;
    
    public Imovel(){
        
    }
    

    public Imovel(String nome, String nomeCliente, double Valoraluguel, double SalarioCliente) {
        this.nome = nome;
        this.nomeCliente = nomeCliente;
        this.Valoraluguel = Valoraluguel;
        this.SalarioCliente = SalarioCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValoraluguel() {
        return Valoraluguel;
    }

    public double getSalarioCliente() {
        return SalarioCliente;
    }
    


    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Imovel i = new Imovel("apartamento", "Carlos", 800.00, 2000.00);
        
        Imovel i2 = new Imovel("Kitnet", "Paulo", 400.00, 1500.00);
        
        System.out.println("NomeImovel: " + i.getNome());
        System.out.println("NomeCliente: " + i.getNomeCliente());
        System.out.println("Valoraluguel: " + i.getValoraluguel());
        System.out.println("Salariocliennte: " + i.getSalarioCliente());
        
        System.out.println();
        
        System.out.println("NomeImovel: " + i2.getNome());
        System.out.println("NomeCliente: " + i2.getNomeCliente());
        System.out.println("Valoraluguel: " + i2.getValoraluguel());
        System.out.println("Salariocliennte: " + i2.getSalarioCliente());
        
    }
    
     
       
}
