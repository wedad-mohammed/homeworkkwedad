public class Q8 {
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String input = "welcomeee";
        int vowelCount = countVowels(input);
        System.out.println(" Hoe many vowels ? " + vowelCount);
    }
}

/*
استخدمنا حلقه for-each ع str الحروف اللي في السلسله
في كل تكرار يتم فحص م اذا كان حرف متحرك indexOf(c)
 افحص القيمه واذا كان الحرف هو vowels حرف متحرك راح يزيد
  العداد وفي النهايه يرجع العداد اللي يحتوي ع حروف متحركه
   وmain في
  \طريقه input عشان نحسب عدد الحروف المتحركه في السلسه

 */
