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

        System.out.println("--------------Numeros primos---------------");
        for (int i = 0; i <num ; i++) {
            String primo = "numero primo";
            for (int j = 2; j <i ; j++) {
                if(i % j == 0){
                     primo = "nao primo";
                }
            }
            if(primo == "numero primo"){
                System.out.println(i + " " +primo);

            }
            
        }

        }

}
