package Design_Builder;

public class FormHelper {
    String Name;
    String Email;
    int age;
    double psp;
    int gradYear;

    int realAge;

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setName(String name) {
        Name = name;
    }

    public FormHelper setAge(int age) {
        this.age = age;
        return this;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setRealAge(int realAge) {
        this.realAge = realAge;
    }

    public String getName() {
        return Name;
    }

    public int getGradYear() {
        return gradYear;
    }

    public String getEmail() {
        return Email;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public int getRealAge() {
        return realAge;
    }
    public Form build(){
        return new Form(this);
    }
}
