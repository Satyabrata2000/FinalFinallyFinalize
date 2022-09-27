package FinalFinallyFinalize;

public class FinalVariable {

    final int a=10;
    void display(){
        System.out.println(a);;
        //a=20;
    }

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        obj.display();
    }
}
