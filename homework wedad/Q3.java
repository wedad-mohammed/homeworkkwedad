//سؤال 3
public class multiple {
    public static boolean isMultiple(long n , long m){
        if(m==0){
            throw new ArithmeticException("divisor cannot be zero ");

        }
        return n%m==0;
    }
    public static void main(String[] args){
        long n=12;
        long m=4;
        boolean result = isMultiple(n , m);
        System.out.println("Is an multiple of m :"+result);
    }
}
