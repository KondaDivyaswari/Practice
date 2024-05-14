import java.util.*;
public class Sort_Array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        int temp=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("After");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }


    }
}