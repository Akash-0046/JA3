
public class StringBuilderClass {
	public static void main(String[] args) {
		
		//Q1
		StringBuilder str=new StringBuilder("StringBuilder");
		
		str.append(" is a peer class of String");
		str.append(" that provides much of");
		str.append(" the functionality of Strings");
		
		System.out.println(str);
		
		System.out.println("-----------------------------------------------------------------");
		
		//Q2
		StringBuilder str1=new StringBuilder("It is used to at the specified index position");
		str1.insert(13, " insert text");
		
		System.out.println(str1);
		System.out.println("-----------------------------------------------------------------");
		
		//Q3
		StringBuilder str2=new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println(str2.reverse());
	}

}
