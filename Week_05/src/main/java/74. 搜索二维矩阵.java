class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix.length;
        if (rowLength == 0) return false;

        int colLength = matrix[0].length;
        int left = 0, right = rowLength * colLength - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            int midElement = matrix[mid / colLength][mid % colLength];
            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return matrix[left / colLength][left % colLength] == target;
    }
}