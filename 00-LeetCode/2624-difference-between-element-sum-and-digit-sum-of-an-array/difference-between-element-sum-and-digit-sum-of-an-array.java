class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int elesum=0,digisum=0;
        for(int i=0;i<n;i++){
            elesum+=nums[i];
        }
        for(int j=0;j<n;j++){
            int temp=nums[j],sum=0;
            while(temp>0){
                int rem=temp%10;
                sum+=rem;
                temp=temp/10;

            }
            digisum+=sum;
        }
        return elesum-digisum;
    }
}