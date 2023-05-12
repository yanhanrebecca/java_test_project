package examination;

////创建一个字符串，然后通过","，将字符串分割成字符串数组，并且将字符串数组中的元素每个都输出出来
public class str_division_practice {
    public static void main(String [] args){
        String str = "cdds,vfef,grtgr,hyrt,qdswd";
        String[] str_1 = str.split(",");
        for (String s : str_1) {
            System.out.println(s);
        }
        String[] str_2 = str.split(",", 3) ;
        System.out.println("---------------------------------");
        for (String s : str_2){
            System.out.println(s);
        }
    }
}
