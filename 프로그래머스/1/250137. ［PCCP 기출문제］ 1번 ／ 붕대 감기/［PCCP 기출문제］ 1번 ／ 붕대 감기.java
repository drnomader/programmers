class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        
        int maxHealth = health;
        int currentHealth = health;
        int successTime = 0;
        
        int attackIndex = 0;
        int lastAttackTime = attacks[attacks.length - 1][0];
        
        for (int time = 1; time <= lastAttackTime; time++) {
            if (attackIndex < attacks.length && attacks[attackIndex][0] == time) {
                currentHealth -= attacks[attackIndex][1];
                successTime = 0;
                attackIndex++;
                
                if (currentHealth <= 0) {
                    return -1;
                }
                
                continue;
            }
            
            successTime++;
            currentHealth += x;
            
            if (successTime == t) {
                currentHealth += y;
                successTime = 0;
            }
            
            if (currentHealth > maxHealth) {
                currentHealth = maxHealth;
            }
        }
        
        return currentHealth;
    }
}