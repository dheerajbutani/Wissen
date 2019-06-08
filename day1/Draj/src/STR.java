import java.io.*;
import java.util.*;
class STR{

public static void main(String args[])
{
String ssn;
Scanner sc=new Scanner(System.in);
ssn=sc.nextLine();
int f=1;
if(ssn.charAt(3)=='-')
f=0;
if(ssn.charAt(6)=='-')
f=0;
int i;
for(i=0;i<10;i++)
{
if(i!=3&&i!=6){
if(ssn.charAt(i)>='0'&&ssn.charAt(i)<='9')
{
f=0;
}
else{
f=1;
break;
}
}
}
if(f==0)
System.out.println("Yes");
else
System.out.println("No");
}

}