class const_over{
    double l,b,h;
    const_over(double l,double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    const_over(double l){
        this.l=this.b=this.h=l;
    }
    double volume()
    {
        return l*b*h;
    }
    void print()
    {
        System.out.println("method overloading");
    }
    void print(double v)
    {
        System.out.println("Volume of a box="+v);
    }
}
public class p1 {
    public static void main(String[] args){
        const_over cuboid=new const_over(10,20,10);
        const_over cube=new const_over(10);
        double v1=cuboid.volume();
        double v2=cube.volume();
        cube.print();
        cuboid.print();
        cube.print(v2);
        cuboid.print(v1);
    }
}
