/*
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Explanation 1

Character	Frequency: anagramm	Frequency: marganaa
A or a	3	4
G or g	1	1
N or n	1	1
M or m	2	1
R or r	1	1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character	Frequency: Hello	Frequency: hello
E or e	1	1
H or h	1	1
L or l	2	2
O or o	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Language
Java 8
More
29303132333435363738394041424344454647484950515253
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length())
            return false;
            
        char[] aArr=a.toUpperCase().toCharArray();
…    }
}

Line: 53 Col: 1

Test against custom input
Java
You have earned 10.00 points!
You are now 97 points away from the gold level for your java badge.
3%153/250
Congratulations
You solved this challenge. Would you like to challenge your friends?Share on FacebookShare on TwitterShare on LinkedIn

Test case 0

Test case 1

Test case 2

Test case 3

Test case 4

Test case 5

Test case 6

Test case 7

Test case 8

Test case 9

Test case 10

Test case 11

Test case 12

Test case 13

Test case 14

Test case 15

Test case 16
Compiler Message
Success
Input (stdin)
anagram
margana
Expected Output
Anagrams

*/



import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length())
            return false;
            
        char[] aArr=a.toUpperCase().toCharArray();
        char[] bArr=b.toUpperCase().toCharArray();
        
        for(int i=0;i<aArr.length-1;i++){
            for(int j=0;j<bArr.length-i-1;j++){
            if((int)aArr[j]>(int)aArr[j+1]){
                char temp=aArr[j];
                aArr[j] = aArr[j+1];
                aArr[j+1]=temp;
            }
            }
        }
        
        String s1= new String(aArr);
        // System.out.println(s1);
        
        for(int i=0;i<bArr.length-1;i++){
            for(int j=0;j<bArr.length-i-1;j++){
            if((int)bArr[j]>(int)bArr[j+1]){
                char temp=bArr[j];
                bArr[j] = bArr[j+1];
                bArr[j+1]=temp;
            }
            }
        }
        String s2=new String(bArr);
        // System.out.println(s2);
        
        if(s1.equals(s2))
            return true;
        return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
