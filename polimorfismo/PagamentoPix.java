
public class PagamentoPix implements FormaPagamento {
    @Override
    public void pagar(double valor){
        System.out.println("Gerador QR code PIX...");
        System.out.printf(
            "Pagamemto PIX de R$  %.2f realizando.%n",
             valor);
    }
}