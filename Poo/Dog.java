public class Dog{
  //Properties or atributos
  public String color;
  public String eyecolor;
  public Double height;
  public Double length;
  public Double weight;

  //Methods o beheviors
  public String sit(){ return "estoy sentado";
  //System.out.println("Estoy sentado");
  }
  public void bark(){
  System.out.println("wauff wauff wauff");
  }
  public void layDown(String datos){
    System.out.println(datos + "Estoy recostado");
  }
  public void eat(){
  System.out.println("I am eating");
  }
  public void sleep(){
    System.out.println("zzzZZZZzzz");
  }
}
