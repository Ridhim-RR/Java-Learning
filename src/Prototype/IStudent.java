package Prototype;

public class IStudent extends  student implements prototype<student>{
    int psp;
    int rank;

    IStudent(){

    }
    IStudent(IStudent s){
        super(s);
        this.psp = s.psp;
        this.rank = s.rank;
    }

    public IStudent copy(){
        IStudent s = new IStudent(this);
        return  s;
    }

}
