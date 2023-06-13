package examination;

class  Bird{
    public void fly(){
        System.out.println("Bird fly!");
    }
}
public class  TBird  extends  Bird {
    public void fly (){
        System.out.println("TBird  fly!");
    }
    public static void main(String args[]){
        Bird  bird=  new  TBird ();
        bird.fly();
    }
}