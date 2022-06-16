public class WhileCount {
    public static void main(String[] args){
        int count = 1, i =0;
        while (i <10){
            int j = 0;
            while (j<i+1){
                System.out.println(count);
                j++;
            }
            count++;
            System.out.println();
            i++;
        }
    }
}
