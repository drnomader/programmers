class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length()-4, code.length());

        if(lastFourWords.equals("_eye")) {
            System.out.println("Ophthalmologyc");
        } else if("head".equals(lastFourWords)) {
            System.out.println("Neurosurgery");
        } else if("infl".equals(lastFourWords)) {
            System.out.println("Orthopedics");
        } else if("skin".equals(lastFourWords)) {
            System.out.println("Dermatology");
        } else {
            System.out.println("direct recommendation");
        }
    }
}