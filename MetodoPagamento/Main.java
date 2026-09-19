import java.math.BigDecimal;

public class Main{
  public static void main(String[] args){
    Checkout carrinho= new Checkout();
    BigDecimal valorCompra= new BigDecimal("150.00");

    // Usando Cartão com limite suficiente
    MetodoPagamento cartao=new PagamentoCartao(valorCompra,"1234-5678","123", new BigDecimal("500.00));
    carrinho.fanalizarCompra(cartao);

    //Usando Pix
    MetodoPgamanto pix=new PagamentoPix(valorCompra);
    carrinhofinalizarCompra(pix);
  }
}
