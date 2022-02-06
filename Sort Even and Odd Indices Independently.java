class Solution {
    public int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> q1=new PriorityQueue<>();
        PriorityQueue<Integer> q2=new PriorityQueue<>(Collections.reverseOrder());
        int n=nums.length;
        for(int i=0;i<n;i=i+2){
            q1.add(nums[i]);
        }
        for(int i=1;i<n;i=i+2){
            q2.add(nums[i]);
        }
        int i=0;
        while(i<n && !q1.isEmpty()){
            nums[i]=q1.poll();
            i=i+2;
        }
        i=1;
        while(i<n && !q2.isEmpty()){
            nums[i]=q2.poll();
            i=i+2;
        }
        return nums;
    }
}
