import java.util.Scanner;

public class stringhandle {
    public static void main(String[] args) {
      String s;  
        
      StringBuffer sb=new StringBuffer("JAVA");
      System.out.println("Capacity of String before="+sb.capacity());
        
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string=");
        s=sc.next();
        
        int l=s.length()-1;
        for(int i=l;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
        
    }
}
