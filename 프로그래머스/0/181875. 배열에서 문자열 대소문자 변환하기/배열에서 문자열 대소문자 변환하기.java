import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public String[] solution(String[] strArr) {
        AtomicInteger idx = new AtomicInteger();
        return Arrays.stream(strArr)
            .map(i -> {
                int currentIdx = idx.get();
                idx.incrementAndGet();
                return currentIdx % 2 == 0 ? i.toLowerCase() : i.toUpperCase();
            })
            .toArray(String[]::new);
    }
}