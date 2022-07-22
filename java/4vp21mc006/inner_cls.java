class Outer
{
    int outer_x=100;
    class inner
    {
        int inner_y=200;
        void method()
        {
            System.out.println("Acessing from inner class");
            System.out.println(outer_x);
            System.out.println(inner_y+outer_x);
        }
    }
    void display()
    {
        inner ob1=new inner();
         System.out.println("The value of inner class variable"+ob1.inner_y);
         System.out.println("The value of outer class variable"+outer_x);
    }
}
public class inner_cls {
    public static void main(String[] args) {
        Outer obname=new Outer();
        obname.display();
        Outer.inner obj2=obname.new inner();
        obj2.method();

    }
}
