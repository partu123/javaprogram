package competitiveexam;
import java.util.*;
public class bwcque8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str[]={"pune","mumbai","delhi","jaypur"};
     String str1[]={"kolkta","satara","banglore","pune"};
     HashSet<String>set =new HashSet<String>();
     for(int i=0;i<str.length;i++)
     {
    	 for(int j=0;j<str1.length;j++)
    	 {
    		 if(str[i].equals(str1[j]))
    		 {
    			 set.add(str[i]);
    		 }
    	 }
     }
     System.out.println(set);
     
	}

}
