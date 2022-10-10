import java.util.*;

public class Question5 {
    static class LargerNumberComparator implements Comparator<String> {

        public int compare(String a, String b) {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        }
    }
    public static String largestNumber(int[] arr) {

        String[] s = new String[arr.length];

        for (int i=0;i <arr.length;i++) {
            s[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(s, new LargerNumberComparator());

        if(s[0].equals("0"))
            return "0";

        String res = new String("");
        for (String str : s) {
            res+=str;
        }
        return res;
    }
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = obj.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array Elements:");

        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("Output: "+largestNumber(arr));
    }
}
