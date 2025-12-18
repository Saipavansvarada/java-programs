class outer{
    void display(){
        System.out.println("outer");
    }
    class inner{
        void display(){
            System.out.println("inner");
        }
    }
}
public class sai4 {
    public static void main(String[] args) {
        outer os=new outer();
        os.display();
        outer.inner in = os.new inner();
        in.display();

    }    
}
