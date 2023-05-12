package string;

public class TestEqual {
    public static void main(String[] args){
        //字符串比较的集中对比
        String s1 = new String("abc");
        String s2 = new String("ABC");
        String s3 = new String("abc");
        //int address1 = System.identityHashCode(s1);
        //System.out.println(address1);
        boolean b2 = s1.equalsIgnoreCase(s2);
        boolean b = s1.equals(s2);
        System.out.println(s1 + " equal " + s2 + " :" + b);
        System.out.println(s1 + " equalsIgnoreCase " + s2 + " :" + b2);
        b = (s1 == s3);
        //s1 == s3 false？？？原因是两个等号判断的是字符串的地址是否相等，字符串关于值的判断要用equals
        System.out.println("s1 == s3 " + b);
        String s4 = "abc";
        String s5 = "abc";
        String s6 = "abcd";
        b = (s4 == s5);
        System.out.println("s4 == s5 " + b);
        b = (s5 == s6);
        System.out.println("s5 == s6 " + b);
        s6 = "abc";
        b = (s5 == s6);
        System.out.println("*********************s5==s6 " + b);
        String  str = "abcd";
        System.out.println(str.compareTo("cat"));
    }
}
