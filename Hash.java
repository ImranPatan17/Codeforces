import java.util.*;
class Hash {
    public boolean containsDuplicate(int[] nums) {
      Map<Integer,Integer> map= new HashMap<>();
      boolean b= false;
      for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
        if(map.get(num)>1)
        b= true;
      }
    return b;
    }

    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>();
        int []a= {1,2,3,4,1};
       
        
        System.out.println(hashset);
    }
}
