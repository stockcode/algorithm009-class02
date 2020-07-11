import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        int[] ans = new int[arr1.length];

        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (list.remove(Integer.valueOf(arr2[i]))) {
                ans[k++] = arr2[i];
            }
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            ans[k++] = list.get(i);
        }

        return ans;
    }
}