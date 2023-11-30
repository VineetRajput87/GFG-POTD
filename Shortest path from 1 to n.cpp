class Solution{
    public int minStep(int n)
    {
        int ans = 0;
        while(n > 1) {
            if(n % 3 == 0)
                n /= 3;
            else 
                n--;
            ans++;
        }
        return ans;
    }
}
