import javax.swing.JOptionPane;
public class areadeunrectangulo{
  public static void main(String[] args) {
    int base, altura, area;
    base = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la base: "));
    altura = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la altura:"));
    area = base * altura ;
    JOptionPane.showMessageDialog(null,"el area es:"+ area);
  }
}
