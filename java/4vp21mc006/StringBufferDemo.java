public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println("buffer before=" +sb);
        System.out.println("Capacity="+sb.capacity());

        System.out.println("charAt(1) before="+sb.charAt(1));

        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("Capacity="+sb.capacity());
        System.out.println("buffer after="+sb);
        System.out.println("charAt(1) after="+sb.charAt(1));
        System.out.println("buffer="+sb);
        System.out.println("length="+sb.length());
        System.out.println("Capacity="+sb.capacity());

    }
    
}
