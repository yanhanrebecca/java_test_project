package exception;

public class HellowWorldEx {
    public static void main(String[] args){
        int i = 0;
        String[] greetings = {"hellow", "ok", "hi"};
        while(i < 4){
            try{
                System.out.println();
                System.out.println(greetings[i]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("re_setting index value");
                break;
            }
            catch(Exception e){
                System.out.println(e.toString());
                break;
            }
            finally {
                System.out.println("This is always printed");
            }
            i++;
        }
        System.out.println("programm ...");

    }
}
