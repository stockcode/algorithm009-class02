class Solution258 {
    public int addDigits1(int num) {
        if (num < 10) return num;

        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        return addDigits1(sum);
    }
}