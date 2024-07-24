class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for (String[] user : db) {
            String dbId = user[0];
            String dbPw = user[1];
            
            if (id.equals(dbId)) {
                return (pw.equals(dbPw)) ? "login" : "wrong pw";
            }
        }
        return "fail";
    }
}