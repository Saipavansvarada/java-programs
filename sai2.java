class stack1 {
    int maxsize;
    int top;
    int stacka[];

public stack1(int size){
    maxsize=size;
    top=-1;
    stacka= new int[maxsize];
}

public void push(int value){
    if(top==maxsize-1)
        System.out.println("full");
    else{
        stacka[++top]=value;
        System.out.println("pushed"+value);
    }
}
public void pop(){
    if (top==-1){
        System.out.println("empty");
    }
    else{
        int v=stacka[top--];
        System.out.println("poped"+v);
    }

}
public void display(){
    for(int i=0;i<=top;i++)
        System.out.println(stacka[i]+" ");

}

}
public class sai2 {
    public static void main(String[] args) {
        stack1 mystack=new stack1(10);
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.display();
        mystack.pop();
        mystack.display();


    }

    
}
