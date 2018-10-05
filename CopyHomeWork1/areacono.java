import javax.swing.JOptionPane;
public class areacono{
  public static void main(String[] args) {

    double radio, area1, areasemi, cateto1, cateto2, a, b, hipotenusa, area2, areafigura ;
    double pi = 3.1416;

      radio = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce radio :"));
      area1 = (radio*radio) * pi;
      areasemi = area1/2;
      JOptionPane.showMessageDialog(null,"El area es" + areasemi);

      cateto1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el cateto faltante para calcular hipotenusa"));
      cateto1= radio;
      cateto2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el cateto2"));
    
    a = Math.sqrt(cateto1);
    b = Math.sqrt(cateto2);
    hipotenusa = a + b;
      JOptionPane.showMessageDialog(null,"la hipotenusa es" + hipotenusa);
    area2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Area del triangulo"));
     area2 = ((cateto1*2) * cateto2) /2;
     JOptionPane.showMessageDialog(null,"el area del triangulo es" + area2);
     areafigura= Integer.parseInt(JOptionPane.showInputDialog(null,"calcula el area de la figura"));
     areafigura = areasemi + area2;
     JOptionPane.showMessageDialog(null,"Area de la Figura es " + areafigura);
    }
  }
