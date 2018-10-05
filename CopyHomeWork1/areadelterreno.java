import javax.swing.JOptionPane;
public class areadelterreno{
  public static void main(String[] args){
    int base1, altura1, areat, base2, altura2, arear, areatotal;
    System.out.println("area del triangulo");
    base1 = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la base"));
    altura1 = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la altura"));
    areat = (base1 * altura1) /2 ;
    JOptionPane.showMessageDialog(null,"el area del triangulo es" + areat);

    System.out.println("area del rectangulo");
    base2 = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la base"));
    altura2 = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la altura"));
    arear = base2 * altura2 ;
    JOptionPane.showMessageDialog(null,"el area del rectangulo es" + arear);
    areatotal = Integer.parseInt(JOptionPane.showInputDialog(null,"area del terreno"));
    areatotal = areat + arear ;
    JOptionPane.showMessageDialog(null,"el area del terreno es" + areatotal);

  }
}
