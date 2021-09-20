package atividadesPraticas;

public class EstruturaFor02 {
    public static void main(String[] args) {
        int div = 0, num = 150;
        
        System.out.println("**************NUMERO PARES******************");

        for (int i = 0; i <100 ; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
            
        }

        System.out.println("Numeros primos");
        for (int i=1 ; i<=num ; i++) {
            if(num % i == 0){
                div++;

            }
            if(div == 2){
                System.out.println(i+" é primo");
            }else{
                System.out.println(i+" não é primo");
            }
        }

        }

}
