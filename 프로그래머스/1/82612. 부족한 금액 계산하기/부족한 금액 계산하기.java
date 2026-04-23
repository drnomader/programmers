class Solution {
    public long solution(int price, int money, int count) {
        long totalCost;
        
        totalCost = (long) price * count * (count + 1) / 2;
        
        if (totalCost > money) {
            return totalCost - money;
        }
        
        return 0;
    }
}