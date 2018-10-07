import javax.swing.JOptionPane;
public class Trajes{
  public static void main(String[] args) {

    double PF, DE;
   double CT = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar el precio del Traje : "));


    if (CT >=2500){
      DE = (CT * 15) / 100;
      PF = CT - DE;
      JOptionPane.showMessageDialog(null,"Precio final del Traje es : "+ PF);
    }else{
      DE = (CT * 8) / 100;
      PF = CT - DE;
      JOptionPane.showMessageDialog(null,"Precio final del Traje es : " + PF);
     }
   }
}
