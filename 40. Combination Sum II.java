class Solution {
    private void helper(int idx, int[] arr, int target, List<List<Integer>> result, List<Integer> temp){
        if(target==0){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            temp.add(arr[i]);
            helper(i+1,arr,target-arr[i],result,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result=new ArrayList<>();
        helper(0,candidates,target,result,new ArrayList<>());

        return result;
    }
}
