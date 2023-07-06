package examination;
class MyException extends Exception{
    private int detail;
    MyException(int a){
        detail = a;
    }
    public String toString(){
        return "Exception("+detail+")";
    }
}
public class Eception_Demo {
    static void compute(int a) throws MyException{
        System.out.println("Called compute[#"+a+"#]");
        if(a > 20)throw new MyException(a);
        System.out.println("Normal exit!");
    }
    public static void main(String [] args){
        try{
            compute(15);
            compute(21);
            compute(7);
        }catch (MyException e){
            System.out.println("Exceptiob caught :" + e.toString());
        }finally {
            System.out.println("Finally");
        }
    }
}
