package competitiveexam;
import java.util.*;
public class bwcoue4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<Integer,String>hashmap=new HashMap<Integer,String>();
     hashmap.put(1, "A");
     hashmap.put(2, "b");
     hashmap.put(3, "c");
     hashmap.put(4, "d");
     hashmap.put(5, "e");
     hashmap.replace(3,"f");
     Set<Map.Entry<Integer,String>> e=hashmap.entrySet();
     for(Map.Entry<Integer, String>e1:e)
     {
    	Integer a=e1.getKey();
    	System.out.print(a);
    	String x=e1.getValue();
    	System.out.print(":"+x+"\t");
     }
     
	}

}
