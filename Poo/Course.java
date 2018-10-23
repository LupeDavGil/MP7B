public class Course{
      private String courseName;
      private String[] students = new String[100];
      private int numberOfStudents = 0;

      int [] nomvar = new int[10];
      String [] var2 = new String[50];
      float [] var3 = new float[4];

      //constructor vacio
      public Course(){

      }
      //constructor
      public Course(String courseName){
        this.courseName = courseName;
      }

      public String getCourseName() {
        return this.courseName;
  }
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }
  public void addStudent(String student) {
    this.students[numberOfStudents] = student;
    this.numberOfStudents ++;
  }
  public void dropStudent(String student){
    for (int i=0; i <=   this.students.length-1;i++ ) {
      if (student.equals(this.students[i])) {
        this.students[i]=null;
      }else{
      }
    }
  }
  public String[] getStudents(){
  return this.students;
  }
  public int getNumberOfStudents(){
    return this.numberOfStudents;
  }
}
