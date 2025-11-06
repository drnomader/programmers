class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoSec = Integer.parseInt(video_len.substring(0, 2)) * 60 + Integer.parseInt(video_len.substring(3, 5));
        int curSec = Integer.parseInt(pos.substring(0, 2)) * 60 + Integer.parseInt(pos.substring(3, 5));
        int opStartSec = Integer.parseInt(op_start.substring(0, 2)) * 60 + Integer.parseInt(op_start.substring(3, 5));
        int opEndSec = Integer.parseInt(op_end.substring(0, 2)) * 60 + Integer.parseInt(op_end.substring(3, 5));

        if (opStartSec <= curSec && curSec <= opEndSec) {
            curSec = opEndSec;
        }
        
        for (String cmd : commands) {
            if (cmd.equals("prev")) {
                curSec -= 10;
                if (curSec < 0) curSec = 0;
            } else if (cmd.equals("next")) {
                curSec += 10;
                if (curSec > videoSec) curSec = videoSec;
            }
            
            if (opStartSec <= curSec && curSec <= opEndSec) {
                curSec = opEndSec;
            }
        }
        
        String mm = String.format("%02d", curSec / 60);
        String ss = String.format("%02d", curSec % 60);
        return mm + ":" + ss;
    }
}