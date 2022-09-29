import java.util.*;
public class Jagged
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[][]=new int [3][];
   a[0]=new int [3];
   a[1]=new int [4];
   a[2]=new int [2];
int i,j;
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
  a[i][j]=xyz.nextInt();
}
}
System.out.printf("display array element:");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
  System.out.printf("%d\t",a[i][j]);
}
System.out.printf("\n");
}
}
}