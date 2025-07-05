import java.util.*;


public class B_Tournament{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int j= sc.nextInt();
            int k= sc.nextInt();
            int []arr= new int[n];
           for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
           }
           boolean b= false;
          Map<Integer,Integer> map= new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num)>1)
            b=true;
        }
          
           System.out.println(b==true?"YES":"NO");
           
            
            

            
        }
    }
}