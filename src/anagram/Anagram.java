package anagram;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string-1");  //getting the first string value from user using scanner
        String str1 = scan.next();
        System.out.println("enter string-2");  //getting the second string value from user using scanner
        String str2 = scan.next();
        str1 = str1.toLowerCase();//changing the first string value to lower case
        str2 = str2.toLowerCase();//chnaging the second string value to lower case

   if(str1.length() == str2.length()) //check weather length of the first string is equal to second string
{
     char[] charArray1 = str1.toCharArray();  //changes string1 to character Array1
     char[] charArray2 = str2.toCharArray(); //changes string2 to character array 2

    Arrays.sort(charArray1);
Arrays.sort(charArray2);

   boolean result = Arrays.equals(charArray1,charArray2);
System.out.println("Is given two strings are anagram : Yes! "+result);
}
else
       System.out.println("Is given two strings are anagram : No! false");
}
}
