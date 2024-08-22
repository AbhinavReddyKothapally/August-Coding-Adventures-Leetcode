class Solution {
    public int findComplement(int num) {
        int len=(int)(Math.log(num)/Math.log(2))+1;
        long maxval=(long)Math.pow(2,len)-1;
        return (int)maxval-num;
    }
}
