public class Tercerizado extends Funcionario {
    private double valorHora;
    private int HorasTrabalhadas;

    public Tercerizado(String nome, double valorHora, int HorasTrabalhadas){
        super(nome);
        this.valorHora=valorHora;
        this.HorasTrabalhadas=HorasTrabalhadas;

    }
@Override
public void trabalhar(){
    System.out.println("Tercerizado "+ nome+" está realizando tarefas tercerizadas");

}   
@Override
public double calcularSalario(){
    return valorHora*HorasTrabalhadas;
} 
}
