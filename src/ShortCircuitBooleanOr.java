public class ShortCircuitBooleanOr {
    public static void main(String[] args){
        int i  = 5, c = 7;
        if((i < 2) || (c ++<10)) c+=2;
        System.out.println(c);
    }
}
