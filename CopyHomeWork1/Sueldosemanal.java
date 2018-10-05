import javax.swing.JOptionPane;
public class Sueldosemanal{
  public static void main(String[] args) {

    double HT, PH, SS;
      HT = Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca el numero de horas trabajadas:"));
      PH = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el pago por hora"));
      SS = HT * PH;
      JOptionPane.showMessageDialog(null,"El sueldo semanal es de :" + SS);
    
  }
}
