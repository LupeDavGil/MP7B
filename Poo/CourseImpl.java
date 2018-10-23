import javax.swing.*;
  public class CourseImpl{
    public static void main(String[] args) {
      Course Curso1 = new Course();
      //curso1.CourseName = "Ingles";
      /*curso1.setCourseName("Ingles");
      */
      Curso1.addStudent("Jonathan");
      Curso1.addStudent("Marlen");
      Curso1.addStudent("Alexa")

      String[] studentsDeIngles = Curso1.getStudents();
      String students = "";
      for (int i = 0; i < Curso1.getNumberOfStudents(); i++){
        students += studentsDeIngles[i] + "\n";
      }
      JOptionPane.showMessageDialog(null, students);

      Course Curso2 = new Course();
      Curso2.setCourseName ("Mate");

      Curso2.addStudent("Daniel");
      Curso2.addStudent("Moises");
      Curso2.addStudent("Andrea");

      JOptionPane.showMessageDialog(null, Curso1.getCourseName());
      //JOptionPane.showMessageDialog(null, Curso1.getStudents());
      JOptionPane.showMessageDialog(null, Curso2.getCourseName());

      Course Curso3 = new Course("Economia");
      Curso3.addStudent("Pedro");
      Curso3.addStudent("Juan");
      Curso3.addStudent("Miguel");
      */
      int opc=0;
      do {
          opc= Integer.parseInt(JOptionPane.showInputDialog(null,"1. Nuevo Curso"+" \n"+"2.Ingresa al alumno"+
          "\n" +"3.Eliminar alumno"+ "\n"+ "4.Mostrar al  alumno" ));
          switch(opc){
            case 1:
            String cn = JOptionPane.showInputDialog(null,"Nombre del Curso");
            Curso1.setCourseName();
              JOptionPane.showMessageDialog(null,Curso1.getCourseName());
              break;
            case 2:
            String as= JOptionPane.showInputDialog(null,"Ingrese el nombre de un alumno");
            Curso1.addStudent();
            break;
            case 3:
            String Alum=JOptionPane.showInputDialog(null, "\nIngrese al alumno que quiere  eliminar");
            curso1.dropStudent();
            break;
            case 4:
              JOptionPane.showMessageDialog(null,Curso2.getStudents());
            break;
          }
      }while(true);
  }
}
