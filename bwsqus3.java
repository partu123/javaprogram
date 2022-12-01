/* second large element in array */
package competitiveexam;
import java.util.*;
public class bwsqus3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> a=new ArrayList<Integer>();
       int size;
       Scanner xyz=new Scanner(System.in);
       System.out.println("enter the size:");
       size=xyz.nextInt();
       for(int i=0;i<size;i++)
       {   System.out.println("enter the values");
    	   int data=xyz.nextInt();
    	   a.add(data);
       }
      
       for(int i=0;i<size;i++)
       {
    	   for(int j=i+1;j<size;j++)
    	   {
    		   if(a.get(i)<a.get(j))
    		   {
    			   int temp=a.get(i);
    			   a.set(i,a.get(j));
    			   a.set(j, temp);
    		   }
    	   }
       }
       int max=(int)a.get(0);
       for(int i=0;i<size;i++)
       {
    	   if(max>a.get(i))
    	   {
    		   max=a.get(i);
    		   break;
    	   }
       }
       System.out.println(max);
	}

}
