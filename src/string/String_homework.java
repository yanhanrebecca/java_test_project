/*
两个字符串 s 和 sub ，请你在 s 字符串中找出 sub 字符串出现的第一个位置（下标
从 0 开始）。如果不存在，则返回 -1 。
要求：完成类index中的indexOf函数，不能使用已知的子串定位操作方法，可以使用图片上传。
 */
package string;
public class String_homework {
    public static int indexOf(String s, String sub) {
        //返回串sub在串s中首次出现的位置，如果不存在，则返回-1
        for(int i = 0; i < s.length(); i++){
            //从s中截取和sub长度一样的字符串，和sub比较，子串相同即找到，不相等再比较下一个新的字符串，直到找到或找不到
            for(int j = 0; j < sub.length(); j++){
                if (s.charAt(i + j) != sub.charAt(j)){
                    break;
                }
                if (s.charAt(i + j) == sub.charAt(j) && j != sub.length() - 1){
                    continue;
                }
                if (s.charAt(i + j) == sub.charAt(j) && j == sub.length() - 1){
                    return i;
                }
            }}
        return -1;
    }
    public static void main(String [] args){
        String s = "This is a book.";
        System.out.println(indexOf(s, "is"));
    }
}