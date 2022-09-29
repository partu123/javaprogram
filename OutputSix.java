/* a[]={1,1,1,1}
     output=6
      each 1 will produce sum with any 1
*/
   import java.util.*;
class Output
  {
 int a[],temp=0,i,j;
    void Set(int a[])
      {
     this.a=a;
      }
    void Show()
      {
     for(i=0;i<a.length;i++)
         {
      int sum=0,flag=0;
         
     for(j=i;j<a.length;j++)
         {
       sum=sum+a[j];
        if(sum==2)
        {
        flag=1;
         break;
        }
        }
     if(flag==1)
       {
      temp=temp+sum;
       }
      }
    System.out.printf("output is :%d",temp);
     }
 }
public class OutputSix
   {
public static void main(String x[])
    {
      Output op=new Output();
        int a[]=new int[4];
           Scanner xyz=new Scanner(System.in);
         System.out.printf("enter the array element:");
                 for(int i=0;i<a.length;i++)
                       {
                       a[i]=xyz.nextInt();
                       }
              op.Set(a);
              op.Show();
      }
  }        

     