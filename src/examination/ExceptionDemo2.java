package examination;
class MyException2 extends Exception{
    private int detail;
    MyException2(int a){
        detail = a;
    }
    public String toString(){
        return "MyException{"+detail+"}";
    }
}
public class ExceptionDemo2 {
    static void compute(int a)throws MyException2{
        System.out.println("Called compute["+a+"]");
        if(a > 10)throw new MyException2(a);
        System.out.println("Normal exit!");
    }
    public static void main(String [] args){
        try{
            compute(3);
            compute(21);
            compute(7);
        }catch (MyException2 e){
            System.out.println("Exceptiob caught :" + e.toString());
        }
    }
}
