import java.util.*;
public class A_Equal_Subsequences{
    public void solve(int n,int k){
        
    }
public static void main(String [] Args){
Scanner sc= new Scanner(System.in);

int tc= sc.nextInt();
while(tc-->0){
    int n=sc.nextInt(),k=sc.nextInt();
    int n1=n,k1=k;
    String str=new String();
        while(k1-->0){
            str+="1";    
    }
    int m=n-k;
    // System.out.println("m="+m);
    while(m-->0){
        str+="0";
        
    }
    System.out.println(str);
}
}
}
