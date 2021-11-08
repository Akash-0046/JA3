
public class StringClass {
	public static void main(String[] args) {
		//Question 1
		String s=new String("Hello World");
		System.out.println(s.length());
		
		//Question 2
		String s1="Hello,";
		String s2=" How are you";
		
		String s3=s1.concat(s2);
		System.out.println(s3);
		
		//Question 3
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		
		System.out.println(str.toLowerCase());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println(str.toUpperCase());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		String astr=str.replace("a", "$");
		System.out.println(astr);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		if(str.contains("collection"))
			System.out.println("original string contains COLLECTION");
		else
			System.out.println("original string doesn't contain COLLECTION");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		String str2="java string pool refers to collection of strings which are stored in heap memory";
		
		if(str.equals(str2))
			System.out.println("str is equal to str2");
		else
			System.out.println("str is not equal to str2");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		if(str.equalsIgnoreCase(str2))
			System.out.println("str is equal to str2");
		else
			System.out.println("str is not equal to str2");
		
	}

}
