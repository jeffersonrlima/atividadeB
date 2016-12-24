package cap03;

public class Questao07 {
    public static void main(String[] args) {
        long fatorial = 1;
        System.out.println("O fatorial de 0 é "+ fatorial);
        for(int contador = 1; contador <=20; contador++){
            System.out.println("O fatorial de "+ contador+ " é ("+(contador-1)+ "!) *"+ contador + " = "+ fatorial * contador);
            fatorial *= contador;
        }
    }
} // sem o long os valores muito grandes eram igual a 0
