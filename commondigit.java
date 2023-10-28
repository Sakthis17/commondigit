import java .util.*;
public class commondigit{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
String s1=Integer.toString(a);
String s2=Integer.toString(b);
String s3=Integer.toString(c); int l1=0,l2=0;
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)==s2.charAt(i))
{  
if(s1.charAt(i)== s3.charAt(i))
{
System.out.print(s1.charAt(i));
} 
}
}
}
} 


