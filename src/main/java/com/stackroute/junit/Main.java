package main.java.com.stackroute.junit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String test="java is java again java again";
        int len1=test.length();
        String result=test.replaceAll("a","");
        int len2=result.length();
        System.out.println("length is "+(len1-len2));
        System.out.println(test);
    }
}
