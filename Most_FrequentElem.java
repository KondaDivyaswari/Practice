import java.util.*;
public class Most_FrequentElem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=sc.nextInt();
        int i,j;
        int a[]=new int[n];
        
        System.out.println("Enter"+" "+ n+" "+" elements in array");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
    
        }
        int element=0;
        int count=0;
        for(i=0;i<n;i++){
            int tempelem=a[i];
            int tempcount=0;
            for(j=0;j<n;j++){
                if(a[j]==tempelem){
                    tempcount++;
                }
            }
            if(tempcount>count){
                element=tempelem;
                count=tempcount;
            }
        }
        System.out.println("most repeated element :"+element+" "+"\nfrequency :"+count);
    
    }

}