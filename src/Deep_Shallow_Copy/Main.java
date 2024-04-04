package Deep_Shallow_Copy;

public class Main {
    public static void main(String[] args) {
        shallow obj1 = new shallow();
        obj1.age = 29;
        obj1.name= "Ridhim";

        shallow obj2 = obj1;
        obj2.age = 99;
        obj1.name="monu";
        System.out.println(obj1);
        System.out.println(obj2);

    }
}
