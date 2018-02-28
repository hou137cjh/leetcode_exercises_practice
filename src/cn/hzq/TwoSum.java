package cn.hzq;

public class TwoSum {
	public static void main(String[] args){
		int [] nums ={2,5,5,11};
		int target = 10;
		twoSum(nums, target);
	}
	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		for (int i = 0;i<nums.length-1;i++){
			for (int j = i; j <nums.length ; j++) {
				if(nums[i]+nums[j] ==  target){
					res[0] = i;
					res[1] = j;
					return res;
				}
			}
		}
		return res;
	}
}
