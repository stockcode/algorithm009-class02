import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution299 {
    public String getHint(String secret, String guess) {
        int bull = 0, cow = 0;
        List<Character> arr = new ArrayList<>();

        Map<Character, Integer> map = new HashMap<>();

        //遍历一次字符串，如果两个字符串当前索引字符相同，则将"公牛数"加一；否则，将秘密字符串的字符放入HashMap中，进行次数统计，将猜的字符放入一个Array中。
        for(int i = 0; i < guess.length(); i++) {
            char tmp = secret.charAt(i);
            if (tmp == guess.charAt(i)) {
                bull ++;
            } else {
                arr.add(guess.charAt(i));
                if (map.containsKey(tmp))
                    map.put(tmp, map.get(tmp) + 1);
                else
                    map.put(tmp, 1);
            }
        }

        //第二次遍历，此时的array中是猜的字符串中没有对上号的字符，依次获取array中的字符，看HashMap中是否有该字符，如果有，则让"母牛数"加一，然后将该字符的次数减一，如果该字符在Map中的次数为零则清除。
        for (Character c : arr) {
            if (map.containsKey(c)) {
                cow ++;
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) map.remove(c);
            }
        }

        return  bull + "A" + cow + "B";
    }

    public String getHint1(String secret, String guess)
    {
        int bull = 0, cow = 0;

        int[] sArray = new int[10];
        int[] gArray = new int[10];

        //先遍历一次字符串，如果字符相等，公牛数加一，否则，将它们对应的数组中的次数加一。
        //第一次遍历完毕后可以得到两个数组，分别对应了两个字符串中某一个数出现的次数(匹配的字符不算)
        for(int i = 0; i < guess.length(); i++) {
            char tmp = secret.charAt(i);
            if (tmp == guess.charAt(i)) {
                bull ++;
            } else {
                sArray[tmp - '0'] ++;
                gArray[guess.charAt(i) - '0'] ++;
            }
        }

        //然后我们可以再进行一次遍历，两个数组每一个索引处的最小值相加即可得到母牛数。
        for (int i = 0; i < 10; i++) {
            cow += Math.min(sArray[i], gArray[i]);
        }

        return  bull + "A" + cow + "B";
    }
}