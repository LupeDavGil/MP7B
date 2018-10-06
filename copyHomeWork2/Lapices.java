import javax.swing.JOptionPane;
public class Lapices{
  public static void main(String[] args) {

    int x,Pag;
    x = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de Lapices: "));
    if (x>1000){
      Pag = (x * 85);
      JOptionPane.showMessageDialog(null,"Cantidad de Lapices a pagar es : " + Pag);
      }else{
        Pag = (x * 90);
        JOptionPane.showMessageDialog(null,"Cantidad de Lapices a pagar es : " + Pag);
    }
  }
}
