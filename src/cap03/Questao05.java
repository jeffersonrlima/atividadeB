package cap03;

public class Questao05 {
    public static void main(String[] args) {
        int numero = 3;
        for(int contador = 1; contador<=1000; contador++){
            if (contador % numero == 0){
                System.out.println(contador);
            }
        }
    }
}
