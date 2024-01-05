// Count possible ways to construct buildings
public class jan5{
    public static void main(String[] args) {
        int n=22;
        System.out.println(TotalWays(n));
    }   
    
    public static int TotalWays(int N) {
      /*   long fibb1=0;
        long fibb2=1;
        long fibb=0; */
        long mod=1000000007;
        long fib[]=new long[N+1];
        fib[0]=2;
        fib[1]=3;
        for(int i=2;i<=N-1;i++)
        {
           fib[i]=(fib[i-1]%mod+fib[i-2]%mod)%mod;
        }
        return (int)((fib[N-1]*fib[N-1])%mod);
    }
}
