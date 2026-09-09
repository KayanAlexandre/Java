public class Estagiario extends Funcionario {
    private double pagamento;

    public Estagiario(String nome, double pagamento){
        super(nome);
        this.pagamento = pagamento;
    }
    @Override 
public void trabalhar(){
    System.out.println("Funcionario " + nome+"está estagiando");

}
@Override 
public double calcularSalario(){
    return pagamento;
}
    
}
