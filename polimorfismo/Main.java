public class Main{
    public static void main(String[]args){
        CheckoutService checkout = new CheckoutService();

        FormaPagamento pagamanento1 = new PagamentoPix();
        checkout.finalizadorCompra(199.90, pagamanento1);
        System.out.println("--------------");

        FormaPagamento pagamento2= new PagamentoCartao("12345678912345678");
        checkout.finalizadorCompra(499.90, pagamento2);
        System.out.println("-------------------");

        FormaPagamento pagamento3 =new PagamentoBoleto();
        checkout.finalizadorCompra(89.90, pagamento3);
    }
}