import javax.swing.JOptionPane;
public class ValordeNumeros{
  public static void main(String[] args){

    int Numero1, Numero2;
    Numero1= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el primer numero:"));
    Numero2= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el segundo numero:"));

    if (Numero1>Numero2){
      JOptionPane.showMessageDialog(null,"El numero mayor es: " + Numero1);
    }else{
      JOptionPane.showMessageDialog(null,"El numero mayor es: " + Numero2);
    }

  }
 }
