package cap03;

public class Questao06 {
    public static void main(String[] args) {
        int fatorial = 1;
        System.out.println("O fatorial de 0 é "+ fatorial);
        for(int contador = 1; contador <=10; contador++){
            System.out.println("O fatorial de "+ contador+ " é ("+(contador-1)+ "!) *"+ contador + " = "+ fatorial * contador);
            fatorial *= contador;
        }
    }
}
