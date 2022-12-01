package competitiveexam;
import java.util.*;
public class bwsque5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<Integer,Integer>hashmap=new HashMap<Integer,Integer>();
       hashmap.put(1, 1);
       hashmap.put(2, 2);
       hashmap.put(3, 3);
       hashmap.put(4, 4);
       hashmap.put(5, 5);
       Set<Map.Entry<Integer,Integer>> a=hashmap.entrySet();
       for(Map.Entry<Integer, Integer>a1:a)
       {
    	   Integer data=a1.getKey();
    	   System.out.print("hashmap.put(");
    	   System.out.print(data);
    	   System.out.print(",");
    	   Integer value=a1.getValue();
    	   System.out.print((int)value*(int)value);
    	   System.out.print(")");
    	   System.out.println();
       }
       
	}

}
