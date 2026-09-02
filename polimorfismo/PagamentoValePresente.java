public class PagamentoValePresente implements FormaPagamento{
    @Override
    public void pagar(double valor){
        System.out.printf("Utilizando R$ %2.f do vale-presente.%n",valor);
    }
    
}
