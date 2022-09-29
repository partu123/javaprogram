import java.util.*;
  
public class Occurence
   {
public static void main(String x[])
   {
Scanner xyz=new Scanner(System.in);
  int a[]=new int[5];
     System.out.printf("enter the array:");
       for(int i=0;i<a.length;i++)
         {
        a[i]=xyz.nextInt();
         }
  int flag=0;
    //sort array in ascending order
    for(int i=0;i<a.length;i++)
     {
    for(int j=i+1;j<a.length;j++)
     {
    if(a[i]>a[j])
     {
     int temp=a[i];
       a[i]=a[j];
       a[j]=temp;
     }
   }
  }
   //find occuernce
    for(int i=0;i<a.length;i++)
       {
     int count=1;
     for(int j=i+1;j<a.length;j++)
      {
     if(a[i]==a[j])
       {
      count++;
       }
      else
       {
   
         break;
       }
     }
   
      i+=count-1;
      if(count==1)
        {
       System.out.printf("frist nonrepeted element is :%d",a[i]);
         flag=0;
         break;
        }
          else
        {
         flag=1;
           
        }
        
   }
       if(flag==1)
         {
         System.out.printf("frist non repeted element not found");
         }
      
 }
}
   
