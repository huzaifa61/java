public class UpperCase {
    public static void main(String[] args){
        String str = "abcz";
        String nstr = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i)<= 'z'){
                nstr+= (char)(str.charAt(i)-('a'-'A'));
            }
        }
        str = nstr;
        System.out.print(str);
    }
}
