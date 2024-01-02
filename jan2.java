class jan2 {

    public static void main(String[] args) {
       long  n = 4;
        long a[] = {1, -2, 2, -3};
        long k = 2;
        System.out.println(maxSumWithK(a, n, k));
    }
    public static long maxSumWithK(long a[], long n, long k)
    {
        long max=0,sum=0,prev=0;
        int i=0;
        int j=0;
        while(i<k)
        {
            sum=sum+a[i++];
        }
        max=sum;
        while(i<n)
        {
            sum=sum+a[i++];
            prev=prev+a[j++];
            max=Math.max(max,sum);
            if(prev<0)
            {
                sum=sum-prev;
                prev=0;
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}