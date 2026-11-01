class Solution {
    public int maxProfit(int[] prices) {
        int min =Integer.MAX_VALUE;

        int max=0;
        for(int price : prices){
            if(price< min){
                min=price;
            }
            else{
                int pro= price-min;
                max=Math.max(max,pro);
            }
        }
        return max;
    }
}