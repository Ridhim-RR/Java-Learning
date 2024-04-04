package Design_Builder;

public class Main {
    public static void main(String[] args) {
     StudentHelper h = new StudentHelper();
     h.setAge(90);
     h.setEmail("rid@gmail.com");
     Student s = h.build();
//     Student s = new Student(h);
     System.out.println(s);

//     Form f = new Form();
     FormHelper f = new FormHelper().setAge(12);
//     f.setAge(100);
     f.setEmail("email");
     f.setRealAge(222);
    Form ss= f.build();
//     Form ss = new Form(f);
     System.out.println(ss+"SSSSS");
    }
}
