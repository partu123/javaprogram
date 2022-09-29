import java.util.*;
public class ScannerClass
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int id;
float per;
String name;
System.out.println("enter the name:");
name=xyz.nextLine();
System.out.println("enter the id:");
id=xyz.nextInt();
System.out.println("enter the per:");
per=xyz.nextFloat();

System.out.printf("name is:%s,id is:%d,per is:%f",name,id,per);
}
}
