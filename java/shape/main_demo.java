package shape;

public class main_demo {
    public static void main(String[] args) {
        square squar=new square();
        triangle triangl=new triangle();
        circle circl=new circle();
        squar.getData((float)5.5);
        System.out.println("The area of square is:"+squar.area());
        triangl.getData((double)20.56,(double)23.90);
        System.out.println("The area of triangle is"+triangl.area());
        circl.getData((double)5.5);
        System.out.println("The area of circle is:"+circl.area());

    }
}
