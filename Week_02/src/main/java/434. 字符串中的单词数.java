import java.util.Arrays;

class Solution434 {
    public int countSegments(String s) {
        return (int)Arrays.stream(s.split(" ")).filter(t -> t.length() > 0).count();
    }
}