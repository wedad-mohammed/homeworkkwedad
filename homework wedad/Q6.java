public class Q6 {
    public static int OddSum(int n){
        int sum = 0;
        for( int i=1 ; i <= n ; i++){
            if (i%2 != 0){
                sum +=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int n=10;
        int result = OddSum(n);
        System.out.println("Sum odd numbers to"+" "+n+" :  "+result);
    }

/* اول شي سويت في الكود
1- عرفت الطريقه الي تاخذ عدد  calcuateOddSum وتقوم بحساب مجموعه الاعداد الفرديه الصحيحه n
2- بعدها sum=0 هيئة المتغير
3-واستخدمت for من 1 الى n
4-طبعا في كل تكرار اتحقق اذا كان العدد فردي باستخدام القسمه ....واذا كان العدد فردي اضيفه للمجموعsum
5-بعدها ارجع المجموع النهائي
6-في main اعين قيمه n الى قيمه محدده ك مثال
7- في النهايه استدعي calculateOddSum عشان تحسب المجموع وتخزن لي النتيجه في متغير اسمه result واطبع الناتج
 */




}

