//سؤال 5
public class positiveint {
    public static int sumPositiveIntegers(int n){
        return (n *(n+1))/2;
    }
    public static void main(String[] args){
        int n=5 ;
        int result = sumPositiveIntegers(n);
        System.out.println("sum positive number"+n+":"+result);
    }
}
