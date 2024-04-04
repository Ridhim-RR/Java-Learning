package Design_Builder;

public class StudentHelper {
    String Name;
    int Id;
    double psp;
    int age;
    int gradYear;
    String email;

    public double getPsp() {
        return psp;
    }

    public int getAge() {
        return age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public int getId() {
        return Id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }
    public  Student build(){
        return  new Student(this);
    }
}

