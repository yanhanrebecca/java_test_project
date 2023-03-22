package string;

public class test1 {
    public static void main(String[] args){
        //String用于创建不可改变字符串
        String s = "This is a book.";
        int iii = s.indexOf("this", 5);
        //去字符串空格
        String s_trim = s.trim();
        //取出某个字符
        char c = s.charAt(0);
        int i = s.length();
        //取子串
        String sub_s = s.substring(8);
        //引用
        String s1 = s.toUpperCase();
        String s2;
        s2 = s.replace("!", ".");
        System.out.println("sub_s = " + sub_s);
        System.out.println("s1 = " + s1);
        System.out.println("s2 =" + s2);
        System.out.println("s = " + s);
        // StringBuffer用于创建可改变的字符
        StringBuffer ss = new StringBuffer("drink java!");
        ss.insert(6, "Hot ");
        System.out.println("ss = " + ss);
        ss.setCharAt(0, 'D');
        System.out.println("ss = " + ss);
        String s_int = "1234";
        //使用了包装类integer,i=(int)s_int
        i = Integer.parseInt(s_int);
        System.out.println(i);
    }
}
