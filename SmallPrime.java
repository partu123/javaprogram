/* small prime factor of given integer */

 public class SmallPrime
   {
public static void main(String x[])
     {
       int no,count,flag=0;
        no=Integer.parseInt(x[0]);
          int i,j;
             for(i=1;i<no;i++)
            {   
              if(no%i==0)
                {     count=0;
                   for(j=1;j<=i;j++)
                     {  
                        if(i%j==0)
                           {
                             ++count;
                            }
                       }
                     
                       
                 
                 if(count==2)
                         {
                          flag=1;
                         break;

                          
                           }
                   
                    }
                }
                      if(flag==1)
                        {
                     
                       System.out.printf("small prime factor is :%d",i);
                       
                         }
                            else
                               {
                          System.out.printf("not found");
                               }
         }
    }