import javax.swing.JOptionPane;
public class Langosta{
  public static void main(String[] args) {
    
    int NP,TOT;

NP = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la cantidad de personas : "));
if (NP>300){
  TOT = NP * 75;
  JOptionPane.showMessageDialog(null,"Total a pagar de la langosta : " + TOT);
}else if (NP>200 && NP <=300){
  TOT = NP * 85;
  JOptionPane.showMessageDialog(null,"Total a pagar de la langosta : " + TOT);
}else{
  TOT = NP * 95;
  JOptionPane.showMessageDialog(null,"Total a pagar de la langosta : " + TOT);
  }
 }
}
