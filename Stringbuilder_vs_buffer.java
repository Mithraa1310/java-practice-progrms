package javaPractice;

public class Stringbuilder_vs_buffer {

	 
	    public static void main(String[] args){ 
	    	String a;
	    	String b;
	        long startTime = System.currentTimeMillis();  
	        StringBuffer sb = new StringBuffer("Java");  
	        for (int i=0; i<10000; i++){  
	            sb.append("Tpoint");  
	            
	        }  
	        System.out.println(sb);//it wont print the output bcoz of space issue
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	       
	        
	        startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("Java");  
	        for (int i=0; i<10; i++){  
	            sb2.append("Tpoint");  
	        } 
	        System.out.println(sb2);//it will print bcoz oly 10 iterations to be done
	        StringBuilder a1= sb2.reverse();
		       System.out.println(a1);
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	    }  
	}  

