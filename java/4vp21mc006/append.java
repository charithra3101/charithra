public class append {
    public static void main(String[] args) {
        String s;
        int a=42;
        StringBuffer sb=new StringBuffer(4);
        //System.out.println(sb.append("append"));
        s=sb.append("a=").append(a).append("!").toString();
        System.out.println(s);
        System.out.println(sb.length());
    }
    
}
