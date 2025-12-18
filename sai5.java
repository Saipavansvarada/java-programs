abstract class shape{
    abstract double area();
    abstract double perimeter();
}
class circle extends shape{
    private double radius;
    public circle(double radius){
        this.radius=radius;
    }
public double area(){
    return 3.14*radius*radius;
}
public double perimeter(){
    return 2*3.14*radius;
}
} 
public class sai5 {
    public static void main(String[] args) {
        shape cir=new circle(5.0);
        System.out.println("area"+ cir.area());
        System.out.println("perimeter"+ cir.perimeter());

    }
}