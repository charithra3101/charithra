class method{

    double l;
    double b;
    double h;

double_area(double l,double h){
return l*b;
}
float_area(float l,float h)
{
return l*h/2;
}
double area(double l){
    return 2*l;
}
}



public class area {
    public static void main(String[] args) {
    
        method m1=new method();
        float l=10,h=30;
        double a=20,b=20,c=20;
        System.out.println("Method overloading area\n");
        float triangle=m1.area(l,h);


    }
}
