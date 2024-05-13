import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest=s.substring(s.length()-k, s.length());
        largest=s.substring(s.length()-k, s.length());
        
        for(int i=0;i<s.length()-k;i++){            
        String temp= s.substring(i, i+k);
        int res=smallest.compareTo(temp);
        int res2=largest.compareTo(temp);
        
        if(res>0)
            smallest=temp;            
        if(res2<0)
            largest=temp;
        }
        
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
