import javax.swing.JOptionPane;
public class Pagodeagua{
  public static void main(String[] args) {

    double A, L, N, CM, V, PAG;
    System.out.println("Calcular el volumen");
      L = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el largo de la alberca"));
      N = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el ancho de la alberca"));
      A = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la altura de la alberca"));
      V = L * N * A;
    JOptionPane.showMessageDialog(null,"El volumen es " + V);
      CM = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el costo por metro cubico"));
      PAG = V * CM;
      JOptionPane.showMessageDialog(null,"Pago a realizar es de :" + PAG);
    
  }
}
