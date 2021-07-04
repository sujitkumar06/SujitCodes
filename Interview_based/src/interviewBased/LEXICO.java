package interviewBased;
import java.util.Scanner;

public class LEXICO {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        String check="";
        for(int i=0;i<s.length()-k+1;i++){
          check=s.substring(i,i+k);
           if(check.compareTo(smallest)>0)
           largest=check;
           if(check.compareTo(largest)<0)
           smallest=check;
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

