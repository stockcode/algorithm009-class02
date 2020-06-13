class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        int m5 = 0, m10 = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) m5++;

            if (bills[i] == 10) {
                m5--;
                m10++;
            }

            if (bills[i] == 20) {
                m5--;

                if (m10 == 0)
                    m5 -=2;
                else
                    m10--;
            }

            if (m5 < 0 || m10 < 0) return false;
        }

        return true;
    }
}