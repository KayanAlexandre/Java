
public class PagamentoBoleto implements FormaPagamento {
    @Override
    public void pagar(double valor){
        System.out.println("Boleto gerado...");
        System.out.printf(
            "seu boleto tem o valor de R$  %.2f.%n",
             valor);
    }
}
