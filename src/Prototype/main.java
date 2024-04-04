package Prototype;

public class main {

    public static void fillRegistry(studentRegistry s1){
        IStudent Is = new IStudent();
        Is.name = "Rid Intelligent";
        s1.register("Intelligent",Is);
        student s = new student();
        s.name = "Rid Weak";
        s1.register("batch_A_student",s);

    }
    public static void main(String[] args) {
        studentRegistry s1 = new studentRegistry();
        fillRegistry(s1);
//        student s1 = new student();
//        s1.name = "Ridhim";
//        s1.age = 27;
//        s1.batch = "2023";
//
//        student s2 = s1.copy();
//        student s3 = s1.copy();
//
//        IStudent s4 = new IStudent();
//        s4.name = "Rid";
//        s4.age = 9;
//        s4.rank = 9;
//        s4.psp = 98;
//        s4.batch = "lll";
//        IStudent s5 = s4.copy();
        student batchCopy = s1.get("batch_A_student");
        student batchCopy2 = s1.get("Intelligent");
        System.out.println("Debug");

    }
}
