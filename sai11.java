class plalindromchecker{
public boolean ispal(String text){
    String clean=text.replaceAll("\\s+","").toLowerCase();
    String replaced=new StringBuilder(clean).reverse().toString();
    return clean.equals(replaced);
}
public void check(String text){
    if(ispal(text)){
        System.out.println(text+"------>palindrom");
    }else{
        System.out.println(text+"----->not palindrom");
       }
    }
}
class sai11 {
    public static void main(String[] args) {
        plalindromchecker checker=new plalindromchecker();
        checker.check("madam");
        checker.check("good");
    }
}
