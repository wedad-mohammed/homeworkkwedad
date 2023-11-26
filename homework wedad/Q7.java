public class Q7 {
    public static int SumSquares(int n){
    int sum=0;
    for( int i=1 ; i <= n ; i++){
        sum +=i*i ;
    }
    return sum;
}
    public static void main(String[] args){
        int n=8;
        int result = SumSquares(n);
        System.out.println("sum squares :"+result);
    }


}
/* 1- عرفت طريقه cos تقوم بحساب n وتاخذ عدد صحيح ومجموع تربيعات الاعداد الموجبه وهيئة متغير sum=0
نفس الشي سويت for من1 الى n وفي كل تكرار راح يحسب تربيع العددi*i
 واستخدام i واضافته في المجموع النهائي وmain حددت له n واستدعيت cssاختصار للفوق
  عشان يحسب لي المجموع ويخزن النتيجه في متغير result ويطبع النتيجه
*
*
* */

