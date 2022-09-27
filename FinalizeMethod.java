package FinalFinallyFinalize;

public class FinalizeMethod {

    public static void main(String[] args) {

        FinalizeMethod obj = new FinalizeMethod();

        //printing the hashcode
        System.out.println("Hashcode is : " + obj.hashCode());
        obj = null;
        //calling the garbage collector using gc()
        System.gc();
        System.out.println("End of Garbage Collection");
    }
    //defining the finalize method
    protected void finalize(){
        System.out.println("Called the finalize method");
    }
}
