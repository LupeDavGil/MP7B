import javax.swing.JOptionPane;
public class DogImplement{
  public static void main(String[] args) {
    Dog fido = new Dog();
    fido.color ="black";
    fido.eyecolor ="blue";
    fido.height = 0.50d;
    fido.weight = 30.0d;

    Dog chilaquil = new Dog();
    chilaquil.color ="brown";
    chilaquil.eyecolor ="green";
    chilaquil.height = 0.78d;
    chilaquil.weight = 25.0d;

    JOptionPane.showMessageDialog(null,"FIDO es de color: " + fido.color);

    JOptionPane.showMessageDialog(null,"chilaquil es de color: " + fido.color);

    System.out.println( fido.sit());

    fido.layDown("my name is Fido");
    fido.sleep();
  }
}
