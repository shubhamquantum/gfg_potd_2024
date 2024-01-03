public class jan3{
    public static void main(String[] args) {
        String S = "10212";
        System.out.println(smallestSubstring(S));
    }
    
    public static int smallestSubstring(String S) {
        // Code here
        int zero=-1;
        int one =-1;
        int two=-1;
        int minValue=Integer.MAX_VALUE;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='0')
            {
                zero=i;
            }
            else if(S.charAt(i)=='1')
            {
                one=i;
            }
            else
            {
                two=i;
            }
            if(zero!=-1 && one!=-1 && two!=-1)
            {
                minValue=Math.min(minValue,i+1-Math.min(zero,Math.min(one,two)));
            }
        }
        if(minValue==Integer.MAX_VALUE)
        {
            return -1;
        }
        return minValue;
    }
}