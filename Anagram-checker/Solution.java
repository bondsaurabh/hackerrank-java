import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        sc.close();
        boolean anagram = isAnagram(first, second);
        System.out.println(anagram ? "Anagram" : "Not Anagram");
    }
    
    private static boolean isAnagram(String first, String second){
        // Check if length is equal
        //take letters in char array, sort them and compare
        if(first.length() != second.length())
            return false;
        char[] a = first.toCharArray();
        char[] b = second.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        if(Arrays.equals(a,b))
            return true;
        else 
            return false;
        
    }
}
