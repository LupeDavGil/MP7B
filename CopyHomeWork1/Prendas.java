import javax.swing.JOptionPane;
public class Prendas{
  public static void main(String[] args) {

    double CM, PG;
    CM = Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca los metros de tela :"));
    PG = CM / 0.0254;
    JOptionPane.showMessageDialog(null,"Pago a realizar es de :" + PG);

  }
}
