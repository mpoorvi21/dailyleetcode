public class TwoSum {

    public static void main(String args[]){
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{10, 20, 30, 40, 50},90);
        System.out.println(result.length);
        //result.length;
    }
    public int[] twoSum(int[] nums, int target){

        int ans[] = new int[2];
        for(int i =0;i< nums.length;i++){
            for(int j =i+1;j< nums.length;j++){
                if(nums[i] + nums[j] == target){

                    ans[0]=i;
                    ans[1]=j;
                    System.out.print(ans);
                    break;
                }
            }
        }
        return ans;
    }
}