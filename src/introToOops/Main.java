package introToOops;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ri",4,80.00);
        s1.name = "Rid him";
        int x= s1.getAge();
        s1.setAge(12);
        Student st = new Student(s1);
        st.name="Julia";
        System.out.println("Name: " + st.name);





    }
}
