import java.util.HashSet;
import java.util.Set;

class Solution874 {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0;
        int x = 0, y = 0;
        int result = 0;

        Set<String> obSet = new HashSet<>();
        for (int[] array : obstacles) {
            obSet.add(array[0] + ":" + array[1]);
        }

        for (int command : commands) {
            if (command > 0) {
                for (int i = 1; i <= command; i++) {
                    int nx = x + direction[dir][0];
                    int ny = y + direction[dir][1];

                    if (obSet.contains(nx + ":" + ny)) break;

                    x = nx;
                    y = ny;

                    result = Math.max(result, x * x + y * y);
                }
            } else if (command == -1){
                dir = (dir + 1) % 4;
            } else {
                dir = (dir + 3) % 4;
            }
        }

        return result;
    }
}