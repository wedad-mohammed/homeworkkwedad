//سؤال 4
public class even {
    public static boolean isEven(int i){
        return (i & 1)==0;
    }
    public static void main(String[]args){
        int number= 6;
        boolean result = isEven(number);
        System.out.println("is the num odd?"+result);
    }
}
