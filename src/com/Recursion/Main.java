package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	  Chef would like to estimate the difference between these strings. Let's assume
	  that the first string is named S1, and the second S2. The unreadable symbols are
	  specified with the question mark symbol '?'. The difference between the strings equals
	  to the number of positions i, such that S1i is not equal to S2i, where S1i and S2i denote
	  the symbol at the i the position in S1 and S2, respectively.

      Chef would like to know the minimal and the maximal difference between the two strings,
      if he changes all unreadable symbols to lowercase Latin letters. Now that you're fully aware
      of Chef's programming expertise, you might have guessed that he needs you help solving this problem
      as well. Go on, help him!

      Input
      The first line of the input contains an integer T denoting the number of test cases. The description
      of T test cases follows.

      The first line of a test case contains a string S1.

      The second line of a test case contains a string S2.

      Both strings consist of lowercase Latin letters and question marks in places where the symbols are unreadable.

      Output
      For each test case, output the minimal and the maximal difference between two given strings separated with
      a single space.

      Constraints
      1 ≤ T ≤ 100
      1 ≤ |S1|, |S2| ≤ 100
      Subtask 1 (25 points): |S1| = 1
      Subtask 2 (10 points): neither S1 nor S2 contains unreadable symbols
      Subtask 3 (65 points): 1 ≤ |S1|, |S2| ≤ 100
      Example
      Input:
      3
      a?c
      ??b
      ???a
      ???a
      ?abac
      aba?w

      Output:
      1 3
      0 3
      3 5
	 */
    Scanner sc = new Scanner(System.in);
    int t;
    String str1,str2;
    t = sc.nextInt();
    for(int i=0;i<t;i++){
        str1 = sc.next();
        str2 = sc.next();
        chefAndTwo(str1,str2);
    }
    }
    public static void chefAndTwo(String str1,String str2){
        int min=0,max=0;
        for(int i=0;i< str1.length();i++){
            if(str1.charAt(i)=='?'||str2.charAt(i)=='?'){
                max = max+1;
            }
            else if(str1.charAt(i)!=str2.charAt(i)){
                min = min+1;
                max = max+1;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
// in this according to the problem if the index are different then min amd max will increase by 1.

