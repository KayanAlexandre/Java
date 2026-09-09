abstract class Funcionario {
    protected String nome;
    public Funcionario(String nome){
        this.nome = nome;
    }
    public abstract void trabalhar();
    public abstract double calcularSalario();

}
