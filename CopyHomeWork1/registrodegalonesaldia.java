import javax.swing.JOptionPane;
public class registrodegalonesaldia{
  public static void main(String[] args) {

    int L;
    double PG, TG, GA;
      L = Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca el numero de litros de leche vendidos:"));
      TG = (L / 3.785);
      JOptionPane.showMessageDialog(null,"Galones que produce" + TG);
      PG = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el precio por galon"));
    GA = TG * PG;
      JOptionPane.showMessageDialog(null,"Ganancia total del dia es:" + GA);
    
  }
}
