package cap03;
import javax.swing.JOptionPane;
public class Questao09 {
    public static void main(String[] args) {
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero, jovem"));
        String resposta = "";
        while(true){
            if (x == 1){
                break;
            }
            else if(x % 2 == 0){
                x = x/2;
            }
            else{
                x = 3 * x+1;
            }
            resposta += x+" - >";
        }
        JOptionPane.showMessageDialog(null, resposta);
    }
}
