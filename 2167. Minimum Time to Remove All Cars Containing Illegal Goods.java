class Solution {
    public int minimumTime(String s) {
        int n=s.length();
        int[] prefix=calc(s);
        StringBuilder s1=new StringBuilder(s);
        int[] suffix=calc(s1.reverse().toString());
        
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=n;i++){
            ans = Math.min(ans,prefix[i]+suffix[n-i]);
        }
        return ans;
    }
    
    int[] calc(String s){
        int n=s.length();
        int[] ans = new int[n+1];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                ans[i+1]=ans[i]+2;
            }else{
                ans[i+1]=ans[i];
            }
            ans[i+1]=Math.min(ans[i+1],i+1);
        }
        return ans;
    }
}
