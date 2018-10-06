import javax.swing.JOptionPane;
public class PositNegati{
  public static void main(String[] args) {

    int Numero1;
    Numero1= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el primer número"));
    if (Numero1>0){
      JOptionPane.showMessageDialog(null,"El número es positivo"+Numero1);
    }else{
    JOptionPane.showMessageDialog(null,"El número es negativo" + Numero1);
    }
  }
}
