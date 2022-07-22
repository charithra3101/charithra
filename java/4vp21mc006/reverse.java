public class reverse {
    public static void main(String[] args) {
        int l,i,j,s;
        StringBuffer sb=new StringBuffer("Java");
        i=sb.length();
        for(i=sb.length(),j=0;i>=0;i--) 
        {
            sb.insert(j,sb.charAt(i));
            System.out.println(sb);

        }

    }
    
}
