package FinalFinallyFinalize;

public class FinallyBlock {

    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            int data = 50/0;
            System.out.println(data);
        } catch(ArithmeticException e){
            System.out.println("Exception Handled");
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block execution");
        }
    }
}
