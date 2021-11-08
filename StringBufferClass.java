
public class StringBufferClass {
	public static void main(String[] args) {
		
		//Q1
		StringBuffer str=new StringBuffer("StringBuffer");
		
		str.append(" is a peer class of String");
		str.append(" thet provides much of");
		str.append(" the functionality of Strings");
		
		System.out.println(str);
		
		System.out.println("-----------------------------------------");
		
		//Q2
		StringBuffer str1=new StringBuffer("It is used to at the specified index position");
		
		str1.insert(13, " insert text");
		
		System.out.println(str1);
		
		System.out.println("-----------------------------------------");
		
		//Q3
		StringBuffer str2= new StringBuffer("This method returns the reversed object on which it was called");
		
		System.out.println(str2.reverse());
	}

}
