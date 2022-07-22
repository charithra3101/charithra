import javax.print.FlavorException;

class area{
    float l,b,h;
     
    double rect(double h,double b){
        return h*b;

    }
    double rect (float b){
        return 2*b;
    
    }
    double rect(float h,float b){
        return 0.5*h*b;
    }
}
public class area_demo {
    public static void main(String[] args) {
        area a=new area();
        double rect=a.rect(10,20);
        double square=a.rect(10);
        double triangle=a.rect(10,20);
        System.out.println("Area of triangle is"+rect);
        System.out.println("Area of triangle is"+square);
        System.out.println("Area of triangle is"+triangle);

    }
    
}
