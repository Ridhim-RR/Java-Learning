package Prototype;

public class student implements prototype<student>{
    int age;
     String batch;
     String name;

     student(){

     }
     student (student s){
         this.age = s.age;
         this.batch = s.batch;
         this.name = s.name;
     }
    public student copy(){
    student s1 = new student(this);
    s1.age = this.age;
    s1.batch = this.batch;
    s1.name = this.name;
    return  s1;
    }
}
