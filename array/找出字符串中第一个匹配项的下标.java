package array;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/8/7 上午12:01
 **/
public class 找出字符串中第一个匹配项的下标 {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            if(isMatch(haystack.substring(i),needle)){
                return i;
            }
        }
        return -1;
    }
    public boolean isMatch(String str1,String needle){
        int len=0;
        for(int i=0;i<str1.length()&&i<needle.length();i++){
            char c = str1.charAt(i);
            if(c!=needle.charAt(i)){
                return false;
            }
            len++;
        }
        return len==needle.length();
    }
}
