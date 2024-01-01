import java.util.HashSet;

class jan1 {
    public static void main(String[] args) {
        /* int []nums = {9, 5, 7, 3};
        int k = 6; */
        int nums[]={6,14,12,14};
        int k=2;
        System.out.println(canPair(nums, k));
    }
    public static boolean canPair(int[] nums, int k) {
       HashSet<Integer> m=new HashSet<>(); 
       if(nums.length%2==0)
        {
        
        for(int i=0;i<nums.length;i++)
        {
            if(m.contains(k-nums[i]%k))
            {
                // return true;
                m.remove(k-nums[i]%k);
                continue;
            }
            m.add(nums[i]%k==0?k:nums[i]%k);
            // System.out.println(m);
        }
        if(m.isEmpty())
        {
            return true;
        }
    }
        
        return false;
    }

}