package Design_Builder;

import java.util.Objects;

public class Form {
    String Name;
    String Email;
    int age;
    double psp;
    int gradYear;

public Form(FormHelper h){
    if(h.age < 10){
        throw  new IllegalArgumentException("Age is less");
    }
    if(Objects.equals(h.Email, "")){
        throw  new IllegalArgumentException("Email is empty!!!!!");
    }

    this.age = h.age;
    this.Name = h.Name;
    this.Email = h.Email;
    this.psp = h.psp;
    this.gradYear = h.gradYear;
}

}
