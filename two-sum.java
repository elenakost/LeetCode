class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm= new HashMap();
        for(int i=0; i<nums.size(); i++){
            if(hm.containsKey(target-nums[i])){
                int [2] ret;
                ret[0]=target-nums[i];
                ret[1]=nums[i]
                return ret
            }
            hm.put(nums[i],i)
        }
    }
}
