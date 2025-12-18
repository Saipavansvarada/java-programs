import java.util.Scanner;
class sai{
  public static void main(String[] args) {
    int p,q,m,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter p q m n");
    p=sc.nextInt();
    q=sc.nextInt();
    m=sc.nextInt();
    n=sc.nextInt();
    
    if(p==m&&q==n){
        int a[][]=new int[p][q];
        int b[][]=new int[m][n];
        int c[][]=new int[m][n];
        
    System.out.println("enter elements;");
    for(int i=0;i<p;i++)
        for(int j=0;j<q;j++)
            a[i][j]=sc.nextInt();
    
    System.out.println("enter elements;");
    for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
            b[i][j]=sc.nextInt();

    for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
            c[i][j]=a[i][j]+b[i][j];

    System.out.println("sum is");
    for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
            System.out.println(c[i][j]+" ");
    }
    sc.close();

}   
}
