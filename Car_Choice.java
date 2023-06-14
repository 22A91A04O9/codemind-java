import java.util.*;
 public class praveen{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t,x1,x2,y1,y2;
        float c1,c2;
        t=sc.nextInt();
        for(int i=0;i<t;i++){
            x1=sc.nextInt();
            x2=sc.nextInt();
            y1=sc.nextInt();
            y2=sc.nextInt();
            c1=y1/(float)x1;
            c2=y2/(float)x2;
            if(c1<c2)
            System.out.println(-1);
            else if(c1>c2)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
}

