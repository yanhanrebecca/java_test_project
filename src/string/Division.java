package string;
//创建一个字符串，然后通过","，将字符串分割成字符串数组，并且将字符串数组中的元素每个都输出出来
public class Division {
    public static void main(String [] args){
        String str = new String("abc,deff,ghi,jds");
        String[] newstr = str.split(",");
        for(int i = 0; i < newstr.length; i++){
            System.out.println(newstr[i]);
        }
        String[] newstr2 = str.split(",", 2);
        for(int j = 0; j < newstr2.length; j++){
            System.out.println(newstr2[j]);
        }
    }
}
