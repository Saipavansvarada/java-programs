class DivisionByzeroException extends Exception{
    public DivisionByzeroException(String message){
        super(message);
    }
}

public class sai10{
    public static int divide(int num,int deno) throws DivisionByzeroException{
            if(deno==0){
                throw new DivisionByzeroException("cant divide by zero");
            }
            return num/deno;
    }

    public static void main(String[] args) {
        int a=10,b=0;
        try{
            int result = divide(a,b);
            System.out.println("result"+result);
        }catch(DivisionByzeroException e){
            System.out.println("caught exception"+e.getMessage());
        }finally{
            System.out.println("division operation atempted");
        }
    }
} 