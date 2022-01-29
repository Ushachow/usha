import java.util.*;
public class Sorting
{
    static void uppercase(String s, int length)
    {
        String temp="";
        for(int i=0; i<length; i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            temp+=s.charAt(i);
            else
            System.out.print(s.charAt(i));
        }
        System.out.print(temp);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int length=s.length();
        uppercase(s,length);
    }
}
output:
REasonBehind
asonehindREB
                                  MATRIX
import java.util.*;
public class Matrix2
{
    static void maxmin(int mat[][], int n)
{
    if(n==0)
    return;
    int pdiagmin=mat[0][0];
    int pdiagmax =mat[0][0];
    int sdiagmax=mat[0][n-1];
    int sdiagmax=mat[0][n-1];
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
        {
            if(i==j)
            {
                if(mat[i][j]<pdiagmin)
                pdiagmin=mat[i][j];
                if(mat[i][j]>pdiagmax)
                pdiagmax=mat[i][j];
            }
            if((i+j)==(n-1))
            {
                if(mat[i][j]<sdiagmin)
                sdiagmin=mat[i][j];
                if(mat[i][j]>sdiagmax)
                sdiagmax=mat[i][j];
            }
        }
    }
    System.out.println("smallest number of principal diagonal:"+pdiagmin);
    System.out.println("biggest number of principal diagonal:"+pdiagmax);
    System.out.println("smallest number of secondary diagonal:"+sdiagmin);
    System.out.println("biggest number of secondary diagonal"+sdiagmax);
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,j;
    int mat[][]=new int[n][n];
    for(i=0;i<n;i++)
    {
        for(j=0; j<n; j++)
        {
            mat[i][j]=sc.nextInt();
        }
    }
    for(i=0; i<n; i++)
    {
        for(j=0; j<n; j++)
        {
            System.out.print(mat[i][j]+"");
        }
        System.out.print();
    }
    maxmin(mat,n);
}
}
output:
5
7 8 9 0 1
2 3 4 5 6 
5 4 2 0 8
23 5 6 8 9
12 5 6 7 32
smallest element - 1:2
Greatest element - 1:32
smallest element - 2:1
greatest element - 2:12