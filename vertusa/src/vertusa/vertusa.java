package vertusa;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class vertusa{
	public static void main(String []args){

		HashMap a=new HashMap();
		boolean b1,b2,b3;
		b1=(a instanceof Cloneable)&(a instanceof Serializable);
		b2=a instanceof Map;
      //  b3=a instanceof Collections;
		System.out.println(b1+" "+b2); 
		}
		
	}
