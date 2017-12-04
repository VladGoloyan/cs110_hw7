package utils;
public class Math {
    public static long factorial(long n)
    {
        if(n <= 1)
        {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static long factorialforLoop(long n)
    {
        long a= 1;
        if(n <= 0)
        {
            return a;
        }
        for(int i = 1; i <= n; i++) 
        {
            a = a * i;
        }
        return a;
    }
}