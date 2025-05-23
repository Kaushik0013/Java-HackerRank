import java.io.*;
import java.util.*;

public class JavaStringsIntroduction{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int total = A.length() + B.length();
        System.out.println(total);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else if(A.compareTo(B)<=0){
            System.out.println("No");
        }
        
        String caps = A.substring(0,1).toUpperCase()+A.substring(1)+" " + B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(caps);
        
    }
}