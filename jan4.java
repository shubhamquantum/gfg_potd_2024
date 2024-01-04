import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class jan4{
    public static void main(String[] args) {
        int N = 4;
        int arr[] = {1, 10, 1, 1};
        int k=singleElement(arr, N);
        System.out.println(k);
    }
    
    static int singleElement(int[] arr, int N) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            if(!m.containsKey(arr[i]))
            {
                m.put(arr[i],1);
            }
            else
            {
                m.put(arr[i],m.get(arr[i])+1);
            }
        }
        
        for (Entry<Integer, Integer> entry : m.entrySet()) {
            // System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            if(entry.getValue()==1)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}