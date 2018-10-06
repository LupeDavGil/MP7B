import javax.swing.JOptionPane;
public class CantidadesProporc{
  public static void main(String[] args) {
    int Ct1A, Ct2B, Ct3C, M ;
    Ct1A = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el primer valor : "));
    Ct2B = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el segundo valor : "));
    Ct3C = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el tercer valor : "));
    if (Ct1A>Ct2B && Ct1A>Ct3C){
    JOptionPane.showMessageDialog(null,"valor mayor es : " + Ct1A);
  }else if ( Ct2B>Ct1A && Ct2B>Ct3C){
    JOptionPane.showMessageDialog(null,"valor mayor es : " + Ct2B);
  }else{
    JOptionPane.showMessageDialog(null,"valor mayor es : " + Ct3C);
  }
 }
}
