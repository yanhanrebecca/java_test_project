package string;
//判断是不是一个合法的邮箱
public class judge_e_mail {
    public static void main(String [] args){
        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        String str1 = "aaa@";
        String str2 = "aaaaaaa";
        String str3 = "1111@1111ffyu.dfg.com";
        //matches用于判断字符串是否和正则表达式匹配
        if (str1.matches(regex)) {
            System.out.println(str1 + "是一个合法的E_mail地址");
        }
        if (str2.matches(regex)) {
            System.out.println(str2 + "是一个合法的E_mail地址");
        }
        if (str3.matches(regex)) {
            System.out.println(str3 + "是一个合法的E_mail地址");
        }
    }
}
