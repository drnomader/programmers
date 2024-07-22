class Solution {
    public int solution(int chicken) {        
        int serviceChicken = chicken / 9;
        if (chicken > 1 && chicken % 9 == 0) {
            serviceChicken--;
        }
        return serviceChicken;
    }
}