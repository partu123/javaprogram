package competitiveexam;
import java.util.*;
public class bwcque7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map <Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
       map.put(0, 22);
       map.put(1, 13);
       map.put(16, 18);
       map.put(4, 29);
       Set<Map.Entry<Integer, Integer>> a=map.entrySet();
       System.out.print("{");
       for(Map.Entry<Integer, Integer>a1:a)
       {
    	   
    	   Integer key=a1.getValue();
    	   System.out.print(key);
    	   System.out.print("\t");
    	   Integer data=a1.getKey();
     	  
    	   System.out.print(data);
    	   System.out.print("\t");
       }
       System.out.print("}");
	}

}
