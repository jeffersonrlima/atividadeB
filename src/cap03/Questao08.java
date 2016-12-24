package cap03;

public class Questao08 {
    public static void main(String[] args) {
        int fib = 0, ultimo = 1, auxiliar= 0;
        System.out.print("0, 1, ");
        while (auxiliar < 100){
            auxiliar = ultimo + fib;
            fib = ultimo;
            ultimo = auxiliar;
            System.out.print(ultimo+", ");  
        }
    }
}
