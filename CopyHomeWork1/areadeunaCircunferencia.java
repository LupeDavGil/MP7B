import javax.swing.JOptionPane;
public class areadeunaCircunferencia{
   public static void main(String[] args) {

    double radio, area;
    double pi = 3.14;
    radio= Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa  el radio:"));
    area = (radio*radio) * pi;
    JOptionPane.showMessageDialog(null,"El area es" + area);
    
  }
}
