//most frequent character
import java.util.Scanner;
import java.util.Arrays;

public class mostfrequent{

public static char frequent(String s)
{
int count[]=new int[256];
   
int n=s.length();
     for(int i=0;i<n;i++)
      {
        count[s.charAt(i)]++;
       }
int max=-1;
char result=' ';

for(int i=0;i<n;i++)
{
if(max<count[s.charAt(i)]){
max=count[s.charAt(i)];
result=s.charAt(i);
}
}
return result;
}

public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string name:");
String s=sc.nextLine();
System.out.println("max occuring character in an array:" + frequent(s));

}
}