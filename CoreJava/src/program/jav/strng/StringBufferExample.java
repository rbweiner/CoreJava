package program.jav.strng;

public class StringBufferExample{  
	
public static void main(String args[]){  
	
	StringBuffer sb=new StringBuffer("Hello ");  
	sb.append("Java");        //now original string is changed  
	System.out.println(sb);   //prints Hello Java  
	
	sb.insert(1,"Java");     //now original string is changed  
	System.out.println(sb);  //prints HJavaello  
	
	sb.replace(1,3,"Java");  
	System.out.println(sb);//prints HJavalo 
	
	sb.delete(1,3);  
	System.out.println(sb);//prints Hlo  
	
	sb.reverse();  
	System.out.println(sb);//prints olleH  
	
	
	
	}  
}  