class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> set = new HashMap<>();
          int max = nums.length / 2;
          for (int num : nums){
              set.put(num, set.getOrDefault(num, 0) + 1);
               
            if (set.get(num) > max) {
                return num;
            }
          }
          return -1;
    }
}