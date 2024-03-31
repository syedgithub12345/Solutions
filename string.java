//studying the concepts of String and it's operations
//String Builder

import java.util.*;
public class string {
    public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("Hello");
    System.out.println(sb);

    sb.insert(5,"Bye");
    System.out.println(sb);

    sb.delete(1,2);
    System.out.println(sb);

    sb.append("World");
    System.out.println(sb);

    int l=sb.length();
    System.out.println("Length :"+l);

    System.out.println();
    System.out.println("Working Reverse String ");
    StringBuilder s1=new StringBuilder();
    System.out.println("Before reverse :");
    String s2="kitten";
    char[] arr1= s2.toCharArray();
    for(int i=arr1.length-1;i>=0;i--){
        s1.append(arr1[i]);
    }System.out.println("After reversing the string :");
    System.out.println(s1);

    System.out.println();
    
    // //In progress
    // StringBuilder s3=new StringBuilder("Delhi");
    // for(int i=0;i<s3.length()/2;i++){
    //     int front=i;
    //     int end=s3.length()-1-i;
    //     char frontchar=s3.charAt(front);
    //     char endchar=s3.charAt(end);

    //     s3.setCharAt(frontchar,endchar);
    //     s3.setCharAt(endchar,frontchar);
    // }
    // System.out.println(s3);
    }
}
