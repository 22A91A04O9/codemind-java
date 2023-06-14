import java.util.*;
 public class praveen{
public static void main(String args[]){
    int a;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    for(int i=1;i<=a;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.format("%d",j);
            
        }
        System.out.println();
    }
}
}