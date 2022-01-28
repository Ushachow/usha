import java.util.regex.Pattern;
import java.util.Scanner;
public class Exp
{
    static String reverseWords(String str)
    {
      Pattern pattern = Pattern.compile("\\s");  
      String[] temp = pattern.split(str);
      String result = " ";
      for(int i=0; i<temp.length; i++)
      {
          if(i == temp.length - 1)
          result = temp[i] + result;
          else
          result = " " + temp[i] +result;
      }
      return result;
    }
       public static void main(String[] args)
    {
      
     Scanner sc = new Scanner(System.in);
     String str = sc.next();
     StringBuffer str1=new StringBuffer(str);
     str1.reverse();
       System.out.println(str1);

    }
}
output:
usha
ahsu
                                 CONCATENATION:
import java.util.Scanner;
class Concatenation
{
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();
    System.out.println(str1 + str2);
}
}
OUTPUT:
HELLO     
WORLD
HELLOWORLD
                         SPACES:
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
class Replace
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.replaceAll("\s+","").trim());
    }
}
output:
A    line with multiple spaces between    some words!
Alinewithmultiplespacesbetweensomewords!