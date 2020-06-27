import java.util.Arrays;

class Solution621 {
    public int leastInterval(char[] tasks, int n) {
        if (tasks.length == 0) return 0;

        int[] taskCounts = new int[26];
        for (char ch: tasks) {
            taskCounts[ch - 'A'] ++;
        }

        Arrays.sort(taskCounts);

        int nLen = taskCounts[taskCounts.length - 1];
        int max = (nLen - 1) * (n + 1);

        int k = 0;
        for (int i = taskCounts.length - 1; i >= 0; i--) {
            if (taskCounts[i] == nLen) k++;
            else break;
        }

        return Math.max(tasks.length, max + k);

    }
}