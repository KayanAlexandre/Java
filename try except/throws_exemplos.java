public class throws_exemplos{
    public static double divide(double dividendo, double divisor)throws ArithmeticException{
        if(divisor==0){
            throw new ArithmeticException("Não pode ser divido por zero");
        }
        return dividendo/divisor;

    }
    public static void main(String[] args){
        double resultado;
        try{
            resultado=divide(10,0);
            System.out.println("resultado da divisão: "+resultado);
        } catch(ArithmeticException e){
            System.out.println("Exceção capturada: "+ e.getMessage());
        }
    }
}