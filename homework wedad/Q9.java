public class Q9 {
    public static String removepunctuation(String s) {
         return s.replaceAll("[^a-zA-Z0-9\\s]", "");
    }
    public static void main(String[] args){
        String sentence = "Let's try , Mike!";
        String result = removepunctuation(sentence);System.out.println(result);
    }
}
/*
 اول شي استخدمت replaceAll عشان ازيل جميع علامات الترقيم من السلسله s
  طبعا replaceAll هو نمط استخدمه في التطابق

* */