import java.math.BigDecimal;

class PagamentoCartao extends MetodoPagamento {
    private String numeroCartao;
    private String cvv;
    private BigDecimal limiteDisponivel;

    public PagamentoCartao(BigDecimal valor, String numeroCartao,String cvv, BigDecimal limiteDisponivel ){
        super(valor);
        this.numeroCartao= numeroCartao;
        this.cvv= cvv;
        this.limiteDisponivel = limiteDisponivel;
    }
@Override 
public boolean processar(){
    System.out.println("Validando comunicação com a adquirinte do cartão...");
    if(this.limiteDisponivel.compareTo(this.valor) >=0){
        this.limiteDisponivel= this.limiteDisponivel.subtract(this.valor);
        this.status="APROVADO";
        System.out.println("Pagamento no Cartão aprovado. Valor:"+this.valor);
        return false;
    }
}
}
