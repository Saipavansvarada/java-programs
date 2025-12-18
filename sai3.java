class employee1{
    private int id;
    private String name;
    private double salary;
     
public employee1(int id ,String name,double salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
} 

public void incsalary(double per){
    double insal=salary*(per/100.0);
    salary=salary+insal;
    System.out.println(name+"salary has been incresed by "+per+"now salary is "+salary);
}

public void display(){
    System.out.println("ID ="+id);
    System.out.println( "Name="+name);
    System.out.println("salary="+salary);
}

}
public class sai3 {
    public static void main(String[] args) {
        employee1 emp=new employee1(101,"sai",5000);
        System.out.println("before increment:");
        emp.display();
        System.out.println("after increment:");
        emp.incsalary(10);
        emp.display();
    }
}
