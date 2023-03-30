//天体类
package Object_oriented1;
public class Body {
    public long idNUM;//唯一标识天体
    public String nameFor= "unnamed";//天体名字
    public Body oribits = null;//环绕天体
    public static long nextID = 0;//下一个天体号
    Body(){
        idNUM = nextID++;
    }
    Body(String bodyNAME, Body oribitsAround){
        this();
        nameFor = bodyNAME;
        oribits = oribitsAround;
    }
    public static void main(String [] args){
        Body sun = new Body("Sun", null);
        Body earth = new Body("Earth", sun);
        Body xxx = new Body();
        System.out.println(xxx.idNUM + " " + xxx.nameFor);
        System.out.println(earth.oribits.nameFor);
        System.out.println(Body.nextID);
    }
}
