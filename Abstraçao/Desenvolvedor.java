class Desenvolvedor extends Funcionario{
    private double salarioBase;
    private int HorasExtras;
    private double TaxaHoraExtra;

    public Desenvolvedor (String nome, double salarioBase, int HorasExtras, double TaxaHoraExtra){
        super(nome);
        this.salarioBase=salarioBase;
        this.HorasExtras=HorasExtras;
        this.TaxaHoraExtra=TaxaHoraExtra;
    }
@Override 
public void trabalhar(){
    System.out.println("Desenvolvedor "+nome+" está escrevendo código.");

}
@Override 
public double calcularSalario(){
    return salarioBase+(HorasExtras*TaxaHoraExtra);
}
    
}
