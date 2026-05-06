class Solution {
    public String solution(String newId) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < newId.length(); i++) {

            char ch = newId.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9') ||
                ch == '-' || ch == '_' || ch == '.') {

                if (ch == '.') {

                    if (result.length() == 0) continue;

                    if (result.charAt(result.length() - 1) == '.') continue;
                }

                result.append(ch);
            }
        }

        if (result.length() > 0 && result.charAt(result.length() - 1) == '.') {
            result.deleteCharAt(result.length() - 1);
        }

        if (result.length() == 0) {
            result.append('a');
        }

        if (result.length() > 15) {
            result.setLength(15);

            if (result.charAt(result.length() - 1) == '.') {
                result.deleteCharAt(result.length() - 1);
            }
        }

        while (result.length() < 3) {
            result.append(result.charAt(result.length() - 1));
        }

        return result.toString();
    }
}