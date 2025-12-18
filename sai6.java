interface resizable {
    void resizehight(int h);
    void resizewidth(int w);
} 

class rectangle implements resizable{
    int w,h;
    public rectangle(int w,int h){
        this.h=h;
        this.w=w;
    }
public void resizehight(int h){
    this.h=h;
}
public void resizewidth(int w){
    this.w=w;
}
public void dis( ){
    System.out.println("height = "+h+"width = "+w);
}
}
public class sai6 {
    public static void main(String[] args) {
        rectangle rect = new rectangle(10, 20);
        rect.dis( );
        rect.resizehight(15);
        rect.resizewidth(25);
        rect.dis( );
        };
    }
    
