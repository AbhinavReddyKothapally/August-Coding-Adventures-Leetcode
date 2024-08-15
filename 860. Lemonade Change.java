class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0,n=bills.length;
        for(int i=0;i<n;i++)
        {
            if(bills[i]==5)
                five++;
            else if(bills[i]==10)
            {
                if(five>0)
                {
                    five--;
                    ten++;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if(five<=0)
                    return false;
                else if(ten>0 && five>0)
                {
                    ten--;
                    five--;
                }
                else if(ten<=0 && five>=3)
                {
                    five=five-3;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}
