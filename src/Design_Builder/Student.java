package Design_Builder;

public class Student {
    String Name;
    int Id;
    double psp;
    int age;
    int gradYear;
    String email;
public  Student( StudentHelper h){
    if(h.age < 10){
     throw new IllegalArgumentException("Age can't be less than 10");
    }
    if(h.getEmail() == ""){
        throw new IllegalArgumentException("Email can't be empty");
    }
    this.age = h.age;
    this.Id = h.Id;
    this.psp = h.psp;
    this.Name = h.Name;
    this.email = h.email;
    this.gradYear = h.gradYear;

}
}
