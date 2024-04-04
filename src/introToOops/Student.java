package introToOops;

public class Student {
    String name;
      int phoneNumber;
    private int age;
   protected double psp;
    String batchName = "A";
    Instructor i;
    Student (String name, int age, double psp){
        this.name =name;
        this.age = age;
        this.psp = psp;
        this.i = new Instructor(1);
    }

    Student(Student oldStudent){
        this.name = oldStudent.name;
        this.age= oldStudent.age;
        this.psp= oldStudent.psp;
        this.batchName = oldStudent.batchName;
        this.phoneNumber = oldStudent.phoneNumber;
        this.i = oldStudent.i;
    }
    void changeBatch(String newBatchName){
        batchName = newBatchName;
    }
    void giveMockInterview(){
        System.out.println(name + "Give Mock Interview");
    }
    int getAge(){
        return  age;
    }
   void setAge(int new_age){

        if(new_age <= 0){
            System.out.println("Error");
        }
        age = new_age;
    }
}
