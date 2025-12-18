class myrunnable implements Runnable{
    private String threadname;
public myrunnable(String name){
    this.threadname=name;
}
public void run(){
    for(int i=1;i<=5;i++){
        System.out.println(threadname+" count : "+i);
    }
    try{
        Thread.sleep(500);
    }catch(InterruptedException e){
        System.out.println(threadname+" Was interrepted");
    }
    System.out.println(threadname+"excution completed");
}
}
public class sai9 {
   public static void main(String[] args) {
    myrunnable task1=new myrunnable("task-1");
    myrunnable task2=new myrunnable("task-2");
    Thread t1=new Thread(task1);
    Thread t2=new Thread(task2);
    t1.run();
    t2.run();    
}
}
