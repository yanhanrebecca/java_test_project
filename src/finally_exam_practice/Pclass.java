package finally_exam_practice;

public class Pclass {
    private String name;
    private String blood;
    public static int count = 0;
    public Pclass(String name){
        this.name = name;
        count++;
    }
    public Pclass(String name, String blood){
        this.name = name;
        this.blood = blood;
        count++;
    }
    public void showBlood(){
        System.out.println(blood);
    }
    public String getBlood(){
        return blood;
    }
    public void setBlood(String blood){
        this.blood = blood;
    }
    public static int getCount(){
        return Pclass.count;
    }
    public static void main(String [] args){
        Pclass a = new Pclass("yanhan","b");
        String a_blood = a.getBlood();
        System.out.println(a_blood);
        a.setBlood("A");
        String a_change_blood = a.getBlood();
        System.out.println(a_change_blood);
        System.out.println(Pclass.getCount());
    }

}
