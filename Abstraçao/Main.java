public class Main {
    public static void main(String []args){
        Funcionario[]Funcionario=new Funcionario[4];
        Funcionario[0]=new Desenvolvedor("Asafe ",40_000.0, 10, 50.0);
        Funcionario[1]=new Gerente("Alexandre ",50_000.0, 1500.0);
        Funcionario[2]=new Estagiario("Larissa ",3_000.0);
        Funcionario[3]=new Tercerizado("Caio ",25.0, 160);
        for(Funcionario emp : Funcionario){
            emp.trabalhar();
            System.out.println("Salario: R$"+emp.calcularSalario());
            System.out.println("--------------------------");
        }
    }
    
}
