class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        HashSet<Integer> newset=new HashSet<>();

        for(int nums:nums2){
           if( set.contains(nums)){
            newset.add(nums);
           }
        }
         int[] ans = new int[newset.size()];

        int i = 0;
        for (int num : newset) {
            ans[i] = num;
            i++;
        }
        return ans;
    }
}