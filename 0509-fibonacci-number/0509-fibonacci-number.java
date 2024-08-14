class Solution {
    public int fib(int n) {
        int sum;
        if(n==0||n==1){
            sum=n;
        }
        else{
        sum=fibo(n-1)+fibo(n-2);
        }
        
        return sum;
    }
    public int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}