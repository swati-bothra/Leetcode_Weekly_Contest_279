class Solution {
    public long smallestNumber(long num) {
        PriorityQueue<Long> q;
        if(num<0){
            q=new PriorityQueue<>(Collections.reverseOrder());
        }else{
            q=new PriorityQueue<>(); 
        }
        long a=num;
        num=Math.abs(num);
        while(num>0){
            long n=num%10;
            num =num/10;
            q.add(n);
        }
        long ans=0;
        int count=0;
        while(!q.isEmpty()&&q.peek()==0){
            q.poll();
            count++;    
        }
        while(!q.isEmpty()){
            long n=q.poll();
            ans =ans*10+n;
            if(count!=0){
                ans =ans*(long)Math.pow(10,count);
                count=0;
            }
        }
        return a<0?ans*-1:ans;
    }
}
