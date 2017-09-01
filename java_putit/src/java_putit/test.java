package java_putit;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main (String[] args) {
    	List<String> orgList = new ArrayList<String>();
    	List<String> subList = null;

    	try {
    		int testFlg = Integer.parseInt(args[0]);
    		
        	if(testFlg == 0) {
    	    	for(int i = 1; i<=5; i++) {
    	    		String testStr = String.format("%03d", i);
    	    		orgList.add(testStr);
    	    	}
    	    	subList = orgList.subList(2, 4);
    	    	
    	    	System.out.println("-- orgList@--");
    	    	for(String orgStr : orgList) {
    	    		System.out.println(orgStr);
    	    	}
    	    	System.out.println("-- subList@--");
    	    	for(String subStr : subList) {
    	    		System.out.println(subStr);
    	    	}
        	} else {
        		System.out.println(" \"testFlg != 0\" ‚Å‚·B");	
        	}
    	} catch(Exception e) {
    		System.out.println(e);
    	}
    	

    }
}